pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for UAT environment ..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing in UAT environment ..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying in UAT to move to PROD ....'
            }
        }
    }
}
