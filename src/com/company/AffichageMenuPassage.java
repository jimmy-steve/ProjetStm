package com.company;
//le menu des passage
import java.util.Scanner;

public class AffichageMenuPassage {

    public static void ChoixCategories() {
        String reponse;
        char rep;
        Scanner input = new Scanner(System.in);
        AffichageMenuPassage.menu();
        reponse = input.next();
        reponse = reponse.toLowerCase();
        rep = reponse.charAt(0);
        //String type;

        switch (rep) {
            case '1':
                Facture.resultat[1]="1 passage";//Facture.resultat[1] nous permer de stocke le type de tytre choisi, qui sera utilise pour generer la facture
                AffichageMenuAge.ChoixCategories(0,0);
                break;

            case '2':
                Facture.resultat[1]="2 passages";
                AffichageMenuAge.ChoixCategories(0,1);
                break;

            case '3':
                Facture.resultat[1]="10 passages";
                AffichageMenuAge.ChoixCategories(0,2);
                break;

            case 'q':
                AffichageMenuDebut.menuPrincipal();
                break;

            default:
                System.err.println("Choix " + rep + " invalide. Faites un choix valide.");
                ChoixCategories();
        }

    }
//menu passage 
    public static void menu() {


        AffichageMenuDebut.Bienvenue();

        System.out.println("**   Type des Titres de Transport:             **");
        System.out.println("*************************************************");
        System.out.println("**                                             **");
        System.out.println("**    1  pour 1  passage                       **");
        System.out.println("**    2  pour 2  passages                      **");
        System.out.println("**    3  pour 10 passsages                     **");

        AffichageCategories.InvitationTaper();

    }

}
