pipeline {
    agent any
    stages {
        stage('Verify Browsers are installed') {
            steps {
                sh 'firefox --version'
            }
        }
        stage('Run tests') {
            steps {
                sh './mvnw clean package'
            }
        }
    }
}