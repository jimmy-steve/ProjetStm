package com.company;

import java.util.Scanner;

import static com.company.MenuTarrifs.tabprix;
// menu rabais
public class AffichageMenuAge {
    public static double[] pretzuri = new double[4];

    public static void ChoixCategories(int categorie, int tip) {//boucle de choix de catégorie
        String reponse;
        char rep;
        Scanner input = new Scanner(System.in);
        AffichageMenuAge.menu(categorie, tip);
        reponse = input.next().toLowerCase();
        rep = reponse.charAt(0);

        switch (rep) {
            case '1':
                Facture.resultat[2]="Tarrif regulier";//ca nous permet de stocker le choix de rabais
                Facture.resultat[3] = String.valueOf(pretzuri[0]); ////ca nous permet de stocker le prix afferent au choix de rabais
                //AffichageMenuPassage;
                break;

            case '2':
                Facture.resultat[2]="Enfant (6-11 ans, 12-17 ans)";
                Facture.resultat[3] = String.valueOf(pretzuri[1]);
                //AffichageMenuSoire;
                break;

            case '3':
                Facture.resultat[2]="Etudiant 18 ans et +";
                Facture.resultat[3] = String.valueOf(pretzuri[2]);
                //AffichageMenuAbonnement;
                break;

            case '4':
                Facture.resultat[2]="65 ans et +";
                Facture.resultat[3] = String.valueOf(pretzuri[3]);
                //AffichageMenuAbonnement;
                break;

            case 'q':
                AffichageMenuDebut.menuPrincipal();
                break;

            default:
                System.err.println("Choix " + rep + " invalide. Faites un choix valide.");
                ChoixCategories(categorie, tip);
        }
        Facture.AffichageFacture();

    }
 //en fonction de la categorie (0 pour passage ou 1 pour abonnement) et du type (tip) choisi, on va aller chercher le prix afferent dans notre matrice de prix
    public static void menu(int categorie, int tip) {
 //en fonction de la categorie (0 pour passage ou 1 pour abonnement) et du type (tip) choisi, on va aller chercher le prix afferent dans notre matrice de prix
        if (categorie == 0) {
            switch (tip) {
                case 0:
                    pretzuri[0] = MenuTarrifs.tabprix[0][0];
                    pretzuri[1] = MenuTarrifs.tabprix[0][1];
                    pretzuri[3] = MenuTarrifs.tabprix[0][3];
                    break;
                case 1:
                    pretzuri[0] = MenuTarrifs.tabprix[1][0];
                    pretzuri[1] = MenuTarrifs.tabprix[1][1];
                    pretzuri[3] = MenuTarrifs.tabprix[1][3];
                    break;
                case 2:
                    pretzuri[0] = MenuTarrifs.tabprix[2][0];
                    pretzuri[1] = MenuTarrifs.tabprix[2][1];
                    pretzuri[3] = MenuTarrifs.tabprix[2][3];
                    break;

            }
        } else {
            switch (tip) {
                case 0:
                    pretzuri[0] = MenuTarrifs.tabprix[7][0];
                    pretzuri[1] = MenuTarrifs.tabprix[7][1];
                    pretzuri[3] = MenuTarrifs.tabprix[7][3];
                    break;
                case 1:
                    pretzuri[0] = MenuTarrifs.tabprix[8][0];
                    pretzuri[1] = MenuTarrifs.tabprix[8][1];
                    pretzuri[2] = MenuTarrifs.tabprix[8][2];
                    pretzuri[3] = MenuTarrifs.tabprix[8][3];
                    break;
                case 2:
                    pretzuri[1] = MenuTarrifs.tabprix[9][1];
                    pretzuri[2] = MenuTarrifs.tabprix[9][2];
                    pretzuri[3] = MenuTarrifs.tabprix[9][3];
                    break;

            }
        }
 // on peut afficher le prix direct avec la matrice
        AffichageMenuDebut.Bienvenue();
        System.out.println("**   Choisissez votre réduction :              **");
        System.out.println("*************************************************");
        System.out.println("**                                             **");
        System.out.println("**   1  pour      Tarif ordinaire  "+pretzuri[0] + "$        **");
        System.out.println("**   2  pour      Enfant           "+pretzuri[1] + "$        **");
        System.out.println("**   3  pour      Étudiant         "+pretzuri[2] + "$        **");
        System.out.println("**   4  pour      + 65 ans         "+pretzuri[3] + "$        **");
        System.out.println("**                                             **");
        System.out.println("** Si c'est indiqué 0.00$, ce choix de rabais n'est pas disponible.**");

        AffichageCategories.InvitationTaper();
    }
}
