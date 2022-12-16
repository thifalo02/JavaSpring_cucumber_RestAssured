# Projeto Base para testes integrados de API

---
## Objetivo
Este projeto tem como objetivo representar uma estrutura robusta de testes de API combinando algumas ferramentas para testes como:
* Spring Boot
* RestAssured
* Cucumber
* Junit
* Allure Report
* Jackson Databind
* Awaitility
* Java 17
* Gradle 7.4

---
## Ferramentas
Para utilização deste projeto, é necessário realizar alguns pré-requisitos.
* Instalar o allure server localmente.
```
macOS:
brew install allure

Linux: 
sudo apt-add-repository ppa:qameta/allure
sudo apt-get update 
sudo apt-get install allure
```

Para executar por linha de comando.
```shell
gradle test -i -PcucumberTags="@smoke" -PspringProfiles=local
```