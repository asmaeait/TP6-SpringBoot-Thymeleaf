# Users Directory — Spring Boot + Thymeleaf + MySQL

Application web CRUD complète pour la gestion d'utilisateurs, construite avec Spring Boot 3, Thymeleaf et MySQL.

---

## Aperçu

| Page | URL |
|------|-----|
| Liste des utilisateurs | `http://localhost:8080` |
| Ajouter un utilisateur | `http://localhost:8080/signup` |
| Modifier un utilisateur | `http://localhost:8080/edit/{id}` |
| Supprimer un utilisateur | `http://localhost:8080/delete/{id}` |

---

## Stack technique

- **Backend** : Java 21, Spring Boot 3.5, Spring Data JPA, Hibernate 6
- **Frontend** : Thymeleaf, HTML/CSS (custom)
- **Base de données** : MySQL (via XAMPP)
- **Validation** : Hibernate Validator (`@NotBlank`, validation email navigateur)
- **Build** : Maven

---

## Structure du projet

```
src/main/
├── java/ma/example/demo/
│   ├── entities/
│   │   └── User.java           # Entité JPA
│   ├── repository/
│   │   └── UserRepository.java # Interface CrudRepository
│   ├── UserController.java     # Contrôleur MVC (CRUD)
│   └── Application.java        # Point d'entrée
└── resources/
    ├── templates/
    │   ├── index.html           # Liste des utilisateurs
    │   ├── add-user.html        # Formulaire ajout
    │   └── update-user.html     # Formulaire modification
    └── application.properties
```

---

## Installation et lancement

### Prérequis

- Java 21+
- Maven
- XAMPP (MySQL actif)

### Étapes

1. **Cloner le projet**
   ```bash
   git clone https://github.com/ton-username/demo-thymeleaf.git
   cd demo-thymeleaf
   ```

2. **Créer la base de données MySQL**
   ```sql
   CREATE DATABASE thymeleaf;
   ```

3. **Configurer `application.properties`**
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/thymeleaf?createDatabaseIfNotExist=true&serverTimezone=UTC
   spring.datasource.username=root
   spring.datasource.password=
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

4. **Lancer l'application**
   ```bash
   mvn spring-boot:run
   ```
   Ou via IntelliJ : bouton **Run** sur `Application.java`

5. **Ouvrir le navigateur**
   ```
   http://localhost:8080
   ```

---

## Fonctionnalités

- Afficher la liste de tous les utilisateurs
- Ajouter un nouvel utilisateur (nom + email)
- Modifier un utilisateur existant
- Supprimer un utilisateur
- Validation des champs (champs vides, format email)

---

## Dépendances principales (`pom.xml`)

```xml
spring-boot-starter-web
spring-boot-starter-data-jpa
spring-boot-starter-thymeleaf
spring-boot-starter-validation
mysql-connector-j
spring-boot-devtools
lombok
```

---

## Auteur

Projet réalisé dans le cadre d'un TP Spring Boot — 2026
