pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "mvn package -P dev -DskipTests"
                echo 'Package Successful'
                sh "docker build -t icedsoul/leaveword:latest ."
                sh "docker push icedsoul/leaveword:latest"
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
                sh "docker stop leaveword"
                sh "docker rm leaveword"
                sh "docker rmi icedsoul/leaveword"
                sh 'docker run -p 3307:3306 --name="leaveword-mysql" -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=leaveword --restart always -d mysql:5.6  --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci'
                sh 'docker run -p 8081:8081 --name="leaveword" --restart always -d icedsoul/leaveword'
                echo 'Deployment Successful'
            }
        }
    }
}