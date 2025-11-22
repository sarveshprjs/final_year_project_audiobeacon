🎧 AudioBeacon — Enhancing Sound Awareness Through AI

A Final Year Project (2025) by Sarvesh Upasani, Diksha Wagh, Sneha Tambe & Tejas Sonawane

🌟 Introduction

AudioBeacon is an intelligent Android application built to assist individuals with hearing impairment by detecting environmental sounds in real time. Using TensorFlow Lite, the app listens to the surroundings, identifies sound events such as horns, alarms, sirens, and speech, and provides instant vibration feedback for important or emergency sounds.

This project was created in 2025 as the Final Year Engineering Project by
Sarvesh Upasani, Diksha Wagh, Sneha Tambe, and Tejas Sonawane.

It received outstanding appreciation from college dignitaries, professors, and evaluators.
The project was praised for its innovation, social impact, practical implementation, and excellent UI/UX design.

🎯 Project Goal

To build an AI-powered mobile assistant that helps deaf and hard-of-hearing individuals stay aware of important surrounding sounds, enhancing safety, awareness, and independence.

🚀 Features
🧠 Real-Time AI Sound Detection

Uses YAMNet (TensorFlow Lite) model

Detects:

Vehicle horns

Ambulance & emergency sirens

Alarms

Speech

Conversation

Environmental sounds

📳 Vibration Alerts

The phone vibrates automatically when an important sound like a horn or emergency siren is detected.

🌓 Beautiful Dark Themed UI

Designed using Jetpack Compose + Material 3

Clean, minimal, accessible, and user-friendly interface

▶️ Start/Stop Listening

Once the user taps START, the detection continues until STOP is pressed.

📝 Inspirational Quote

A motivational quote emphasizing empowerment for deaf individuals.

👤 Credits Footer

Displays developer names beautifully at the bottom.

🔊 More Features Section

(Optional future update screen)

Audio-to-Text

Text-to-Speech

🏗️ Tech Stack
Technology	Purpose
Kotlin	Main programming language
Android Jetpack Compose (Material 3)	UI framework
TensorFlow Lite (YAMNet)	Sound classification model
Android AudioRecord API	Microphone recording
Coroutines	Real-time sound stream processing
Vibrator API	Alert mechanism
📂 Folder Structure
audiobeaconandroid/
│
├── app/
│   ├── src/main/java/com/example/audiobeconandroid/
│   │   ├── MainActivity.kt
│   │   ├── MoreFeaturesScreen.kt (optional)
│   ├── src/main/assets/
│   │   ├── yamnet.tflite
│   │   ├── labels.txt
│   ├── src/main/res/
│   │   ├── drawable
│   │   ├── layout
│   │   ├── values
│   │   ├── mipmap (App Icons)
│   ├── AndroidManifest.xml
│   ├── build.gradle.kts
│
└── README.md

📱 How to Install the APK
1. Download the APK

Copy the APK file (e.g., AudioBeacon.apk) to your Android device.

2. Install

Open the file → Allow installation from unknown sources → Tap Install.

3. Use the App

Open AudioBeacon

Tap START to begin real-time sound detection

The screen shows detection results

Vibration automatically triggers on emergency sounds

Tap STOP to end detection

🛠️ How to Run the Project in Android Studio
Step 1 — Open

Launch Android Studio

Choose Open Existing Project

Select the audiobeconandroid folder

Step 2 — Sync Gradle

Gradle syncs automatically.
Wait for dependencies to download.

Step 3 — Run

Connect a physical Android device
OR

Create a virtual device (Emulator)

Press Run ▶

Step 4 — Permissions

Grant microphone permission when prompted.

🎓 Project Achievements

Selected as one of the best final-year projects of 2025

Appreciated by college dignitaries, staff, and evaluators

Recognized for:
✔ Social impact
✔ Strong execution
✔ Real-world usefulness
✔ High-quality UI
✔ Use of AI/ML in mobile applications

🤝 Team Members
Name	Role
Sarvesh Upasani	Lead Developer & AI Integration
Diksha Wagh	UI/UX & Documentation
Sneha Tambe	Research & Testing
Tejas Sonawane	Android Development & Optimization
💡 Future Enhancements

🔊 Flashlight alert for emergency sounds

📡 Bluetooth wearable integration

🌍 Offline language translation

🎥 Visual waveform representation

🔕 Silent-mode override alerts

📜 License

This project is created for educational and social good purposes.
Feel free to use or modify with proper credit.

❤️ Final Note

AudioBeacon showcases how technology, empathy, and innovation can come together to solve real-world problems.
Built with love, hard work, and purpose — 2025 Final Year Engineering Project.
