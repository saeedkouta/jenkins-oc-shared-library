def call(String registry, String imageName, String buildId, String credentialsId) {
    withDockerRegistry([credentialsId: "${credentialsId}"]) {
        sh "docker push ${registry}/${imageName}:${buildId}"
    }
}

