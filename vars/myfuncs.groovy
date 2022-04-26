package vars

def setCustomBuildId(
    node {
        buildName "#${env.BUILD_NUMBER}-${currentBuild.getBuildCauses()[0].userId}"
    }
)
