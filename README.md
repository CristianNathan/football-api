# ⚽ Football API

API REST desenvolvida com **Spring Boot** para gerenciamento de times e jogadores de futebol.
O projeto permite cadastrar, listar, atualizar e remover jogadores e times, além de realizar buscas com filtros e paginação — com **autenticação e autorização via JWT**.

---

## 🚀 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- PostgreSQL
- Hibernate
- Maven
- Postman

---

## 🔐 Autenticação e Autorização

O projeto utiliza **JWT + Spring Security** para proteger os endpoints.

### Fluxo de autenticação:

1. **Registre um usuário** em `POST /auth/register`, informando nome, senha e role (`USER` ou `ADMIN`)
2. **Faça login** em `POST /auth/login` com suas credenciais
3. Um **token JWT** será retornado
4. Use o token no header de todas as requisições protegidas:

```
Authorization: Bearer <seu_token_aqui>
```

### Roles disponíveis:
| Role | Permissões |
|------|-----------|
| `USER` | Leitura (GET) |
| `ADMIN` | Leitura e escrita (GET, POST, PUT, DELETE) |

---

## 📚 Funcionalidades

### 🔑 Autenticação
- Registrar usuário (com escolha de role)
- Login e geração de token JWT

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

### Autenticação

#### Registrar usuário
```http
POST /auth/register
Content-Type: application/json

{
  "nome": "Cristian",
  "senha": "123456",
  "role": "ADMIN"
}
```

#### Login
```http
POST /auth/login
Content-Type: application/json

{
  "nome": "Cristian",
  "senha": "123456"
}
```
**Resposta:**
```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}
```

---

### Jogadores (requer token)

#### Listar jogadores com paginação
```http
GET /players?page=0&size=10
Authorization: Bearer <token>
```

#### Buscar jogadores por posição
```http
GET /players/posicao/Centroavante
Authorization: Bearer <token>
```

#### Buscar jogadores por nome
```http
GET /players/nome/Yuri
Authorization: Bearer <token>
```

#### Listar com ordenação
```http
GET /players?page=0&size=10&sort=nome,asc
Authorization: Bearer <token>
```

---

## 🗄 Banco de Dados

O projeto utiliza **PostgreSQL**.

Configuração padrão:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/football
spring.datasource.username=postgres
spring.datasource.password=*****
spring.jpa.hibernate.ddl-auto=update
```

---

## ▶️ Como executar o projeto

1. Clone o repositório:
```bash
git clone https://github.com/CristianNathan/football-api
```

2. Configure o PostgreSQL com um banco chamado `football`

3. Configure as variáveis no `application.properties`:
```properties
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
api.security.token.secret=seu_secret_jwt
```

4. Execute o projeto:
```bash
mvn spring-boot:run
```

5. Acesse: `http://localhost:8080`

---

## 🧪 Testes

Os endpoints foram testados utilizando **Postman** para validação de:
- Registro e login com geração de token
- Requisições autenticadas com Bearer Token
- Requisições GET, POST, PUT e DELETE
- Paginação e ordenação dinâmica
- Filtros por nome e posição
- Controle de acesso por role (USER / ADMIN)

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido com foco em prática de backend com:
- Autenticação e autorização com **JWT + Spring Security**
- Controle de acesso por **roles (USER/ADMIN)**
- Arquitetura em camadas (Controller, Service, Repository)
- Relacionamentos JPA
- Paginação e filtros
- Integração com banco relacional

---

## 👨‍💻 Autor

**Cristian Nathan**  
[GitHub](https://github.com/CristianNathan)
