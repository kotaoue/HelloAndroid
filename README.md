# HelloAndroid

Android app development study repository.

## Requirements

- macOS
- [Android Studio](https://developer.android.com/studio)
- Java Development Kit (JDK) 11 or later

## Installation

### 1. Install Homebrew

If you haven't installed [Homebrew](https://brew.sh/) yet:

```sh
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

### 2. Install Android Studio

Install Android Studio using Homebrew Cask:

```sh
brew install --cask android-studio
```

Alternatively, download it directly from the [official site](https://developer.android.com/studio).

### 3. Initial Setup of Android Studio

1. Launch Android Studio.
2. Follow the **Setup Wizard** to install the Android SDK, build tools, and an emulator image.
3. Accept all SDK licenses when prompted.

### 4. Configure Environment Variables

Add the Android SDK path to your shell configuration file (`~/.zshrc` or `~/.bash_profile`):

```sh
export ANDROID_HOME=$HOME/Library/Android/sdk
export PATH=$PATH:$ANDROID_HOME/tools
export PATH=$PATH:$ANDROID_HOME/tools/bin
export PATH=$PATH:$ANDROID_HOME/platform-tools
```

Reload the configuration:

```sh
source ~/.zshrc
```

Verify `adb` is available:

```sh
adb version
```

### 5. Create an Android Virtual Device (AVD)

1. Open Android Studio.
2. Go to **Device Manager** (from the main toolbar or **Tools > Device Manager**).
3. Click **Create Device** and follow the wizard to set up an emulator.

## Projects

| Directory | Description |
|-----------|-------------|
| [helloworld](./helloworld) | Minimal Hello World Android app |
