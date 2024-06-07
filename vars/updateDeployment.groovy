def call(String imageName, BUILD_NUMBER) {
    // Update the image in the deployment.yml file
    sh """
    sed -i 's|image: .*|image: ${imageName}:v1|g' deployment.yml
    """
}
