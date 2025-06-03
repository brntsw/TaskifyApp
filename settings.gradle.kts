pluginManagement {
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

rootProject.name = "TaskifyApp"
include(":app")
include(":domain")
include(":data")
include(":core:database")
project(":core:database").projectDir = file("core/database")
include(":core:designsystem")
project(":core:designsystem").projectDir = file("core/designsystem")
include(":feature:tasklist")
project(":feature:tasklist").projectDir = file("feature/tasklist")
include(":shared:utils")
project(":shared:utils").projectDir = file("shared/utils")