pipeline {
    agent any
    stages(){
        stage('clone repository'){
        steps {
	    sh "printenv"
            sh "mvn clean compile"
           }
        }
        stage('Test'){
            steps{
                sh "mvn test"
            }
        }
        stage('deploy'){
            steps{
                sh "mvn package"
            }
        }
        stage('archiving'){
                    steps{
                        archiveArtifacts "**/target/*.jar"
                    }
                }
    }
}
