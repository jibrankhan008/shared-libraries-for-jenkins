def call(String projectName, String imageTag){
    withCredentials([usernamePassword(
        credentialsId: 'dockerHubCred',
        usernameVariable: 'dockerHubUser',
        passwordVariable: 'dockerHubPass'
    )]) {

        sh """
        echo \$dockerHubPass | docker login -u \$dockerHubUser --password-stdin
        docker tag ${projectName} \$dockerHubUser/${projectName}:${imageTag}
        docker push \$dockerHubUser/${projectName}:${imageTag}
        """
    }
}
