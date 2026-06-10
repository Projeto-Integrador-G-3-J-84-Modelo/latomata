# 🥗 Latomata
###  API REST para gerenciamento de produtos de alimentação saudável

<div align="center">

![Status](https://img.shields.io/badge/status-em%20desenvolvimento-blue)
![Backend](https://img.shields.io/badge/backend-Java%20%7C%20Spring%20Boot-red)
![Backend](https://img.shields.io/badge/backend-Java%20%7C%20Spring%20Boot%20Security-purple)
![Banco de Dados](https://img.shields.io/badge/database-MySQL-orange)
![API](https://img.shields.io/badge/API-REST-green)
![Versionamento](https://img.shields.io/badge/versionamento-Git%20%26%20GitHub-black)

</div>

---

# 👥 Equipe do Projeto

<div align="center">

| 👨‍💻 Integrante | 🎯 Função | 💼 LinkedIn | 🐙 GitHub |
|---|---|---|---|
| **Dayana Barbosa** | Scrum Master | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/dayanabarbosa-devjava/) | [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)]( https://github.com/Day-Barbosa) |
| **Jessica Aquino** | Product Owner (PO) | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jessica-aquino-lobo-/) | [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Jessica-Aquino-hub) |
| **Carolina Perpetuo** | Desenvolvedora Backend | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/carolinaperpetuo/) | [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/CarolinaPerpetuo) |
| **Igor Nascimento** | Desenvolvedora Backend |[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/igornascimentodev/) | [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/xXAshbornXx) |
| **Raissa Feitosa** | Desenvolvedora Backend | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/raissa-santos-feitosa-73485b1a3/) | [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/raissa-sf) |
| **Renan Ferreira** | Desenvolvedor Backend | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/renan-ferreira-cunha/) | [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Renanferrcun) |
| **Luana Porto** | Tester / QA |[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/luanamoreiraporto/) | [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/lunnie-porto) |

</div>

---

# 📌 Sobre o Projeto

A **LaTomata** é uma API REST desenvolvida para gerenciamento de produtos voltados ao segmento de alimentício.

O projeto foi criado com foco em organização, padronização e escalabilidade, utilizando Java e Spring Boot para construção de uma aplicação backend estruturada em arquitetura em camadas.

A API permite operações de gerenciamento de produtos, categorias e usuários através de endpoints REST, seguindo boas práticas de desenvolvimento e versionamento.



---

# 🚀 Objetivos da Solução

<div align="center">

| 🎯 Objetivo | 📌 Benefício |
|---|---|
| Organizar o gerenciamento de produtos | Centralização das informações |
| Facilitar operações CRUD | Manipulação eficiente dos dados |
| Garantir padronização da API | Comunicação REST estruturada |
| Melhorar manutenção do código | Arquitetura em camadas |
| Preparar o sistema para expansão | Escalabilidade da aplicação |
| Garantir segurança dos dados seguindo a LGDP| Segurança de dados sensíveis|

</div>

---
# ⚠️ Regra de Negócio Implementada

O sistema possui uma recomendação para o usuário sobre refeições saudáveis 

Caso o usuário solicite a recomendação:

```text
Não elegível para este tipo de seguro.
```

Esta funcionalidade foi implementada na camada Service, respeitando a separação de responsabilidades da arquitetura do projeto.

---

# 🧩 Funcionalidades Principais

<div align="center">
   
|​🍽️​ ​Funcionalidade do Produto| Descrição |
|---|---|
|➕ Cadastrar Produto|Permite adicionar novos produtos ao sistema |
| 📝 Atualizar Produtos | Possibilita editar informações dos produtos cadastrados |
| ❌ Deletar Produtos | Remove produtos do sistema |
| 📋 Listar Produtos | Exibe todos os produtos disponíveis |
| 🏷️ Buscar por Nome| Filtra produtos de acordo com o nome |
| 🔍 Buscar por ID | Localiza produtos específicos através do identificador 
| 🌐 API REST | Comunicação padronizada entre sistemas |

| ​📃​Funcionalidade do Categoria| Descrição |
|---|---|
|➕ Cadastrar Categoria|Permite adicionar novas categorias ao sistema |
| 📝 Atualizar Categoria | Possibilita editar informações das categorias cadastradas |
| ❌ Deletar Categorias | Remove categorias do sistema |
| 📋 Listar Produtos | Exibe todos os produtos disponíveis |
| 🏷️ Buscar por descrição | Filtra categoria de acordo com a descrição|
| 🔍 Buscar por ID | Localiza categoria específicas através do identificador| 
| 🌐 API REST | Comunicação padronizada entre sistemas |

| ​👨‍🦲​ Funcionalidade do Usuário| Descrição |
|---|---|
|➕ Cadastrar Usuário|Permite adicionar usuários ao sistema |
|📝 Atualizar Usuário | Possibilita editar informações dos usuários cadastradas |
| ❌ Deletar Usuário| Remove usuário do sistema |
|​🕴️​ Autenticação| Validação das credenciais do usuário para acesso ao sistema |


</div>

---

# ⚙️ Arquitetura do Projeto

```text
                +----------------------+
                |     Cliente/API      |
                +----------+-----------+
                           |
                 +---------+---------+
                 |      Security     |
                 +---------+---------+
                           |
                 +---------+---------+
                 |      Service      |
                 +---------+---------+
                           |
                 +---------+---------+
                 |    Controller     |
                 +---------+---------+
                           |
                 +---------+---------+
                 |    Repository     |
                 +---------+---------+
                           |
                 +---------+---------+
                 |      MySQL        |
                 +-------------------+
```

---
# 🗂️ Modelo de Dados

## 👨‍🦲 Usuario

| Atributo | Tipo    | Descrição                          |
|----------|---------|----------------------------------  |
| id       | Long    | Identificador único                |
| nome     | String  | Nome completo (máx. 100 chars)     |
| email    | String  | E-mail do usuário (máx. 100 chars) |
| foto     | String  | URL da foto (máx. 255 chars)       |
| senha    | String  | Senha do usuário (máx. 255 chars)  |

## 🍽️ Produto

| Atributo          | Tipo    | Descrição                           |
|-------------------|---------|-------------------------------------|
| id                | Long    | Identificador único                 |
| nome              | String  | Nome do produto (máx. 100 chars)    |
| descricao         | String  | Descrição do produto (máx. 200 chars) |
| foto              | String  | URL da foto (máx. 255 chars)        |
| preco             | BigDecimal| Valor do Produto    |
| disponivel        | Boolean  | Verifica se o produto tem disponível|

## 📃 Categoria

| Atributo        | Tipo      | Descrição                          |
|-----------------|-----------|------------------------------------|
| id              | Long      | Identificador único                |
| descricao         | String  | Descrição do produto (máx. 200 chars) |


---

# 🔗 Relacionamentos

```text
Usuário    1 ──────────── N    Produto
Categoria 1 ────────────N     Produto
```

Um usuário pode possuir vários produtos cadastrados.

Uma categoria pode estar associado a diversos produtos.

---

# 🌐 Endpoints da API

## Produtos — `/produtos`

| Método | Endpoint            | Descrição                         |
|--------|---------------------|-----------------------------------|
| GET    | `/produtos`           | Lista todos os produtos           |
| GET    | `/produtos/{id}`      | Busca produtos por ID             |
| GET    | `/produtos/saudaveis`      | Busca produtos por saudaveis|
| GET    | `/produtos/nome`      | Busca produtos por nome |                 
| POST   | `/produtos/cadastrar` | Cadastra um novo produto          |
| PUT    | `/produtos/atualizar` | Atualiza um produto existente       |
| DELETE | `/produtos/{id}`      | Remove um produto                   |

## Usuários — `/usuarios`

| Método | Endpoint                    | Descrição                          |
|--------|-----------------------------|------------------------------------|
| GET    | `/usuarios`                 | Lista todos os usuários            |
| GET    | `/usuarios/{id}`            | Busca usuário por ID               |
| POST   | `/usuarios/cadastrar`       | Cadastra um novo usuário           |
| POST   | `/usuarios/logar`       | Loga o usuário           |
| PUT    | `/usuarios/atualizar`       | Atualiza um usuário existente      |
| DELETE | `/usuarios/{id}`            | Remove um usuário                  |

## Categoria — `/categorias`

| Método | Endpoint                        | Descrição                              |
|--------|---------------------------------|----------------------------------------|
| GET    | `/categorias`                      | Lista todas as categorias                |
| GET    | `/categorias/{id}`                 | Busca categoria por ID                    |
| POST   | `/categorias/cadastrar`            | Cadastra uma nova categoria de produto |
| PUT    | `/categorias/atualizar`            | Atualiza uma categoria de produto existente         |
| DELETE | `/categorias/{id}`                 | Remove uma categoria de produto   |

---

# 🛠️ Tecnologias Utilizadas

<div align="center">

| Categoria | Tecnologias |
|---|---|
| 💻 Linguagem | Java |
| 🚀 Framework | Spring Boot |
| 🗄️ Persistência | Spring Data JPA / Hibernate |
| 🛢️ Banco de Dados | MySQL |
| 🔐 ​Segurança | Spring Security|
| 🔌 API | REST API |
| 🧪 Testes | Insomnia |
| 🛠️ Versionamento | Git e GitHub |

</div>

---

# 🔄 Fluxo de Trabalho da Equipe

Nosso processo de desenvolvimento segue uma organização baseada em metodologias ágeis:

<div align="center">
   
| Etapa | Responsável |
|---|---|
| 📋 Planejamento das tarefas | Product Owner |
| 🌿 Criação e organização das branches | Scrum Master |
| 💻 Desenvolvimento das funcionalidades | Desenvolvedores |
| 🧪 Testes e validações da API | Tester |
| 🔀 Merge e integração na main | Scrum Master |
</div>

---

# 📂 Estrutura do Projeto

```text
src
 └── main
      └── java
           └── com.generation.projeto_integrador
                ├── controller
                │    ├── CategoriaController.java
                │    ├── ProdutoController.java
                │    └── UsuarioController.java
                ├── model
                │    ├── Categoria.java
                │    ├── Produto.java
                │    ├── Usuario.java
                │    └── UsuarioLogin.java
                │                   
                ├── repository
                │    ├── CategoriaRepository.java
                │    ├── ProdutoRepository.java
                │    └── UsuarioRepository.java
                │  
                ├── security
                │    ├── JwtAuthFilter.java
                │    ├── JwtService.java
                │    ├── SecurityConfig.java
                │    ├── UserDetailsImpl.java
                │    └── UserDetailsServiceImpl.java
                │
                ├── service
                │    ├── ProdutoService.java
                │    └── UsuarioService.java
                └── ProjetoIntegradorApplication.java

test
 ├── plano-seguro
 ├── seguro-vida
 ├── usuario
 └── relatorio-testes.md

docs
 └── laTomata-der.png
```

---

# 🚀 Como Executar o Projeto

## 1️⃣ Clone o repositório

```bash
git clone https://github.com/Projeto-Integrador-G-3-J-84-Modelo/latomata.git
```

## 2️⃣ Acesse a pasta do projeto

```bash
cd latomata
```

## 3️⃣ Configure o banco de dados

Edite o arquivo:

```properties
application.properties
```

Configure:

```properties
spring.datasource.url=
spring.datasource.username=
spring.datasource.password=
```

---

## 4️⃣ Execute a aplicação

Pela IDE ou terminal:

```bash
./mvnw spring-boot:run
```

---

# 📈 Roadmap do Projeto

- [x] Estrutura inicial da API  
- [x] Configuração do Spring Boot  
- [x] Criação das entidades  
- [x] Implementação do CRUD  
- [x] Segurança com Spring Security  
- [x] Autenticação JWT  
- [ ] Deploy da aplicação  
- [ ] Documentação Swagger/OpenAPI  

---

# 📚 Boas Práticas Utilizadas

- ✅ Arquitetura em camadas  
- ✅ Padronização REST  
- ✅ Organização por responsabilidade  
- ✅ Controle de versionamento com Git Flow  
- ✅ Validação de dados  
- ✅ Criptografia de senha seguindo LGDP
 

---

<div align="center">

### 🥗 Latomata © 2026  
#### Tecnologia e organização para uma alimentação mais saudável.


What did you learn while building this project? What challenges did you face and how did you overcome them?

