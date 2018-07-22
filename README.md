# openfaas-fn
A collection of functions that can be deployed and scaled at 0-N-0 using OpenFaaS

### Pre-requisites:

Docker CE 17.05 or later (for use on Swarm)
Bash - if you're using Windows then install Git bash
Brew (optional)

### Install OpenFaaS

```
$ git clone https://github.com/openfaas/faas
```
#### Initialize Swarm mode on your Docker daemon.

```
$ docker swarm init
```
#### Deploy the Faas stack and sample functions

```
$ cd faas
$ ./deploy_stack.sh
```

### Install Faas cli 

```
$ brew install faas-cli

or 

$ curl -sSL https://cli.openfaas.com | sudo sh

```

### Get the java template 

```
$ faas-cli template pull https://github.com/openfaas-incubator/java-template
```

### Create new function

```
$ faas-cli new --lang java run
```
### Build function 

```
$ faas-cli build -f run.yml
```

### Deploy your function
```
$ faas-cli deploy -f run.yml

$ echo test | faas-cli invoke run

``` 

### Run your function 

```
$ curl http://127.0.0.1:8080/function/run -d "hello"
```


### Deploy function with Play with Docker

```

Open  https://labs.play-with-docker.com/ and start a new session. 

Click "Add New Instance" to create a single Docker host (more can be added later)
```

 ### Setup a Docker Swarm master node and deploy OpenFaaS
 
 ```
 $ docker swarm init --advertise-addr eth0 && \
   git clone https://github.com/openfaas/faas && \
   cd faas && \
   git checkout 0.8.0 && \
   ./deploy_stack.sh && \
   docker service ls

```

### Install Faas cli 

```
$ curl -sSL https://cli.openfaas.com | sudo sh
```

### Get the java template 

```
$ faas-cli template pull https://github.com/openfaas-incubator/java-template
```

### Create new function

```
$ faas-cli new --lang java run
```
### Build function 

```
$ faas-cli build -f run.yml
```

### Deploy your function
```
$ faas-cli deploy -f run.yml

$ echo test | faas-cli invoke run
``` 

### Run your function 

```
$ curl http://127.0.0.1:8080/function/run -d "hello"
```

### List your functions

```
$ faas-cli list
```

### Check services deployed

```
$ docker stack ls

$ docker stack ps func
```