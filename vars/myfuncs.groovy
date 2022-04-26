package vars

def setCustomBuildId(
    buildName "#${env.BUILD_NUMBER}-${currentBuild.getBuildCauses()[0].userId}"
)
