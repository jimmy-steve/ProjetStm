package com.company;

import java.util.Scanner;
//Creation de la page de debut
public class AffichageMenuDebut {

    public static void menuPrincipal(){

        Scanner input = new Scanner(System.in);
        char reponse;
        do {// boucle do pour avoir la bonne reponse 
           AffichageMenuDebut.Bienvenue();
            System.out.println("**   Demarrer une nouvelle transaction:        **");
            System.out.println("**   1 pour Oui                                **");
            System.out.println("**   2 pour Non                                **");
            System.out.println("*************************************************");
            System.out.println("Entrer votre choix:");
            String chaine = input.next();
            chaine = chaine.toLowerCase();
            reponse = chaine.charAt(0);
        }
        while (reponse!='1' && reponse!='2');//fin boucle do 

        if (reponse=='1'){//choix pour continuer
            AffichageCategories.ChoixCategories();
        }
        else {
            System.out.println("Merci et au revoir!");
        }

        
    }

    public static void Bienvenue(){// elle sera utilise dans chaque classe, afin d'etre generee sur chaque page
        System.out.println("*************************************************");
        System.out.println("**      Bienvenue à la STM                     **");
        System.out.println("*************************************************");
    }
}
