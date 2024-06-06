def call(String imageName, BUILD_NUMBER) {
    // Update the image in the deployment.yml file
    sh """
    sed -i 's|image: .*|image: ${imageName}:${BUILD_NUMBER}|g' deployment.yml
    """
}
