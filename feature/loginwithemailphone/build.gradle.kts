plugins {
    id("plugin.android-common")
}

android {
    namespace = "com.puskal.loginwithemailphone"
}

dependencies {
    COMMON_THEME
    COMMON_COMPOSABLE
    DOMAIN
    DATA
    CORE
}