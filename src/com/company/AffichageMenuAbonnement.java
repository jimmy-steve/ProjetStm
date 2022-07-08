package com.company;

import java.util.Scanner;

public class AffichageMenuAbonnement {

    public static void ChoixCategories() {
        String reponse;
        char rep;
        Scanner input = new Scanner(System.in);
        AffichageMenuAbonnement.menu();
        reponse = input.next().toLowerCase();
        rep = reponse.charAt(0);

        switch (rep) {
            case '1':
                Facture.resultat[1]="Hebdo (du lundi au dimanche 23:59";
                /*car et abonnement et passage nous amene a la page rabais, qui est identique pour chaque, mais le outpout est different (le prix differe
                * en fonction du choix effectue ici et dans la page passage, la methode AffichageMenuAge.ChoixCategories() recoit 2 parametres, option (0 pour passage
                * ou 1 pour abonnement; et tip (0, 1 ou 2, deppendament des choix dans ses menus*/
                AffichageMenuAge.ChoixCategories(1,0);
                break;

            case '2':
                Facture.resultat[1]="Mensuel (du 1er a la fin du mois)";
                AffichageMenuAge.ChoixCategories(1,1);
                break;

            case '3':
                Facture.resultat[1]="4 mois(consecutifs)";
                AffichageMenuAge.ChoixCategories(1,2);
                break;

            case 'q':
                AffichageMenuDebut.menuPrincipal();
                break;

            default:
                System.err.println("Choix " + rep + " invalide. Faites un choix valide.");
                ChoixCategories();
        }

    }

    public static void menu() {//affichage du menu 

        AffichageMenuDebut.Bienvenue();
        System.out.println("**   Type d'abonnement:                        **");
        System.out.println("*************************************************");
        System.out.println("**                                             **");
        System.out.println("**   1  pour     Hebdo (Lundi au dimanche)     **");
        System.out.println("**   2  pour     Mensuel                       **");
        System.out.println("**   3  pour     4 mois consécutif             **");

        AffichageCategories.InvitationTaper();
    }
}
