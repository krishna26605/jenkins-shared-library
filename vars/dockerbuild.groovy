def call(String Image_Name ,String Image_tag ) {
  echo "Building Image"
  sh "docker build -t ${Image_Name}: ${Image_tag} ."
}
