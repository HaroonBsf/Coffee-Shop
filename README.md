# Coffee Shop

A Coffee Shop app built with Kotlin, with some Java, and Firebase, focused on UI design, created as a quick project to test item addition to the cart functionality.

- **APK File:** Download the latest `APK` file of this project and provide feedback 😃. [Download APK](https://github.com/HaroonBsf/Coffee-Shop/releases/download/v1.0.0/coffeeshop-1.0.0.apk)

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

```
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
    - Download the provided [database_firebase.json](https://github.com/HaroonBsf/Coffee-Shop/releases/download/v1.0.0/database_firebase.json) file.
    - Go to the Firebase Realtime Database in the console.
    - Click on the three dots in the upper right corner and select Import JSON.
    - Choose the `database_firebase.json` file and import it to populate the database with initial data.

#### 4. Configure Firebase for Android

1. Create an Android App in Firebase:
    - In the Firebase console, go to **Project settings**.
    - Under "Your apps," select **Add app** and choose **Android**.
    - Enter your package name (e.g., com.yourname.coffeeshopapp).
2. Download and Add `google-services.json:`
    - Follow the on-screen instructions in Firebase to download the google-services.json file.
    - Place it in your project’s `/app` directory.
3. Add SHA-1 Key:
    - Run the following command to get your SHA-1 key:
      
      ```
      keytool -exportcert -list -v -alias androiddebugkey -keystore ~/.android/debug.keystore
      ```
    - In the Firebase console, under the Android app settings, add your SHA-1 key by clicking "Add Fingerprint."

#### 5. Add Dependencies
  - Check and add the latest versions of the necessary dependencies for Firebase Realtime Database, Lifecycle (extensions, ViewModel, LiveData, runtime), Glide, and Gson to your project.
  - For detailed instructions on setting up Firebase Realtime Database dependencies, refer to the [Firebase Realtime Database Setup Guide](https://firebase.google.com/docs/database/android/start).
  - Ensure View Binding is enabled. If not, add the following inside the `android` block in your `build.gradle` file (Module: app):
    
    ```
    buildFeatures{
        viewBinding = true
    }
    ```
  - Sync your project with Gradle to ensure all dependencies are correctly added.

#### 6. Final Step
  - Build and run the app on your Android device or emulator.

## Questions?🤔

💬 Hit me up at

<a href="https://www.linkedin.com/in/haroonbsf/"><img src="https://user-images.githubusercontent.com/35039342/55471530-94b34280-5627-11e9-8c0e-6fe86a8406d6.png" width="60"></a>
- Or, open an issue on this repository!

## License

```
MIT License

Copyright (c) 2024 Haroon Majeed

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
