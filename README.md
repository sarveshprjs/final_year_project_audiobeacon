🎧 AudioBeacon — Enhancing Sound Awareness Through AI
<div align="center">
https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white
https://img.shields.io/badge/Kotlin-0095D5?&style=for-the-badge&logo=kotlin&logoColor=white
https://img.shields.io/badge/TensorFlow-FF6F00?style=for-the-badge&logo=tensorflow&logoColor=white
https://img.shields.io/badge/Jetpack%2520Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white

An intelligent Android application that assists individuals with hearing impairment by detecting environmental sounds in real-time

*2025 Final Year Engineering Project • Award-Winning Innovation*

</div>
🌟 Overview
AudioBeacon is a revolutionary Android application designed to bridge the awareness gap for deaf and hard-of-hearing individuals. Using advanced AI sound detection, the app identifies critical environmental sounds and provides instant haptic feedback, empowering users with greater independence and safety.

<div align="center">
https://via.placeholder.com/400x800/1a1a2e/ffffff?text=AudioBeacon+UI+Preview

"Technology that listens, so you don't have to"

</div>
🎯 Project Vision
Empowering the deaf and hard-of-hearing community through intelligent sound recognition technology, creating a safer and more accessible world.

🚀 Key Features
🧠 AI-Powered Sound Detection
Real-time Analysis: Continuous environmental monitoring using YAMNet (TensorFlow Lite)

Smart Classification: Identifies critical sounds including:

🚗 Vehicle horns & emergency sirens

🚨 Alarms (fire, security, timer)

🗣️ Speech & conversation

🌍 Environmental sounds

📳 Intelligent Alerts
Haptic Feedback: Automatic vibration patterns for different sound types

Priority System: Emergency sounds trigger immediate alerts

Customizable Settings: Adjust sensitivity and vibration intensity

🌓 Beautiful & Accessible UI
Dark Theme: Easy on eyes with Material 3 design

Jetpack Compose: Modern, fluid user experience

Accessibility First: Designed specifically for hearing-impaired users

⚡ Performance Optimized
Low Latency: Real-time processing with minimal delay

Battery Efficient: Optimized TensorFlow Lite model

Offline Capable: No internet connection required

🏗️ Technical Architecture








📱 Installation & Setup
Prerequisites
Android 8.0+ (API 26+)

Microphone permission

Minimum 2GB RAM recommended

Quick Installation
Download APK

bash
# Download the latest AudioBeacon.apk from releases
Install on Device

Enable "Install from unknown sources"

Locate and tap the APK file

Follow installation prompts

First Time Setup

Grant microphone permission when prompted

Calibrate sensitivity if needed

Tap START to begin detection

Developer Setup
bash
# Clone the repository
git clone https://github.com/audiobeacon/audiobeacon-android.git

# Open in Android Studio
# Sync Gradle dependencies
# Build and run on device/emulator
🛠️ Tech Stack
Layer	Technology	Purpose
UI	Jetpack Compose + Material 3	Modern, declarative UI framework
Language	Kotlin	Official Android development language
AI/ML	TensorFlow Lite + YAMNet	On-device sound classification
Audio	Android AudioRecord API	Real-time microphone processing
Concurrency	Kotlin Coroutines	Asynchronous sound processing
Haptics	Vibrator API	Physical feedback system
Architecture	MVVM Pattern	Clean, maintainable code structure
📁 Project Structure
text
audiobeacon-android/
├── app/
│   ├── src/main/java/com/audiobeacon/
│   │   ├── ui/
│   │   │   ├── MainActivity.kt
│   │   │   ├── components/
│   │   │   └── theme/
│   │   ├── audio/
│   │   │   ├── SoundClassifier.kt
│   │   │   └── AudioRecorder.kt
│   │   ├── domain/
│   │   │   ├── models/
│   │   │   └── repositories/
│   │   └── utils/
│   │       ├── Vibrator.kt
│   │       └── Permissions.kt
│   ├── src/main/assets/
│   │   ├── yamnet.tflite
│   │   └── labels.txt
│   ├── src/main/res/
│   │   ├── values/
│   │   ├── drawable/
│   │   └── mipmap/
│   └── AndroidManifest.xml
├── build.gradle.kts
└── README.md
🎓 Recognition & Awards
<div align="center">
🏆 Best Final Year Project 2025
⭐ Outstanding Innovation Award
❤️ Social Impact Recognition

</div>
"AudioBeacon represents the perfect blend of technical excellence and social responsibility. The team has created something truly meaningful."
— Project Evaluator, 2025

👥 Our Amazing Team
Role	Team Member	Contributions
Lead Developer & AI	Sarvesh Upasani	TensorFlow integration, model optimization, core architecture
UI/UX Designer	Diksha Wagh	Jetpack Compose design, user experience, documentation
Research & Testing	Sneha Tambe	User testing, validation, research methodology
Android Developer	Tejas Sonawane	Performance optimization, API integration, deployment
🔮 Future Roadmap
🎯 Short Term (2025)
Flashlight alerts for emergency sounds

Custom vibration patterns

Background detection mode

🚀 Medium Term (2026)
Bluetooth wearable integration

Multi-language support

Cloud sync for settings

🌟 Long Term Vision
Home automation integration

Smartwatch companion app

Global sound database

🤝 Contributing
We welcome contributions from the community! Please check our Contributing Guidelines and help us make AudioBeacon even better.

Development Setup
kotlin
// Required dependencies
dependencies {
    implementation("org.tensorflow:tensorflow-lite:2.13.0")
    implementation("androidx.compose.ui:ui:1.5.4")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")
}
📜 License
text
MIT License

Copyright (c) 2025 AudioBeacon Team

Permission is hereby granted to use, modify, and distribute this project
for educational and social good purposes with proper attribution.
🌍 Impact & Vision
<div align="center">
💡 466 million people worldwide have disabling hearing loss
📱 AudioBeacon aims to make technology accessible to all
</div>
<div align="center">
❤️ Built with Purpose
"Innovation is not just about building technology; it's about building better lives."

AudioBeacon Team 2025 • Making the world more accessible, one sound at a time.

https://via.placeholder.com/200x60/000000/ffffff?text=Coming+Soon+on+Play+Store

</div>
