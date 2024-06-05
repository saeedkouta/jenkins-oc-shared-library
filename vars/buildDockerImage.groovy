def call(String registry, String imageName, String buildId) {
    docker.build("${registry}/${imageName}:${buildId}")
}

