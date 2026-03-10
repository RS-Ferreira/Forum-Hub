# ForumHub API

API REST desenvolvida em **Java com Spring Boot** para gerenciamento de tópicos de um fórum.

Este projeto foi desenvolvido como parte do **Challenge Back-End do programa Oracle Next Education (ONE) em parceria com a Alura**.

A aplicação permite criar, listar, atualizar e remover tópicos de um fórum, utilizando uma arquitetura baseada em **Spring Boot, Spring Data JPA, PostgreSQL e Spring Security**.

---

# Funcionalidades

A API possui as seguintes funcionalidades:

- Criar um novo tópico
- Listar todos os tópicos cadastrados
- Buscar um tópico específico por ID
- Atualizar um tópico existente
- Deletar um tópico

Essas funcionalidades implementam um **CRUD completo (Create, Read, Update, Delete)**.

---

# Tecnologias Utilizadas

Este projeto foi desenvolvido utilizando as seguintes tecnologias:

## Backend

- Java 23
- Spring Boot
- Spring Data JPA
- Hibernate
- Spring Security

## Banco de dados

- PostgreSQL

## Build e dependências

- Maven

## Testes de API

- Postman

---

# Arquitetura do Projeto

O projeto foi organizado seguindo uma estrutura comum em aplicações Spring Boot.

```
forumhub
│
├── src
│   └── main
│       ├── java
│       │   └── com.ronaldo.forumhub
│       │
│       │       ├── controller
│       │       │   └── TopicoController.java
│       │       │
│       │       ├── model
│       │       │   └── Topico.java
│       │       │
│       │       ├── repository
│       │       │   └── TopicoRepository.java
│       │       │
│       │       ├── security
│       │       │   └── SecurityConfig.java
│       │       │
│       │       └── ForumhubApplication.java
│       │
│       └── resources
│           └── application.properties
│
└── pom.xml
```

---

# Banco de Dados

O projeto utiliza **PostgreSQL** para persistência de dados.

## Tabela: topicos

| Campo | Tipo |
|------|------|
| id | Long |
| titulo | String |
| mensagem | String |
| curso | String |
| data_criacao | LocalDateTime |

---

# Configuração do Projeto

## 1. Criar banco de dados no PostgreSQL

Abra o terminal do PostgreSQL:

```
psql -U postgres
```

Crie o banco:

```
CREATE DATABASE forumhub;
```

---

## 2. Configurar application.properties

Arquivo:

```
src/main/resources/application.properties
```

Exemplo:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/forumhub
spring.datasource.username=postgres
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.format-sql=true
```

---

# Executando o Projeto

## 1. Clonar o repositório

```
git clone https://github.com/RS-Ferreira/forumhub.git
```

## 2. Entrar na pasta

```
cd forumhub
```

## 3. Rodar o projeto

Se estiver usando Maven:

```
./mvnw spring-boot:run
```

Ou execute diretamente pela IDE:

- IntelliJ IDEA
- VS Code
- Eclipse

Executando a classe:

```
ForumhubApplication
```

---

# Testando a API

A API pode ser testada usando **Postman**.

## Criar tópico

POST

```
http://localhost:8080/topicos
```

Body JSON:

```
{
 "titulo": "Erro no Spring",
 "mensagem": "Minha API não conecta",
 "curso": "Java"
}
```

---

## Listar tópicos

GET

```
http://localhost:8080/topicos
```

---

## Buscar tópico por ID

GET

```
http://localhost:8080/topicos/1
```

---

## Atualizar tópico

PUT

```
http://localhost:8080/topicos/1
```

Body JSON:

```
{
 "titulo": "Erro resolvido",
 "mensagem": "Consegui resolver",
 "curso": "Java"
}
```

---

## Deletar tópico

DELETE

```
http://localhost:8080/topicos/1
```

---

# Segurança

O projeto utiliza **Spring Security** para proteger os endpoints da API.

Durante o desenvolvimento é gerada automaticamente uma senha de acesso exibida no console da aplicação.

---

# Melhorias Futuras

Algumas melhorias que podem ser implementadas futuramente:

- Implementação de autenticação com JWT
- Cadastro de usuários
- Associação entre usuário e tópico
- Paginação de resultados
- Validação de dados com Bean Validation
- Testes automatizados
- Containerização com Docker

---

# Autor

**Ronaldo Ferreira**

Estudante de Ciência da Computação  
Desenvolvedor Back-End em formação

GitHub  
https://github.com/RS-Ferreira

---

# Licença

Este projeto foi desenvolvido para fins educacionais no programa **Oracle Next Education + Alura**.
