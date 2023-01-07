rootProject.name = "rsoi4-deploy-to-k8s"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

include("common-api")

include("cars-api")
include("cars-service")

include("payment-api")
include("payment-service")

include("rental-api")
include("rental-service")

include("gateway-api")
include("gateway-service")
