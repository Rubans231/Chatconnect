# ChatConnect - Basic Chatting App

ChatConnect is a simple and interactive messaging application built using Jetpack Compose and Firebase. The app allows users to register, log in, and communicate in real-time with others. This project demonstrates core concepts of Android development, such as user authentication with Firebase, navigation, and modern UI with Jetpack Compose.

# Screenshots

![Screenshot 2024-11-18 204629](https://github.com/user-attachments/assets/a79b5f43-c13c-4607-b060-4e37cac84920) ![Screenshot 2024-11-18 204656](https://github.com/user-attachments/assets/36c5d83d-38b7-4430-8bc6-d9366e46b553)![Screenshot 2024-11-18 204714](https://github.com/user-attachments/assets/aebbfa09-5759-4fb2-9c35-ca2541e4e902)
![Screenshot 2024-11-18 204858](https://github.com/user-attachments/assets/f4e02bea-dd7d-4f26-b6c4-14d9de256f0f)




## Features

Authentication: Users can register and log in using their email and password.

Real-time Messaging: Send and receive messages instantly.

User Management: Sign up, log in, and navigate between screens.

Firebase Integration: Firebase Authentication for secure sign-in and Firestore for storing messages.


## Project Structure

The project consists of the following core components:

* **AuthenticationView**: Handles user registration and login.
* **RegisterView**: User interface for new user registration.
* **LoginView**: User interface for existing users to log in.
* *HomeView**: The main chat screen, displaying real-time messages.
* **Firebase Integration**: Authentication and Firestore for data storage.
* **NavHost**: Manages navigation between different screens of the app.


## Getting Started

Follow the steps below to set up and run the project on your local machine.

### Prerequisites

Before you start, ensure that you have the following:

* Android Studio installed (latest stable version)
* A Firebase project set up for your app (get credentials and configure Firebase Authentication and Firestore)

### Installation

1. ### Clone the repository:

`git clone https://github.com/yourusername/chatconnect.git`
`cd chatconnect`

2. ### Configure Firebase:

* Create a Firebase project in the Firebase Console.
* Set up Firebase Authentication (Email/Password).
* Set up Firebase Firestore to store chat messages.
* Download the google-services.json file from Firebase and place it in the app directory of the project.

3. ### Sync Gradle dependencies:

* Open the project in Android Studio.
* Ensure that Gradle syncs properly and all dependencies are resolved.
* If you encounter issues related to dependencies (such as conflicts between xmlpull and xpp3), refer to the solution below.

## Firebase Configuration in build.gradle

Make sure you've added the Firebase plugin and necessary dependencies to your **build.gradle** files:

### Project-level build.gradle (Root)

`buildscript {`
    `repositories {`
        `google()`
        `mavenCentral()`
    `}`
    `dependencies {`
        `classpath 'com.google.gms:google-services:4.3.15'  // Add this line`
    `}`
`}`

### App-level build.gradle

`apply plugin: 'com.google.gms.google-services'  // Add this line`

`dependencies {`
    `implementation 'com.google.firebase:firebase-auth:21.0.7'`
    `implementation 'com.google.firebase:firebase-firestore:24.0.0'`
    `implementation 'com.google.firebase:firebase-analytics:20.0.3'`
`}`

## Running the App

1. Build the project in Android Studio by selecting Build > Make Project.
2. Run the app on an emulator or connected device.
3. Log in or register with a new account using the authentication screens.

## Screens

* **Authentication Screen**: Displays buttons for logging in or registering a new user.
* **Register Screen**: A form for entering the user's email and password for registration.
* **Login Screen**: A form for entering login credentials.
* **Home Screen**: The main screen where users can send and receive messages in real-time.

## Dependencies

* Jetpack Compose for building the UI.
* Firebase Authentication for user registration and login.
* Firebase Firestore for storing and retrieving messages.
* Navigation Compose for handling app navigation.

## Gradle Dependency Resolution

If you encounter dependency conflicts (e.g., xmlpull vs. xpp3), add the following configuration to your build.gradle to resolve the issue:

`configurations.all {
    resolutionStrategy {
        force 'xmlpull:xmlpull:1.1.3.1'  // Force a specific version
    }
}`

## Acknowledgments

* [Jetpack Compose](https://developer.android.com/jetpack/compose) - For building modern UI in Android.
* [Firebase](https://firebase.google.com/) - For providing authentication and cloud storage services.
* Material Design - For beautiful and functional design guidelines.

## License

This project is licensed under the MIT License - see the LICENSE file for details.
