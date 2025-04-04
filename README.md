# 🌀 Android Activity Lifecycle Demo

This project is a simple Android application demonstrating the **Activity Lifecycle** in Android. It helps developers understand how different lifecycle callback methods are triggered as the activity goes through various states like start, pause, resume, stop, and destroy.

## 📱 Features

- Logs lifecycle method calls: `onCreate()`, `onStart()`, `onResume()`, `onPause()`, `onStop()`, `onRestart()`, `onDestroy()`
- Displays Toast messages or logs in `Logcat` for easy visualization
- Helps beginners understand the flow of an Android Activity

## 🧠 Purpose

This app is intended for educational purposes to help learners visualize the transitions between lifecycle states.

## 🏗️ How It Works

When you run the app, you'll see message on the Screen for each lifecycle method as you:

- Open the app
- Minimize or switch apps
- Return to the app


## 💡 Key Lifecycle Methods

| Method        | Description                                 |
|---------------|---------------------------------------------|
| `onCreate()`  | Called when the activity is first created   |
| `onStart()`   | Called when the activity becomes visible    |
| `onResume()`  | Called when the activity starts interacting |
| `onPause()`   | Called when the activity is partially hidden|
| `onStop()`    | Called when the activity is no longer visible |
| `onRestart()` | Called after the activity is stopped, prior to restarting |
| `onDestroy()` | Called before the activity is destroyed     |

## 🛠️ Tools & Tech

- Language: Java 
- IDE: **Android Studio**
- Min SDK: `21+`
- Target SDK: `34` (or your version)


