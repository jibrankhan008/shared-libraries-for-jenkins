def call(String ProjectName, String ImageTag){
              sh "docker build -t ${ProjectName}-frontend:${ImageTag} ./frontend"
              sh "docker build -t ${ProjectName}-backend:${ImageTag} ./backend"
}
