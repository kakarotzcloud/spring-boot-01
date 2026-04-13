// pipeline {
//     agent any
//     tools {
//         maven 'maven_3.9.11' 
//     }
//     stages {
//         stage('Git Checkout') {
//             steps {
//                 git branch: 'main',
//                     credentialsId: 'github_creds',
//                     url: 'https://github.com/kakarotzcloud/spring-boot-01.git'
//             }
//         }
//         stage('build spring boot') {
//             steps {
//             sh 'mvn clean package -DskipTests'
//             }
//         }
//         stage('docker build') {
//             steps{
//                 sh 'docker build -t andxroid16/spring-app:${BUILD_NUMBER}'
//             }
//         }
//         stage('docker push') {
//             steps {
//                 withCredentials([string(credentialsId: 'docker_token', variable: 'docker_pac')]) {
//                     sh 'echo ${docker_pac} | docker login -u andxroid16 --password-stdin'
//                     sh 'docker push andxroid16/spring-app:${BUILD_NUMBER}'
//                 }
//             }
//         }
//     }
// }


node{
    stage('Git Checkout 1') {
        git branch: 'main', changelog: false, credentialsId: 'github_creds', poll: false, url: 'https://github.com/kakarotzcloud/spring-boot-01.git'
    }
}
