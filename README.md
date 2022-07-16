# Mochila Cheia
 API para o projeto do Hackathon FCamara - 2021 Season 1

## Use a Aplicação

Abre o link [https://squad-44-api.herokuapp.com/](https://squad-44-api.herokuapp.com/) no seu browser favorito. Você será direcionado para a página de documentação da API.

![](/.docs/images/swagger-print.PNG)

## Tecnologias utilizadas
- Java 11
- Spring Boot
- Postgresql

## Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [JDK-11](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html) e [Maven](https://maven.apache.org/download.cgi).
Além disto é bom ter um editor para trabalhar com o código como [VSCode](https://code.visualstudio.com/)

## Rodando a Aplicação na sua máquina
- Clone este repositório através do terminal ``` $ git clone https://github.com/hackathon-squad-44/api ```
- Acesse a pasta do projeto no terminal ``` $ cd api ```
- Faça o build e rode a API ``` $ mvn install ```
- Entre no diretório target ``` $ cd target/ ```
- Execute o comando para rodar a aplicação ``` $ java -jar <arquivo.jar com a versao atual> ```
- A Aplicação irá subir na seguinte URL:  [http://localhost:8080/](http://localhost:8080/)

- Em ambiente de desenvolvimento, a aplicação inclui um script que realiza uma carga inicial em um banco de dados em memória (H2). A rota base redireciona para a página de documentação da API.
