def call(String server, String project, String imageName, String registry, String buildId, String credentialsId) {
    withCredentials([string(credentialsId: "${credentialsId}", variable: 'TOKEN')]) {
        sh """
        oc login ${server} --token=${TOKEN}
        oc project ${project}
        oc set image deployment/${imageName} ${imageName}=${registry}/${imageName}:${buildId} --namespace=${project}
        """
    }
}

