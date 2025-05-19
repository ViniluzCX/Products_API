

````markdown
# 📦 Produtos API

Uma API RESTful simples desenvolvida com **Spring Boot**, **Spring Data JPA**, **H2 Database** e gerenciada com **Maven**, com o objetivo de Testar os aprendizados em Java com Spring Boot e realizar operações de CRUD (Create, Read, Update, Delete) sobre um catálogo de produtos.

---

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.4.5
- Spring Data JPA
- H2 Database (banco de dados local em memória)
- Maven
- Lombok (facilitador de código)(opcional)

---

## 📄 Funcionalidades da API

A API permite:

- ✅ Cadastrar um novo produto
- 🔍 Buscar produto por **ID**
- 🔍 Buscar produto por **nome** (ou algum outro parâmetro)
- 📝 Atualizar um produto via id
- 🗑️ Deletar um produto via id

---

## 🧪 Endpoints disponíveis

| Método | Endpoint         | Descrição                       |
|--------|------------------|----------------------------------|
| `POST` | `/produtos`      | Cadastrar um novo produto       |
| `GET`  | `/produtos/{id}` | Obter produto pelo ID           |
| `GET`  | `/produtos?nome=...` | Buscar produto por nome     |
| `PUT`  | `/produtos/{id}` | Atualizar os dados de um produto|
| `DELETE` | `/produtos/{id}` | Deletar um produto             |

---

## 🧰 Como rodar o projeto localmente

### Pré-requisitos

- Java 21 instalado
- Maven instalado

### Passos

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/produtosapi.git
   cd produtosapi
````

2. Compile e instale as dependências:

   ```bash
   mvn clean install
   ```

3. Rode a aplicação:

   ```bash
   mvn spring-boot:run
   ```

4. Acesse a aplicação em:

   ```
   http://localhost:8080/produtos
   ```

---

## 🛢️ Banco de Dados

O projeto utiliza o **H2 Database**, que roda em memória.
A console web do H2 pode ser acessada (se configurada no `application.properties`) por:

```
http://localhost:8080/h2-console
```

---

## ✍️ Autor

Feito com 💻 por [ViniluzCX](https://github.com/ViniluzCX)
Esse projeto é parte dos estudos de Java com Spring Boot.

---

## 📌 Observações

* O campo `id` é gerado automaticamente via UUID ao salvar um novo produto.
* O banco de dados H2 é reinicializado sempre que a aplicação é reiniciada.

```


