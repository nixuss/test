#!groovy
// Check remote host properties
properties([disableConcurrentBuilds()])

pipeline {
    agent { 
        label 'server'
        }
    options {
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '10'))
        timestamps()
    }
    stages {
        stage("PREPARE") {
            steps {
                sh 'echo Cleaning workspace'
                cleanWs()
            }
        }
        stage("Second step") {
            steps {
                sh 'hostname'
            }
        }
    }
}
