pipeline {
  agent {
    node {
      label 'build'
    }
    
  }
  stages {
    stage('build') {
      steps {
        sh 'mvn clean build'
      }
    }
  }
}