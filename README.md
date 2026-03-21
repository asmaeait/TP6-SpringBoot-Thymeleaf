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

<img width="303" height="394" alt="5-tp6" src="https://github.com/user-attachments/assets/4834611a-27f2-491b-a067-f88f45970a06" />


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

## Les interfaces des resultats

<img width="915" height="323" alt="4-tp6" src="https://github.com/user-attachments/assets/1d365da2-6f4f-445e-bf67-99495edea404" />

<img width="960" height="211" alt="1-tp6" src="https://github.com/user-attachments/assets/e39c955a-56fd-4586-88bd-6cb4d88737d6" />

<img width="960" height="326" alt="3-tp6" src="https://github.com/user-attachments/assets/60d2ad94-3439-4437-aa70-1407935c4f5f" />

<img width="953" height="295" alt="2-tp6" src="https://github.com/user-attachments/assets/ffde2047-2ca7-4914-8fa4-f6cbc589b78e" />

---




