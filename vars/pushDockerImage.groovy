def call(String registry, String imageName, String buildId, String credentialsId) {
    docker.withRegistry("https://${registry}", credentialsId) {
        docker.image("${registry}/${imageName}:${buildId}").push()
    }
}

