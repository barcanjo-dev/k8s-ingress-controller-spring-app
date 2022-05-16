# Kubernetes Ingress Controller

This example uses a Spring Boot application to receive the requests forwarded by ingress controller

## Prepare the environment

### 1. Generate the JAR file

`cd spring-app`

`mvn package`

### 2. Build Docker image

`docker build -t k8s-ingress-controller-spring-app:1.0.0-RELEASE .`

### 3. Create spring-app deployment

`cd ..\k8s`

`kubectl apply -f .\deployment.yaml`

### 4. Create the ingress

`kubectl apply -f .\controller.yaml`

### 5. Configure your hosts file

`127.0.0.1 demo.localdev.me`

### 6. Test the application

`http://demo.localdev.me/spring-app/greetings`
