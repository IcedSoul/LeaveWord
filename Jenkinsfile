pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "mvn package -P test -DskipTests"
                echo 'Package Successful'
                sh "docker build -t icedsoul/leaveword:latest ."
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn test -P test'
                jacoco(
                        execPattern: 'target/jacoco.exec',
                        classPattern: 'target/classes',
                        sourcePattern: 'src/main/java',
                        changeBuildStatus: true,
                        minimumMethodCoverage:'1',maximumMethodCoverage:'20',
                        minimumClassCoverage:'1',maximumClassCoverage:'20'
                        )
                echo 'Test Successful'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'

                sh 'docker run -p 3307:3306 --name="leaveword-mysql" -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=leaveword --restart always -d mysql:5.6  --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci'
                sh 'docker run -p 8081:8081 --name="leaveword" --restart always -d icedsoul/leaveword'
                echo 'Deployment Successful'
            }
        }
    }

    post {
        always {
            pmd(canRunOnFailed: true, pattern: '**/target/pmd.xml')
            junit testResults: "**/target/surefire-reports/*.xml"
        }
        success {
            emailext (
                subject: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
                body: """<p>SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
                    <p>Check console output at "<a href="${env.BUILD_URL}">${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>"</p>""",
                to: "1443700905@qq.com",
                from: "guoxiaofeng_2015@163.com"
            )
        }
        failure {
            emailext (
                subject: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
                body: """<p>FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
                    <p>Check console output at "<a href="${env.BUILD_URL}">${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>"</p>""",
                to: "1443700905@qq.com",
                from: "guoxiaofeng_2015@163.com"
            )
        }
    }
}