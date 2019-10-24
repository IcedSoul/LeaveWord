pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "mvn package -P prod -DskipTests"
                echo 'Package Successful'
                sh "docker ps -a"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn test -P test'
                echo 'Test Successful'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'mvn clean package -P prod -DskipTests'

                echo 'Deployment Successful'
            }
        }
    }
}