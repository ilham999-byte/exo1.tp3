# exo1.tp3
# Application de Gestion des Produits

Ce projet est une application de gestion des produits développée en Java avec Hibernate-JPA et MySQL.

## Objectifs

L'application permet de gérer les produits en offrant les fonctionnalités de création, affichage, modification, suppression et recherche basée sur certains critères.

## Instructions de développement

1. **Création du projet :**
   - Créer un projet sous NetBeans nommé `H1`.
   - Ajouter les bibliothèques nécessaires : Hibernate-JPA et le pilote MySQL.

2. **Entité Produit :**
   - Créer l'entité `Produit` dans le package `ma.projet.entity`.
   - Utiliser les annotations suivantes :
     - `@Entity`
     - `@Id`
     - `@GeneratedValue`
     - `@Column`
     - `@Table`

3. **Base de données MySQL :**
   - Créer une base de données nommée `H1` sous MySQL.

4. **Configuration Hibernate :**
   - Créer le fichier de configuration `hibernate.cfg.xml` dans le package `ma.projet.config`.

5. **Utilitaire Hibernate :**
   - Créer la classe `HibernateUtil` dans le package `ma.projet.util` pour créer une instance de `SessionFactory`.

6. **Interface IDao :**
   - Créer une interface générique `IDao` dans le package `ma.projet.dao`.

7. **Classe ProduitService :**
   - Créer la classe `ProduitService` dans le package `ma.projet.service` qui implémente l'interface `IDao`.
   - Implémenter les méthodes CRUD dans cette classe.

## Scénarios de test

Dans une classe de test, implémenter les scénarios suivants :
- Créer cinq produits.
- Afficher la liste de tous les produits.
- Afficher les informations du produit dont l'ID est 2.
- Supprimer le produit dont l'ID est 3.
- Modifier les informations du produit dont l'ID est 1.
- Afficher la liste des produits dont le prix est supérieur à 100 DH.
- Afficher la liste des produits commandés entre deux dates saisies par l'utilisateur.

## Technologies utilisées

- Java
- Hibernate-JPA
- MySQL
- NetBeans IDE
