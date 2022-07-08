package com.company;

import java.util.Scanner;

//menu soiree

public class AffichageMenuSoire {



    public static void ChoixCategories() {
        String reponse;
        char rep;
        Scanner input = new Scanner(System.in);
        AffichageMenuSoire.menu();
        reponse = input.next().toLowerCase();
        rep = reponse.charAt(0);
        double prix;


        switch (rep) {
            case '1':
                Facture.resultat[1]="Soiree Illimitee (18h a 5h)";
                 //Facture.resultat[3] nous permet de stocker le prix afferent au choix. On va chercher le prix dans notre matrice de la classe MenuTarrifs
                Facture.resultat[3] = String.valueOf(MenuTarrifs.tabprix[3][0]);
               
                break;

            case '2':
                Facture.resultat[1]="Un jour (24h)";
                Facture.resultat[3] = String.valueOf(MenuTarrifs.tabprix[4][0]);
               
                break;

            case '3':
                Facture.resultat[1]="Weekend Illimitee (du vendredi 16h au lundi 5h";
                Facture.resultat[3] = String.valueOf(MenuTarrifs.tabprix[5][0]);
                
                break;

            case '4':
                Facture.resultat[1]="3 Jours (consecutifs, jusqu'a 23:59 le 3me jour";
                Facture.resultat[3] = String.valueOf(MenuTarrifs.tabprix[6][0]);
               
                break;

            case 'q':
                AffichageMenuDebut.menuPrincipal();
                break;

            default:
                System.err.println("Choix " + rep + " invalide. Faites un choix valide.");
                ChoixCategories();
        }

        Facture.AffichageFacture();
    }
// affichage du menu soiree avec les prix 
    public static void menu() {

        AffichageMenuDebut.Bienvenue();
        System.out.println("**   Type des Titres de Transport:             **");
        System.out.println("*************************************************");
        System.out.println("**                                             **");
        System.out.print("**   1  pour Soirée illimité (18h a 5h)"   + MenuTarrifs.tabprix[3][0] + "$   **");
        System.out.println();
        System.out.print("**   2  pour Journée (24h)             "   + MenuTarrifs.tabprix[4][0] + "$   **");
        System.out.println();
        System.out.print("**   3  pour Week-end illimité         "   + MenuTarrifs.tabprix[5][0] + "$   **");
        System.out.println();
        System.out.print("**   4  pour 3 jours                   "   + MenuTarrifs.tabprix[6][0] + "$   **");
        System.out.println();

        AffichageCategories.InvitationTaper();


    }
}
