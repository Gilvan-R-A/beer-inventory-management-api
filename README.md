<h1 align="center">
   Beer Inventory Management API
</h1>   

## Visão Geral do Projeto   

O **Beer Inventory Management API** é uma aplicação desenvolvida em **Java** com **Spring Boot**. O sistema tem como objetivo gerenciar o cadastro e controle de estoque de cervejas. Ele permite registrar novas cervejas, consultar o estoque, atualizar a quantidade e excluir produtos, além de garantir a integridade das informações com validações específicas e uma documentação da API via **Swagger**.   

## 2. Funcionalidades   

O sistema oferece as seguintes funcionalidades principais:

- **Cadastro de Cervejas:** Permite o registro de novas cervejas no estoque.
- **Consulta de Cervejas:** Consulta e exibe as informações das cervejas cadastradas no sistema.
- **Atualização de Estoque:** Atualiza a quantidade disponível de uma cerveja no estoque.
Exclusão de Cervejas: Remove uma cerveja do estoque.
- **Validação de Dados:** As entradas são validadas para garantir que as operações sigam as regras de negócio definidas.
- **Documentação Swagger:** Interface interativa para visualizar e testar os endpoints da API.   

## 3. Tecnologias Utilizadas   

- **Java 11**: Linguagem de programação utilizada para o desenvolvimento.
- **Spring Boot 2.7.1**: Framework para criação de aplicações Java com foco em produtividade e facilidade de configuração.
- **Spring Data JPA**: Para gerenciamento de persistência e interação com o banco de dados.
- **H2 Database**: Banco de dados em memória utilizado para desenvolvimento e testes.
- **Swagger**: Ferramenta para documentação interativa da API.
- **Lombok**: Biblioteca para reduzir o código boilerplate.
- **MapStruct**: Framework para mapeamento de objetos (DTOs e entidades).   

## 4. Estrutura do Projeto   

O projeto segue uma estrutura de diretórios organizada para manter a separação clara entre a configuração, a lógica de negócios, os testes e a documentação da API. Abaixo está a estrutura detalhada:   

```   
EstoqueCerveja/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── one/digitalInnovation/EstoqueCerveja/
│   │   │       ├── config/
│   │   │       │   └── SwaggerConfig.java
│   │   │       ├── controller/
│   │   │       │   ├── BeerController.java
│   │   │       │   └── BeerControllerDocs.java
│   │   │       ├── dto/
│   │   │       │   ├── BeerDTO.java
│   │   │       │   └── QuantityDTO.java
│   │   │       ├── entity/
│   │   │       │   └── Beer.java
│   │   │       ├── enums/
│   │   │       │   └── BeerType.java
│   │   │       ├── exception/
│   │   │       │   ├── BeerAlreadyRegisteredException.java
│   │   │       │   ├── BeerNotFoundException.java
│   │   │       │   └── BeerStockExceededException.java
│   │   │       ├── mapper/
│   │   │       │   └── BeerMapper.java
│   │   │       ├── repository/
│   │   │       │   └── BeerRepository.java
│   │   │       ├── service/
│   │   │       │   └── BeerService.java
│   │   │       └── EstoqueCervejaApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       ├── java/
│       │   └── one/digitalInnovation/EstoqueCerveja/
│       │       ├── builder/
│       │       │   └── BeerDTOBuilder.java
│       │       ├── controller/
│       │       │   └── BeerControllerTest.java
│       │       ├── service/
│       │       │   └── BeerServiceTest.java
│       │       └── utils/
│       │           └── JsonConvertionUtils.java
│       └── EstoqueCervejaApplicationTests.java
├── pom.xml
```   

## 4.2. Descrição dos Diretórios e Arquivos   

- src/main/java/one/digitalInnovation/EstoqueCerveja:

   - **config/SwaggerConfig.java**: Configuração do Swagger para a documentação da API.
   - **controller/BeerController.java**: Controlador que gerencia as operações relacionadas às cervejas.
   - **controller/BeerControllerDocs.java**: Controlador que fornece os endpoints da API para visualização no Swagger.
   - **dto/BeerDTO.java**: Objeto de transferência de dados para a cerveja.
   - **dto/QuantityDTO.java**: DTO usado para representar a quantidade de cervejas.
   - **entity/Beer.java**: Entidade JPA que representa a cerveja no banco de dados.
   - **enums/BeerType.java**: Enum que define os tipos de cervejas (por exemplo, LAGER, IPA).
   - **exception/**: Contém exceções personalizadas para o projeto, como BeerAlreadyRegisteredException.
   - **mapper/BeerMapper.java**: Mapeador que converte objetos Beer para BeerDTO e vice-versa.
   - **repository/BeerRepository.java**: Interface para interação com o banco de dados.
   - **service/BeerService.java**: Lógica de negócios que gerencia as operações sobre as cervejas.
   - **EstoqueCervejaApplication.java**: Classe principal do Spring Boot que inicia a aplicação.
- **src/main/resources/application.properties**: Contém configurações da aplicação, como conexões de banco de dados e outras propriedades.

- **src/test/java/one/digitalInnovation/EstoqueCerveja**:

   - **builder/BeerDTOBuilder.java**: Classe auxiliar usada para criar objetos de teste BeerDTO.
   - **controller/BeerControllerTest.java**: Testes automatizados para o controlador BeerController.
   - **service/BeerServiceTest.java**: Testes para a camada de serviço BeerService.
   - **utils/JsonConvertionUtils.java**: Utilitário usado para conversão de objetos para JSON nos testes.
- **EstoqueCervejaApplicationTests.java**: Classe que contém os testes de inicialização da aplicação.

## 4.3. Arquivos Importantes   

- **SwaggerConfig.java**: Configurações necessárias para habilitar a documentação interativa da API com o Swagger.
- **application.properties**: Arquivo de configuração do Spring Boot que define as propriedades da aplicação, como configurações do banco de dados e do Swagger.
- **BeerController.java**: Controlador que expõe os endpoints da API.
- **BeerDTO.java**: DTO utilizado para transferir dados de cervejas de forma segura entre as camadas da aplicação.
- **BeerService.java**: Serviço que contém a lógica de negócio para operações de CRUD sobre as cervejas.   

## 5. Como Rodar o Projeto   

**1. Clone o repositório:**   

```   
git clone https://github.com/Gilvan-R-A/beer-inventory-management-api.git
```   

**2. Entre na pasta do projeto:**   

```  
cd EstoqueCerveja
```   

**3. Compile e execute a aplicação com o Maven:**   

```   
mvn spring-boot:run
```   

4. A API estará disponível em **http://localhost:8080**   


## 6. Como Testar a API   

**1. Rodar os Testes Automatizados:**   
Execute os testes com o comando:   

```   
mvn test
```   

**2. Acessar a documentação Swagger:**   

Após a aplicação estar em funcionamento, você pode acessar a documentação interativa da API em:   

```   
http://localhost:8080/swagger-ui.html
```   
