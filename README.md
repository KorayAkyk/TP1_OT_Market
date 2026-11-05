# TP1_OT_Market

TP Java sur une application de gestion d'articles de magasin, avec Hibernate et une base MySQL. Le fichier `src/Probleme` note les difficultés rencontrées (affichage des fichiers XML, installation d'Hibernate).

## Ce que ça fait

- classe `Article` : référence, intitulé, prix HT, quantité en stock ;
- fenêtre Swing `FenetreArticle` (titre « Article », image d'accueil) : ébauche, sans formulaire pour l'instant ;
- `CreateArticleDemo` : enregistre un article en base avec Hibernate ;
- `TestJdbc` : test de connexion JDBC à la base.

## Technologies

Java, Swing, Hibernate 5.4, pilote MySQL (MySQL Connector/J 8). Les bibliothèques (`.jar`) sont dans le dossier `lib/`. Projet au format IntelliJ IDEA et Eclipse, sans Maven ni Gradle.

## Ce qu'il faut

Un JDK, un IDE (IntelliJ IDEA ou Eclipse) et un serveur MySQL. Les paramètres de connexion se règlent dans `src/com/luv2code/jdbc/hibernate.cfg.xml` et dans `TestJdbc.java`.

## Lancer

Ouvrir le dossier dans l'IDE, ajouter les `.jar` de `lib/` au classpath, puis lancer la classe voulue : `main.Principal` (fenêtre), `com.luv2code.hibernate.demo.CreateArticleDemo` ou `com.luv2code.jdbc.TestJdbc`.
