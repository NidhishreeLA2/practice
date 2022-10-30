pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for SIT environment ..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing in SIT environment ..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying in SIT to move to UAT ....'
            }
        }
    }
}
