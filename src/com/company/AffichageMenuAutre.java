package com.company;

import java.util.Scanner;
//menu autre 
public class AffichageMenuAutre {
    public static void ChoixCategories() {
        String reponse;
        char rep;
        Scanner input = new Scanner(System.in);
        AffichageMenuAutre.menu();
        reponse = input.next().toLowerCase();
        rep = reponse.charAt(0);

        switch (rep) {
            case '1':
                Facture.resultat[1]="YUL Aeroport Mtl Trudeau (valide 24h)";
                Facture.resultat[3] = String.valueOf(MenuTarrifs.tabprix[11][0]);
                
                break;

            case '2':
                Facture.resultat[1]="Passage 747 Ouest";
                Facture.resultat[3] = String.valueOf(MenuTarrifs.tabprix[12][0]);
                
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

    public static void menu() {

        AffichageMenuDebut.Bienvenue();
        System.out.println("**   Type des Titres de Transport:             **");
        System.out.println("*************************************************");
        System.out.println("**                                             **");
        System.out.println("**   1 pour     Aéroport Mtl-Trudeau YUL " + MenuTarrifs.tabprix[11][0]+ "$ **");
        System.out.println("**           (Valide 24h)                      **");
        System.out.println("**   2  pour    Passage 747 ouest        " + MenuTarrifs.tabprix[12][0]+ "$ **");

        AffichageCategories.InvitationTaper();

    }
}
