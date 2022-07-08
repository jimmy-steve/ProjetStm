package com.company;

import static com.company.AffichageMenuGroupe.ChoixCategories;
import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Paiement {

    public static void VraiPaiement() {

        char rep;
        double monnaie;
        Scanner sc = new Scanner(System.in);
        menu();
        String str = sc.nextLine();
        str = str.toLowerCase();
        rep = str.charAt(0);
        switch (rep) {
            case 'c':// paiement avec carte qui est rediriger
                System.out.println("Vous serez redirigé vers un site transactionnel");
                
                AffichageMenuDebut.menuPrincipal();
                break;
            case 'a':
                System.out.println("Combien d'argent voulez-vous donner ?");
                
  
                double montant = sc.nextDouble();
                System.out.println("Entrer le montant exacte avec les taxes");
                double solde = sc.nextDouble();
                if (solde > montant) {
                    System.out.println(" Désolé, c'est insuffisant !");
                } else if (solde == montant) {
                    System.out.println("Merci");
                } else {
                    monnaie = montant - solde;
                    System.out.println("Voici votre monnaie : " + monnaie + " $ ");
                    break;
                }
            case 'q':
                AffichageMenuDebut.menuPrincipal();
                break;
            default:
                System.err.println("Choix " + rep + " invalide. Faites un choix valide.");
                ChoixCategories();
        }

    }

    public static void menu() {

        AffichageMenuDebut.Bienvenue();
        System.out.println("**   Choisissez un mode de paiement :          **");
        System.out.println("*************************************************");
        System.out.println("**                                             **");
        System.out.println("**   C       Paiement avec Carte               **");
        System.out.println("**                                             **");
        System.out.println("**   A       Paiement en Argent                **");
        System.out.println("**                                             **");

        AffichageCategories.InvitationTaper();
    }

}
