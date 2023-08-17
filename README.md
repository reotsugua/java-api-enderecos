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
   spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco_de_dados  
   spring.datasource.username=root (ou seu_usuario)  
   spring.datasource.password=     (ou sua_senha)  
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver  
   spring.jpa.hibernate.ddl-auto=update  
   
4. Execute o projeto:  
   ./mvnw spring-boot:run  

6. Cadastre um email manualmente na tabela Cliente do Banco de Dados:  
   INSERT INTO Cliente (id, email) VALUES (1, 'usuario@email.com');   
