# 🚀 E-Banking JEE Backend

Backend d’une application e-banking développée avec Spring Boot, JPA et Spring Security.

---

## ⚙️ Stack technique
- Spring Boot
- Spring Data JPA
- Spring Security (JWT + OAuth2 Resource Server)
- MySQL
- Lombok
- Swagger
- Angular (frontend séparé)

---

## 🧱 Architecture

- Entities : Customer, BankAccount, AccountOperation
- DTOs : transfert de données API
- Mappers : conversion Entity ↔ DTO
- Repositories : accès base de données
- Services : logique métier
- Web (REST Controllers) : exposition API

---

## 🗄️ Base de données

Support de plusieurs stratégies JPA :
- SINGLE_TABLE (choisi)
- TABLE_PER_CLASS
- JOINED

---

## 🔐 Security

- Authentification JWT
- OAuth2 Resource Server
- Rôles : USER / ADMIN
- Endpoints sécurisés avec `@PreAuthorize`

---

## 📊 Features

- CRUD Customers
- Gestion comptes bancaires
- Débit / Crédit / Virement
- Historique des opérations
- Pagination des transactions
- API REST documentée avec Swagger

---

## ▶️ Run project

```bash
mvn spring-boot:run

```
## 👩‍💻 Author

E-banking project built for learning Spring Boot + JEE architecture