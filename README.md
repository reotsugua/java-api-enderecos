# Projeto de API para Gerenciamento de Endereços

Este projeto é uma API para gerenciamento de endereços de clientes em um sistema de e-commerce. Utiliza Java, Spring Boot e MySQL.

## Pré-requisitos

- Java JDK 8 ou superior
- MySQL Server
- Postman (para testar as APIs)

## Configuração

1. Clone este repositório para sua máquina local:  
   Utilize Git Bash  
   git clone https://github.com/seu-usuario/seu-repositorio.git  
   
3. Configure as propriedades do banco de dados no arquivo src/main/resources/application.properties.  
   {
      
        spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco_de_dados  
        spring.datasource.username=root (ou seu_usuario)  
        spring.datasource.password=     (ou sua_senha)  
        spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver  
        spring.jpa.hibernate.ddl-auto=update  

   }
   
4. Execute o projeto:  
{

        ./mvnw spring-boot:run  

    }
   
6. Cadastre um email manualmente na tabela Cliente do Banco de Dados:
{

        INSERT INTO Cliente (id, email) VALUES (1, 'usuario@email');
   }

## Como Usar

### 1. Buscar Dados de Endereço por CEP
* URL: "api/endereco/{cep}"
* Método: GET
* Exemplo: "http://localhost:8080/api/endereco/80730360"

### 2. Adicionar Endereço a um Cliente
* URL: "api/cliente/{email}/endereco" - *O email cadastrado na parte 6 das Configurações*
* Método: POST  
    Body: {    
        
        "logradouro": "Rua das ruas",  
        "numero": "999",
        "bairro": "Centro",
        "localidade": "Curitiba",
        "uf": "PR"  
    } 

* Exemplo: "http://localhost:8080/api/cliente/usuario@email/endereco"  

### 3. Listar Endereços de um Cliente  
* URL: "api/cliente/{email}/listarendereco"
* Método: GET
* Exemplo: "http://localhost:8080/api/cliente/usuario@email/enderecos"  

## Executando Testes Unitários
* Executando os Testes:  
    Execute os testes usando uma ferramenta de build como o Maven. No terminal, navegue até o diretório raiz do seu projeto e execute o seguinte comando para executar todos os testes:  

{

    ./mvnw test
}

## Front End
#### No Front End foi utilizado HTML+Bootstrap+JavaScript

1. Após executar o projeto (Etapa 4 das configurações)
{

        ./mvnw spring-boot:run  

    }

2. E criar um email manualmente na tabela Cliente do Banco de Dados: (Etapa 6 das configurações)
{

        INSERT INTO Cliente (id, email) VALUES (1, 'usuario@email');
   }

3. Execute o arquivo "index.html" nas pasta "java-api-enderecos/front/index.html"
4. Você verá o front end funcionando com um formulário que executará a funcionalidade desta API.
