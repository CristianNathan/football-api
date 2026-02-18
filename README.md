# ⚽ Football API

API REST desenvolvida com Spring Boot para gerenciamento de times e jogadores de futebol.

O projeto permite cadastrar, listar, atualizar e remover jogadores e times, além de realizar buscas com filtros e paginação.

---

## 🚀 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Hibernate
- Maven

---

## 📚 Funcionalidades

### 🏟 Times
- Criar time
- Listar times
- Buscar time por ID
- Atualizar time
- Deletar time

### 👤 Jogadores
- Criar jogador
- Listar jogadores
- Buscar jogador por ID
- Atualizar jogador
- Deletar jogador
- Buscar jogadores por posição
- Buscar jogadores por nome (contendo texto)
- Paginação de jogadores
- Ordenação de resultados

---

## 🔎 Exemplos de Endpoints

### Listar jogadores com paginação
GET /players?page=0&size=10

### Buscar jogadores por posição
GET /players/posicao/Centroavante

### Buscar jogadores por nome
GET /players/nome/Yuri

### Listar com ordenação
GET /players?page=0&size=10&sort=nome,asc

---

## 🗄 Banco de Dados

O projeto utiliza PostgreSQL.

Configuração padrão:
spring.datasource.url=jdbc:postgresql://localhost:5432/football
spring.datasource.username=postgres
spring.datasource.password=*****

O Hibernate está configurado com:
spring.jpa.hibernate.ddl-auto=update

---

## ▶️ Como executar o projeto

1. Clone o repositório:
   git clone https://github.com/CristianNathan/football-api
   
3. Configure o PostgreSQL com um banco chamado `football`.

4. Execute o projeto:
   mvn spring-boot:run
   
6. Acesse:http://localhost:8080/players
   
---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com foco em prática de backend com:

- Arquitetura em camadas (Controller, Service, Repository)
- Relacionamentos JPA
- Paginação e filtros
- Integração com banco relacional

---

## 👨‍💻 Autor

Cristian






   














