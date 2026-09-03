pipeline {

    agent any

    tools {
        maven 'Maven3'
    }

    environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-21.0.12.1'
        PATH = "${JAVA_HOME}\\bin;${PATH}"
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    credentialsId: 'project1',
                    url: 'https://github.com/Tanshul02/MyMavenProject.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Voting Eligibility System CI/CD completed successfully!'
        }

        failure {
            echo 'Build failed. Please check the console output.'
        }
    }
}
