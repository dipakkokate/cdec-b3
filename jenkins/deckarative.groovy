
pipeline {
    agent { label 'webserver' }
    stages {
        stage('pull') {
            steps {
                echo "we are pulling from webserver"
                git 'https://github.com/dipakkokate/cdec-b3.git'
            }
        }

        stage('Build') {
            steps {
                echo "building this app usig maven"
                
            }
        }
        stage('Test') {
            steps {
                echo "testing this app using sonarqube"
                
            }
        }
        stage('Deploy') {
            steps {
                echo "deploying this app using webserver"
                
            }
        }
    }
}
