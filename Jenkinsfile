pipeline {
    agent any

    environment {
        REPO_URL = 'https://github.com/nxf1ve/matrix-app.git'
        BRANCH = 'master'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: "${REPO_URL}", branch: "${BRANCH}"
            }
        }

        stage('Build Project') {
            steps {
                script {
                    // Компилируем и упаковываем оба модуля
                    sh 'mvn -f pom.xml clean package'
                }
            }
        }

        stage('Build Docker Images') {
            steps {
                script {
                    // Собираем Docker-образы для server и client
                    sh 'docker build -t matrix-app-server ./server'
                    sh 'docker build -t matrix-app-client ./client'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Запускаем Docker Compose для развёртывания
                    sh 'docker-compose up -d'
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
