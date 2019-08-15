# Febo Sample Application

## Build and Deploy

Assumption: FEBO has been build before locally.

1. Configure K8S target in application-service/build.gradle
    
    ```
    feboApplication {
        repository = "401110809112.dkr.ecr.eu-central-1.amazonaws.com/camp/${project.name}:latest"
        deployImage = true
    }
    ```

    If using AWS ECR: Update login token

    ```
    $(aws ecr get-login --no-include-email --region eu-central-1)
    ```
   
 1. Deploy using (currently static yaml)
 
    ```
    kubectl create -f deploy.yaml
    ``` 
    
1. Expose endpoint

    ```
   kubectl expose deployment camp-deployment --type=LoadBalancer --name=camp-deployment
   ```
   
1. Get public address

    ```
   kubectl describe svc/camp-deployment
   ```
   
 Enjoy.