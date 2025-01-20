pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "NewsTalk"
include(":app")

include(":core:data")
include(":core:designsystem")
include(":core:domain")
include(":core:model")
include(":core:navigation")
include(":core:datastore")
include(":core:database")
include(":core:network")
include(":core:ui")

include(":feature:main")
include(":feature:home")
include(":feature:setting")
include(":feature:bookmark")
include(":feature:mypage")
include(":feature:home-favorite")
