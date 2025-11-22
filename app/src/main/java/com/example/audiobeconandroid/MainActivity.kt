package com.example.audiobeconandroid

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import kotlinx.coroutines.delay
import org.tensorflow.lite.task.audio.classifier.AudioClassifier

class MainActivity : ComponentActivity() {

    private lateinit var labels: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        labels = assets.open("labels.txt").bufferedReader().readLines()

        val req =
            registerForActivityResult(ActivityResultContracts.RequestPermission()) { ok ->
                if (ok) setupUI()
            }

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)
            != PackageManager.PERMISSION_GRANTED
        ) req.launch(Manifest.permission.RECORD_AUDIO)
        else setupUI()
    }

    private fun setupUI() {
        setContent {

            val DarkColors = darkColorScheme(
                background = Color(0xFF111111),
                primary = Color(0xFF6B5BFF),
                secondary = Color(0xFFD0BFFF),
                onBackground = Color.White
            )

            MaterialTheme(colorScheme = DarkColors) {

                // ✅ This makes background NOT white
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppUI(labels)
                }
            }
        }
    }
}

@Composable
fun AppUI(labels: List<String>) {

    var showMoreScreen by remember { mutableStateOf(false) }

    if (showMoreScreen) {
        MoreFeaturesScreen(onBack = { showMoreScreen = false })
        return
    }

    val context = LocalContext.current

    var isListening by remember { mutableStateOf(false) }
    var detectedSound by remember { mutableStateOf("Ready") }

    val classifier by remember { mutableStateOf(AudioClassifier.createFromFile(context, "yamnet.tflite")) }
    val recorder by remember { mutableStateOf(classifier.createAudioRecord()) }
    val tensorAudio by remember { mutableStateOf(classifier.createInputTensorAudio()) }

    val vibrator = context.getSystemService(android.content.Context.VIBRATOR_SERVICE) as android.os.Vibrator
    fun vibrate() {
        if (android.os.Build.VERSION.SDK_INT >= 26)
            vibrator.vibrate(android.os.VibrationEffect.createOneShot(600, 255))
        else vibrator.vibrate(600)
    }

    LaunchedEffect(isListening) {
        if (isListening) recorder.startRecording() else recorder.stop()

        while (isListening) {
            tensorAudio.load(recorder)
            val result = classifier.classify(tensorAudio)
            val top = result[0].categories.maxByOrNull { it.score } ?: continue

            val label = labels[top.index]
            val confidence = String.format("%.2f", top.score)
            detectedSound = "$label ($confidence)"

            if (label.contains("horn", ignoreCase = true) ||
                label.contains("siren", ignoreCase = true) ||
                label.contains("emergency", ignoreCase = true)
            ) {
                vibrate()
            }

            delay(120)
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "AudioBeacon",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFD0BFFF)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "“For those who see the world in silence,\nwe help you feel the sound.”",
            fontSize = 16.sp,
            color = Color(0xFF9BA3EB),
            fontWeight = FontWeight.Medium,
            lineHeight = 22.sp,
            modifier = Modifier.padding(horizontal = 8.dp),
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )

        Spacer(modifier = Modifier.height(28.dp))

        Text(
            text = detectedSound,
            fontSize = 34.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFFD0BFFF)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = { isListening = !isListening },
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .height(55.dp),
            shape = RoundedCornerShape(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isListening) Color(0xFFEF5A6F) else Color(0xFF6B5BFF)
            )
        ) {
            Text(
                text = if (isListening) "STOP" else "START",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        // ✅ NEW BUTTON ADDED
        Button(
            onClick = { showMoreScreen = true },
            modifier = Modifier
                .fillMaxWidth(0.6f)
                .height(50.dp),
            shape = RoundedCornerShape(40.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF9BA3EB))
        ) {
            Text("Explore More Features", fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Developed by:\nSarvesh Upasani  |  Diksha Wagh\nTejas Sonawane  |  Sneha Tambe",
            fontSize = 13.sp,
            color = Color(0xFF7B7B7B),
            lineHeight = 18.sp,
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )
    }
}



