package com.company;

import java.util.Scanner;

//menu groupe

public class AffichageMenuGroupe {

    public static void ChoixCategories() {
        String reponse;
        char rep;
        Scanner input = new Scanner(System.in);
        AffichageMenuGroupe.menu();
        reponse = input.next();
        rep = reponse.toLowerCase().charAt(0);

        switch (rep) {
            case '1':
                Facture.resultat[1]="Groupe (1 adulte + 10 enfants de 6-12 ans)";
                Facture.resultat[3] = String.valueOf(MenuTarrifs.tabprix[10][1]);
                
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

    public static void menu() {//menu visible de groupe

        AffichageMenuDebut.Bienvenue();
        System.out.println("**   Type des Titres de Transport:             **");
        System.out.println("*************************************************");
        System.out.println("**                                             **");
        System.out.println("**   1 pour   1 adulte + 10 enfants(6 à 13 ans)**");
        System.out.println("**                  " + MenuTarrifs.tabprix[10][1] + "$                      **");
        AffichageCategories.InvitationTaper();
    }
}
