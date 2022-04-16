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
        stage("First step") {
            steps {
                sh 'hostname -i'
            }
        }
        stage("Second step") {
            steps {
                sh 'hostname'
            }
        }
    }
}
