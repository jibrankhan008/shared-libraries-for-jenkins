def call(String projectName, String dockerHubUser, String imageTag){
              sh "docker build -t $dockerhubUser/frontend-${ProjectName}:${ImageTag} ./frontend"
              sh "docker build -t $dockerhubUser/backend-${ProjectName}:${ImageTag} ./backend"
}
