def call(){
  sh 'rm -r node_modules'
  sh 'npm install'
  sh 'npm run build'
}
