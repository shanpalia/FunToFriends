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

## CodeMagic
This repository includes `codemagic.yaml` for CodeMagic.
Select the repository in CodeMagic and start the Android workflow.


## App Icon
The custom Fun To Friends launcher icon is included under the Android mipmap resources and is referenced by the manifest.


### Build fix
This version removes AndroidX/AppCompat/WebKit Gradle dependencies and uses the
native Android WebView API, avoiding the dependency-resolution failure in the
previous build.


### CodeMagic billing plan
This workflow uses `mac_mini_m2`, which is available on the Codemagic individual free plan (subject to the plan's monthly free-minute allowance).


### Resource linking fix
The app now uses the platform Android Material Light theme instead of the removed
AppCompat theme, so no AppCompat dependency is required.


### Signed release build
This configuration references the existing CodeMagic Android keystore
`paliaapk-release`, signs the release APK through Gradle using Codemagic's
`CM_KEYSTORE_*` variables, and runs `apksigner verify --verbose` before
publishing the APK artifact.
