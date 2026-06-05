def call(String ProjectName, String ImageTag){
              sh "docker build -t frontend-${ProjectName}:${ImageTag} ./frontend"
              sh "docker build -t backend-${ProjectName}:${ImageTag} ./backend"
}
