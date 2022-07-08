package com.company;

import java.util.Scanner;


public class AffichageCategories {


    public static void ChoixCategories() {
        String reponse;
        char rep;
        Scanner input = new Scanner(System.in);
        AffichageCategories.menu1();
        reponse = input.next().toLowerCase();// on récupère la réponse pour le menu
        rep = reponse.charAt(0);//on récupère la premiere valeur


        switch (rep) {
            case 'p':

                Facture.resultat[0]="Titre"; // ici on sauvegarde notre premier element du tableau qui aidera a generer le tableau: la categorie
                AffichageMenuPassage.ChoixCategories(); // ca nous ouvre le menu des passage
                break;

            case 's':
                Facture.resultat[0]="Titre";
                AffichageMenuSoire.ChoixCategories();//ca nous ouvre le menu soiree
                break;

            case 'c':
                Facture.resultat[0]="Abonnement";
                AffichageMenuAbonnement.ChoixCategories();//ca nous ouvre le menu abonnement
                break;

            case 'g':
                Facture.resultat[0]="Titre";
                AffichageMenuGroupe.ChoixCategories();// ca nous ouvre le menu groupe
                break;

            case 'a':
                Facture.resultat[0]="Titre";
                AffichageMenuAutre.ChoixCategories();// ca nous ouvre le menu autre
                break;

            case 'q':
                AffichageMenuDebut.menuPrincipal();//ca nous retourne au menu principal
                break;

            default:
                System.err.println("Choix " + rep + " invalide. Faites un choix valide.");

                ChoixCategories();

        }

    }

    public static void menu1() {//on l'utilise pour afficher le contenu du menu rincipal

        AffichageMenuDebut.Bienvenue();
        System.out.println("**   Catégorie des Titres de Transport:        **");
        System.out.println("*************************************************");
        System.out.println("**                                             **");
        System.out.println("**   P  pour     Passage unique                **");
        System.out.println("**   S  pour     Soirée : journée ou FDS       **");
        System.out.println("**   C  pour     Abonnement                    **");
        System.out.println("**   G  pour     Groupe                        **");
        System.out.println("**   A  pour     Autre                         **");

        AffichageCategories.InvitationTaper();

    }


    public static void InvitationTaper() { // elle sera utilise dans chaque classe, afin d'etre generee sur chaque pag, car se repete
        System.out.println("**                                             **");
        System.out.println("**   Q  pour     Quitter                       **");
        System.out.println("**                                             **");
        System.out.println("*************************************************");
        System.out.println("**    Choisissez une categorie:                **");
    }

}
