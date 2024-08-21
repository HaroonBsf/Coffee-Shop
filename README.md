# Coffee Shop

A Coffee Shop app built with Kotlin, with some Java, and Firebase, focused on UI design, created as a quick project to test item addition to the cart functionality.

- **APK File:** Download the latest `APK` file of this project and provide feedback 😃. [Download APK]()

## Note
This repository is currently under development, with ongoing plans to add more backend features and enhancements.

## Features

 * **Premium UI:** Visually appealing, user-friendly, and attractively designed interface for an enhanced user experience.
 * **Popular Coffees:**
   * Users can check coffee ratings.
   * Users can select coffee sizes.
   * Users can add their favorite coffee to the cart.
 * **Cart Screen:**
   * View all items added to the cart with individual prices.
      * Check the subtotal price of all items.
      * Check the delivery charges applied to the order.
      * Can check the total tax on items.
      * Check the total price for the entire order.

## Screenshots

<div align="center">
  <img src="https://github.com/user-attachments/assets/904d77b1-78f1-41b5-ab43-f6c1e6934bd8" width="200" alt="Coffee Shop Image">
  <img src="https://github.com/user-attachments/assets/7dd2f990-ee7f-4f17-a626-b9ef1cf19a52" width="200" alt="Coffee Shop Image">
  <img src="https://github.com/user-attachments/assets/7595290a-7b03-4962-9291-9c10039a0f92" width="200" alt="Coffee Shop Image">
  <img src="https://github.com/user-attachments/assets/7ade6963-ef29-434e-b9ed-559ffaf7b376" width="200" alt="Coffee Shop Image">
  <br>
</div>

## Getting Started

#### 1. [Setup Android Studio](https://developer.android.com/studio)

#### 2. Clone the Repo

```sh
$ git clone https://github.com/HaroonBsf/Coffee-Shop
$ cd Coffee-Shop/
```

#### 3. Setup Firebase Realtime Database

1. Create a Firebase Project:
    - Go to the [Firebase Console](https://console.firebase.google.com/) and create a new project.
2. Enable Firebase Realtime Database:
    - In your Firebase project console:
      - Click on Realtime Database from the left-hand menu.
      - Click on "Create Database."
      - Choose "Start in test mode" for initial setup and click "Enable."
3. Add Data to Realtime Database:
    - Download the provided [database_firebase.json]() file.
    - Go to the Firebase Realtime Database in the console.
    - Click on the three dots in the upper right corner and select Import JSON.
    - Choose the `database_firebase.json` file and import it to populate the database with initial data.

#### 4. Configure Firebase for Android

1. Create an Android App in Firebase:
    - In the Firebase console, go to **Project settings**.
    - Under "Your apps," select **Add app** and choose **Android**.
    - Enter your package name (e.g., `com.yourname.coffeeshopapp`).
2. Download and Add `google-services.json:`
    - Follow the on-screen instructions in Firebase to download the `google-services.json` file.
    - Place it in your project’s `/app` directory.
3. Add SHA-1 Key:
    - Run the following command to get your SHA-1 key:
      <br>
      ```sh
      keytool -exportcert -list -v -alias androiddebugkey -keystore ~/.android/debug.keystore
      ```
    - In the Firebase console, under the Android app settings, add your SHA-1 key by clicking "Add Fingerprint."

#### 5. Add Dependencies
  - Add Firebase Realtime Database dependencies to your project. For detailed instructions on setting up dependencies, refer to the [Firebase Realtime Database Setup Guide](https://firebase.google.com/docs/database/android/start).
  - Enable View Binding by adding the following inside the `android` block in your build.gradle file (Module: app):
    ```sh
    buildFeatures{
        viewBinding = true
    }
    ```
  - Sync your project with Gradle to ensure all dependencies are correctly added.

#### 6. Final Step
  - Build and run the app on your Android device or emulator.
  
## License
[MIT License](LICENSE)
