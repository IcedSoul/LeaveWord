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
                sh 'mvn test -P test'
                echo 'Test Successful'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'mvn clean package -P prod -DskipTests'
                sh 'docker-compose build'
                sh 'docker-compose up -d'
                echo 'Deployment Successful'
            }
        }
    }
}