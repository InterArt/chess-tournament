## As a database using of Docker image

Mongo docker: https://hub.docker.com/_/mongo/

### Some docker help

#### Docker run

Specify name of running image

docker run —name {name} -d {dockerImage/container}

#### Example

docker run --name elastic -d elasticsearch

Link one docker container to another one.

docker run --link {runningInstance}:{newName} -d {dockerImage/container}

#### Example

docker run --link some-elasticsearch:elasticsearch -d kibana
docker run --name kibana --link elastic:elasticsearch -d kibana

Help Links
https://docs.docker.com/engine/reference/run/


## As a DTO Entity mapper use external libs.


Model Mapper: http://modelmapper.org/getting-started/
Map Struct: http://mapstruct.org/documentation/reference-guide/

