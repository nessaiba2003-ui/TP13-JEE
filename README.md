# TP 13 : Intégration OAuth2 (Google & Spring Security)

## 🎯 Objectif
L'objectif de ce projet est de comprendre et mettre en œuvre la délégation d'authentification. Au lieu de gérer les mots de passe localement, l'application délègue cette tâche à un fournisseur d'identité externe (**Google**) en utilisant le protocole **OAuth2** et la norme **OpenID Connect (OIDC)**.

## 🚀 Fonctionnalités
*   Authentification via un compte Google.
*   Sécurisation des routes de l'application avec Spring Security.
*   Récupération des informations de l'utilisateur connecté (Nom, Email, Photo).
*   Architecture basée sur les jetons (**Access Token** et **ID Token**).

## 🛠️ Technologies utilisées
*   **Java 17**
*   **Spring Boot 3.x**
*   **Spring Security OAuth2 Client**
*   **Thymeleaf** (pour l'affichage)
*   **Maven**

## ⚙️ Configuration
Pour faire fonctionner ce projet, vous devez configurer vos identifiants Google Cloud Console dans le fichier `src/main/resources/application.properties` :

```properties
spring.security.oauth2.client.registration.google.client-id=VOTRE_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=VOTRE_CLIENT_SECRET

<img width="614" height="679" alt="image" src="https://github.com/user-attachments/assets/7fb9b7f4-834b-4e61-9524-3f0a4411ca52" />
<img width="855" height="555" alt="Screenshot 2026-03-23 150210" src="https://github.com/user-attachments/assets/a68d2d81-c3e9-49e0-a76a-649151a31192" />
<img width="922" height="596" alt="Screenshot 2026-03-23 150957" src="https://github.com/user-attachments/assets/13a886c7-f488-41af-9f6f-4db3f6e50576" />

<img width="918" height="385" alt="Screenshot 2026-03-23 152225" src="https://github.com/user-attachments/assets/247bf5dd-96ae-4e26-8088-045fb4781b89" />
<img width="898" height="664" alt="Screenshot 2026-03-23 164127" src="https://github.com/user-attachments/assets/44abf469-6167-4438-96fd-c17435fab4e5" />

