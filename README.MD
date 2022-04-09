This project is a libGDX Android live wallpaper template.  It's the demo application created by the libGDX code generator, remade as a live wallpaper.

This is a heavy refactor of the generated project.  Here are the differences:

* The launcher has been removed, as live wallpapers don't have launchers
* The 'core' module has been removed.  It isn't needed for live wallpapers because they aren't games - you won't be targeting multiple platforms.
* The directory structure, build scripts and related project files have been refactored to represent a standard Android Kotlin project
* This project includes a copy of the unit test templates provided by the standard Android project template

# Local Setup

* Install the Android SDK version found at `android/build.gradle` `buildToolsVersion`.
* If Android Studio doesn't create a `local.properties` in the root directory, create one.  Define a `sdk.dir` property that contains the full path to the Android SDK.

# Avoiding Pitfalls

### Version Conflicts

There's a delicate balance between:

1.  The libGDX version
2.  The Android API version
3.  The Android SDK version
4.  The `com.android.tools.build:gradle` version

LibGDX lags behind the latest Android API and SDK versions.  Their code generator creates a project with the officially supported versions, but allows you to use later versions after clicking through a warning.  The SDK version influences the `com.android.tools.build:gradle` version as well.

If you want to use AndroidX (which this project does), that's another complication to deal with, as it has its own minimum API version.

The whole situation is a big, tangled mess of conflicting requirements.  This project deviates from the officially supported libGDX configuration, but I haven't noticed any ill effects.  I make no guarantees.

When a new version of any of these things is released, you may be tempted to upgrade.  Since the libGDX project doesn't list supported configurations on their site, the only way I know to get this information is to [download their code generator](https://libgdx.com/wiki/start/project-generation) and see what the current version spits out.

# Common Issues

## Could not identify launch activity

When deploying/running/debugging the application for the first time, Android Studio might report an error in the console:

```
04/03 11:29:34: Launching 'android' on Pixel 4a API 31.
Install successfully finished in 6 s 770 ms.
Could not identify launch activity: Default Activity not found
Error while Launching activity
Failed to launch an application on all devices
```

This is from a bad Run/Debug configuration, not your project.

1. Go to `Run -> Edit Configurations -> [your app] -> Launch Options`
2. Change the `Launch` dropdown menu from `Default Activity` to `Nothing`.

(Live wallapers don't have default activities.  They're launched from the wallpaper picker).
