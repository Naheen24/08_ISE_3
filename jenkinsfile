pipeline
{
  environment
  {
    registry = "naheen2001/newimage"
    registryCredential = 'ise'
    dockerImage  = ''
  }
  agent any
 
  stages
  {
    stage('Build image')
    {
      steps
      {
        script
        {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploy the image')
    {
      steps
      {
        script
        {
          docker.withRegistry( '',registryCredential )
          {
            dockerImage.push()
          }
        }
      }
    }
  }
}
