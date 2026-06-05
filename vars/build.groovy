def call(String projectName, String dockerHubUser, String imageTag){
              sh "docker build -t ${dockerhubUser}/frontend-${projectName}:${imageTag} ./frontend"
              sh "docker build -t ${dockerhubUser}/backend-${projectName}:${imageTag} ./backend"
}
