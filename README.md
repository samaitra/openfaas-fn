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
faas-cli template pull https://github.com/openfaas-incubator/java-template
```

### Create new function

```
faas-cli new --lang java run
```
### Build function 

```
faas-cli build -f run.yml
```

### Deploy your function
```
faas-cli deploy -f run.yml

echo test | faas-cli invoke run

``` 

### Run your function 

```
curl http://127.0.0.1:8080/function/run -d "hello"
```
