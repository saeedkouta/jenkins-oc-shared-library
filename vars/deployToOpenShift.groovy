#!/usr/bin/env groovy

//OpenShiftCredentialsID can be credentials of service account token or KubeConfig file 
def call(String OpenShiftCredentialsID, String openshiftClusterurl, String openshiftProject, String imageName) {
            sh """
        oc login --server=${openshiftClusterurl} --token=${OpenShift_CREDENTIALS} --insecure-skip-tls-verify
        oc project ${project}
        oc apply -f deployment.yml
        oc apply -f service.yml
        """

    }
