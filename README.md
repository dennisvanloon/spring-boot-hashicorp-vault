# Using Hashicorp Vault secrets in a Spring Boot Application

## Installing Vault CLI
Install the Vaul CLI using brew
```
brew install vault
```
Verify the installation is working using for instance:
```
vault -help
vault -version
```

## Run a Vault using Docker
Start a docker with a vault using the command
```
docker run --cap-add=IPC_LOCK -p 8200:8200 -d --name=dev-vault hashicorp/vault
```

Set an environment variable for the CLI pointing to the docker container
```
export VAULT_ADDR='http://127.0.0.1:8200'
```

Retrieve the root token from the logs of the container (get the container using docker ps)
```
docker logs <container-id>
```

## Use the CLI on the Vault
Login on the Vault, check the status and create a few secrets
```
vault login <root.token>
vault status -format=json
vault kv put secret/spring-boot-hashicorp-vault example.username=demouser example.password=demopassword
vault kv put secret/spring-boot-hashicorp-vault/cloud example.username=clouduser example.password=cloudpassword    
```


