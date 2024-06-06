def call(String imageName, int buildNumber) {
    // Update the image in the deployment.yml file
    sh """
    sed -i 's|image: .*|image: ${imageName}:${buildNumber}|g' deployment.yml
    """
}
