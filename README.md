# Projeto Spring Coursera

Este projeto foi desenvolvido como parte do desafio prático do curso **Java Development with Databases**, oferecido pela **SkillUp | Coursera**. A proposta do desafio foi desenvolver uma aplicação Full Stack utilizando Spring Boot no back-end e uma interface web para consumir a API, colocando em prática os conceitos apresentados ao longo do curso e simulando um projeto próximo de um cenário real.

## Principais aprendizados

Este projeto foi desenvolvido com o objetivo de aprofundar meus conhecimentos no desenvolvimento back-end utilizando Spring Boot. Durante a implementação foram aplicados conceitos como arquitetura em camadas, desenvolvimento de APIs REST, persistência de dados com Spring Data JPA, utilização de DTOs, validação de dados, organização do código e integração entre a aplicação e o banco de dados.

Durante o desenvolvimento, a IA **Claude** foi utilizada como ferramenta de apoio na implementação do back-end, auxiliando na compreensão de conceitos, esclarecimento de dúvidas e orientação na implementação de algumas funcionalidades. Já o desenvolvimento do front-end foi realizado integralmente com o auxílio da IA Claude, uma vez que o principal objetivo deste projeto era praticar e consolidar conhecimentos relacionados ao desenvolvimento back-end com Spring Boot.

---

## Objetivos

Este projeto foi desenvolvido com o objetivo de praticar conceitos importantes do ecossistema Spring, como:

- Desenvolvimento de APIs REST
- Persistência de dados com Spring Data JPA
- Arquitetura em camadas
- Utilização de DTOs
- Bean Validation
- Integração entre Front-end e Back-end
- Organização e boas práticas de código
- Comunicação entre cliente e servidor
- Operações CRUD

---

## Tecnologias utilizadas

### Back-end

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Maven
- Bean Validation (Jakarta Validation)

### Front-end

- HTML
- CSS
- JavaScript

---

## Funcionalidades

- Cadastro de registros
- Atualização de registros
- Exclusão de registros
- Listagem de registros
- Persistência de dados utilizando Spring Data JPA
- Integração entre Front-end e Back-end através de API REST

---

## Banco de Dados

Durante o desenvolvimento foi utilizado o banco em memória **H2 Database**.

Para acessar o console:

```
http://localhost:8080/h2-console
```

Configuração padrão:

```
JDBC URL: jdbc:h2:mem:testdb
User: sa
Password:
```

---

## Como executar

### 1. Clone o projeto

```bash
git clone https://github.com/lucaslleonardo/Projeto-SpringCoursera.git
```

### 2. Entre na pasta

```bash
cd Projeto-SpringCousera
```

### 3. Execute a aplicação

```bash
mvn spring-boot:run
```

ou execute a classe principal pelo IntelliJ.

A aplicação ficará disponível em:

```
http://localhost:8080
```

---

## Como utilizar

Após iniciar a aplicação, utilize a interface web disponibilizada pelo projeto para realizar as operações de cadastro, consulta, atualização e remoção de registros. Todas as ações realizadas na interface são processadas pela API REST desenvolvida com Spring Boot, demonstrando a comunicação entre o front-end e o back-end.

---

## Referência

Desafio desenvolvido durante o curso **Java Development with Databases**.

Plataforma: **SkillUp | Coursera**

---

## Feito por

**Lucas Leonardo**
