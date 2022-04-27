package vars

def simpleHello() {
    println 'It is msg from myfuncs'
}

def setCustomBuildId() {
    if ("${currentBuild.getBuildCauses()[0].userId}" != 'null') {
        buildName "#${env.BUILD_NUMBER}_${currentBuild.getBuildCauses()[0].userId}"
    }
}

def setCustomBuildIdInsideNode() {
    node {
        buildName "#${env.BUILD_NUMBER}-${currentBuild.getBuildCauses()[0].userId}"
    }   
}
