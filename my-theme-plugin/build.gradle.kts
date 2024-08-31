plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.1.0"

fleetPlugin {

    // STEP 1: chose an ID for your plugin, it must be unique
    //
    id = "shadesmear.theme.dark"

    // STEP 2: set up the sensible metadata for your plugin
    metadata {
        readableName = "ShadeSmear Dark Theme"
        description = "A dark mellow color scheme for Fleet"
    }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}
