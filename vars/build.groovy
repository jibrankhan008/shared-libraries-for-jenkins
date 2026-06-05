def call(String projectName, String dockerHubUser, String imageTag){
              sh "docker build -t ${dockerHubUser}/frontend-${projectName}:${imageTag} ./frontend"
              sh "docker build -t ${dockerHubUser}/backend-${projectName}:${imageTag} ./backend"
}
