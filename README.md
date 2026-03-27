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
