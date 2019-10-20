pipeline {
    agent any

    tools {
        maven 'mvn-3.6.2'
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
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}