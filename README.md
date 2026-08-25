# Fun To Friends Android Wrapper

This project packages the website as an Android WebView application.

## Website
https://www.callbomberz.in/

## Important
The wrapper intentionally blocks direct navigation to call/SMS bombing action pages.
It is intended for the site's general/safe pages such as Home, About, Contact,
Protection and legal/information pages.

## Change the website
Edit `HOME_URL` in:
`app/src/main/java/in/callbomberz/safe/MainActivity.java`

## Build on GitHub
1. Create a new GitHub repository.
2. Upload all files from this folder.
3. Push to the `main` branch.
4. Open **Actions**.
5. Open **Build Android APK**.
6. Download the `Fun-To-Friends-debug-apk` artifact.

For a Play Store release, generate a properly signed AAB with your own
keystore and release configuration.