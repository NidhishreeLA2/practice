pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for DEV environment ..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing in DEV environment ..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying in DEV to move to SIT ....'
            }
        }
    }
}
