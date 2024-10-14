
package ma.projet.test;

import ma.projet.entity.Produit;
import ma.projet.service.ProduitService;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ProduitService ps = new ProduitService();

        // Créer cinq produits
        ps.create(new Produit("Produit 1", 150, new Date()));
        ps.create(new Produit("Produit 2", 80, new Date()));
        ps.create(new Produit("Produit 3", 120, new Date()));
        ps.create(new Produit("Produit 4", 90, new Date()));
        ps.create(new Produit("Produit 5", 200, new Date()));

        // Afficher la liste des produits
        List<Produit> produits = ps.findAll();
        produits.forEach(System.out::println);

        // Afficher les informations du produit dont id = 2
        Produit produit = ps.findById(2);
        System.out.println("Produit avec ID 2 : " + produit);

        // Supprimer le produit dont id = 3
        ps.delete(ps.findById(3));

        // Modifier les informations du produit dont id = 1
        Produit produit1 = ps.findById(1);
        produit1.setPrix(180);
        ps.update(produit1);

        // Afficher la liste des produits dont le prix est supérieur à 100 DH
        produits = ps.findAll();
        produits.stream().filter(p -> p.getPrix() > 100).forEach(System.out::println);

        // Afficher la liste des produits commandés entre deux dates (à lire au clavier)
        Scanner scanner = new Scanner(System.in);
        // Lecture des dates et filtrage des produits selon les dates...
    }
}