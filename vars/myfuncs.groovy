package vars

def setCustomBuildId() {
    println 'It is msg from myfuncs'
    buildName "#${env.BUILD_NUMBER}-${currentBuild.getBuildCauses()[0].userId}"
}
