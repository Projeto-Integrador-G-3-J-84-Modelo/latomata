# 🥗 Latomata
###  API REST para gerenciamento de produtos de alimentação saudável

<div align="center">

![Status](https://img.shields.io/badge/status-em%20desenvolvimento-blue)
![Backend](https://img.shields.io/badge/backend-Java%20%7C%20Spring%20Boot-red)
![Banco de Dados](https://img.shields.io/badge/database-MySQL-orange)
![API](https://img.shields.io/badge/API-REST-green)
![Versionamento](https://img.shields.io/badge/versionamento-Git%20%26%20GitHub-black)

</div>

---

# 👥 Equipe do Projeto

<div align="center">

| 👨‍💻 Integrante | 🎯 Função | 💼 LinkedIn | 🐙 GitHub |
|---|---|---|---|
| **Igor Nascimento** | Product Owner (PO) | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/igornascimentodev/) | [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/xXAshbornXx) |
| **Luana Porto** | Scrum Master | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/luanamoreiraporto/) | [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/lunnie-porto) |
| **Raissa Feitosa** | Desenvolvedora Backend | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/raissa-santos-feitosa-73485b1a3/) | [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/raissa-sf) |
| **Carolina Perpetuo** | Desenvolvedora Backend | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/carolinaperpetuo/) | [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/CarolinaPerpetuo) |
| **Renan Ferreira** | Desenvolvedor Backend | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/renan-ferreira-cunha/) | [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Renanferrcun) |
| **Dayana Barbosa** | Desenvolvedora Backend | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/dayanabarbosa-devjava/) | [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)]( https://github.com/Day-Barbosa) |
| **Jessica Aquino** | Tester / QA | [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/jessica-aquino-lobo-/) | [![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Jessica-Aquino-hub) |

</div>

---

# 📌 Sobre o Projeto

A **Latomata** é uma API REST desenvolvida para gerenciamento de produtos voltados ao segmento de alimentação saudável.

O projeto foi criado com foco em organização, padronização e escalabilidade, utilizando Java e Spring Boot para construção de uma aplicação backend estruturada em arquitetura em camadas.

A API permite operações de gerenciamento de produtos através de endpoints REST, seguindo boas práticas de desenvolvimento e versionamento.



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

</div>

---

# 🧩 Funcionalidades Principais

<div align="center">
   
| Funcionalidade | Descrição |
|---|---|
| ➕ Cadastrar Produtos | Permite adicionar novos produtos saudáveis ao sistema |
| 📝 Atualizar Produtos | Possibilita editar informações dos produtos cadastrados |
| ❌ Deletar Produtos | Remove produtos do sistema |
| 📋 Listar Produtos | Exibe todos os produtos disponíveis |
| 🏷️ Buscar por Categoria | Filtra produtos de acordo com a categoria |
| 🔍 Buscar por ID | Localiza produtos específicos através do identificador |
| 🌐 API REST | Comunicação padronizada entre sistemas |

</div>

---

# ⚙️ Arquitetura do Projeto

```text
                +----------------------+
                |     Cliente/API      |
                +----------+-----------+
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

# 🛠️ Tecnologias Utilizadas

<div align="center">

| Categoria | Tecnologias |
|---|---|
| 💻 Linguagem | Java |
| 🚀 Framework | Spring Boot |
| 🗄️ Persistência | Spring Data JPA / Hibernate |
| 🛢️ Banco de Dados | MySQL |
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
 ├── controller
 ├── service
 ├── model
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
- [ ] Segurança com Spring Security  
- [ ] Autenticação JWT  
- [ ] Deploy da aplicação  
- [ ] Documentação Swagger/OpenAPI  

---

# 📚 Boas Práticas Utilizadas

- ✅ Arquitetura em camadas  
- ✅ Padronização REST  
- ✅ Organização por responsabilidade  
- ✅ Controle de versionamento com Git Flow  
- ✅ Validação de dados  
 

---

<div align="center">

### 🥗 Latomata © 2026  
#### Tecnologia e organização para uma alimentação mais saudável.

</div>
