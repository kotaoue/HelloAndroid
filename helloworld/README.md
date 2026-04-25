# helloworld

A minimal Android Hello World app built with Kotlin.

## Features

- Displays "Hello, World!" in the center of the screen
- Built with Kotlin and the standard Android View system
- Uses Material Design theme

## Requirements

- Android Studio (Hedgehog or later recommended)
- Android SDK with API level 24 or higher
- JDK 11 or later

## How to Run

### Using Android Studio

1. Open Android Studio and select **Open** (or **File > Open**).
2. Navigate to this directory (`helloworld/`) and click **OK**.
3. Wait for the Gradle sync to complete.
4. Select a device or emulator from the **Device Manager**.
5. Click the **Run** button (▶) or press `Shift + F10`.

### Using the Command Line

```sh
# Build a debug APK
./gradlew assembleDebug

# Install on a connected device or running emulator
./gradlew installDebug

# Run unit tests
./gradlew test
```

## Project Structure

```
helloworld/
├── app/
│   └── src/
│       ├── main/
│       │   ├── java/com/example/helloworld/
│       │   │   └── MainActivity.kt       # Main activity
│       │   ├── res/
│       │   │   ├── layout/
│       │   │   │   └── activity_main.xml # Layout with "Hello, World!" text
│       │   │   └── values/
│       │   │       ├── colors.xml
│       │   │       ├── strings.xml
│       │   │       └── themes.xml
│       │   └── AndroidManifest.xml
│       ├── androidTest/                  # Instrumented tests
│       └── test/                         # Unit tests
├── build.gradle.kts
├── settings.gradle.kts
└── gradle/
    └── libs.versions.toml                # Dependency version catalog
```

## Expected Output

When the app is launched, the screen will display:

```
Hello, World!
```
