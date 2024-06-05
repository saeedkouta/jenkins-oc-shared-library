def call(String openshiftServer, String project, String imageName, String registry, String buildId, String credentialsId) {
    withCredentials([string(credentialsId: credentialsId, variable: 'OPENSHIFT_TOKEN')]) {
        sh "oc login ${openshiftServer} --token=${OPENSHIFT_TOKEN}"
        sh "oc project ${project}"
        sh "oc set image dc/${imageName} ${imageName}=${registry}/${imageName}:${buildId}"
    }
}

