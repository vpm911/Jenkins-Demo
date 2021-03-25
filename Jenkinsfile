pipeline {
  agent any
  stages {
    stage('Checkout') {
      agent any
      steps {
        echo 'Checkout'
        git(url: 'https://github.com/vpm911/Jenkins-Demo.git', branch: 'master')
      }
    }

    stage('Build') {
      steps {
        echo 'Build'
        sh 'mvnw install'
      }
    }

  }
}