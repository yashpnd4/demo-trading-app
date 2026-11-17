pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "tradingapp"
include(":app")
include(":core:common")
include(":core:network")
include(":core:database")
include(":core:designsystem")
include(":core:security")
include(":feature:home")
include(":feature:navigation")
include(":feature:markets")
include(":feature:watchlist")
include(":feature:charts")
include(":feature:stockdetails")
include(":feature:trading")
include(":feature:orders")
include(":feature:portfolio")
include(":feature:options")
include(":feature:strategies")
include(":feature:backtesting")
include(":feature:alerts")
include(":feature:settings")
