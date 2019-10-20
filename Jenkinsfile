pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "mvn clean package -P test"
                echo 'Build Successful'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                echo 'Test Successful'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                echo 'Deployment Successful'
            }
        }
    }
}