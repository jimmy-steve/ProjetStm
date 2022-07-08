package com.company;

import java.util.Scanner;

public class Facture {
    private int numero;
    private int montantAPayer;
    double TarrifTVQ = 0.05;
    double TarrifTPS = 0.1;

    public static String[] resultat = new String[4];
//la classe pour le menu facture (stockage des choix et generation de facture en consequence)
    public static void AffichageFacture() {
        
        
        Scanner sc = new Scanner(System.in);
        char rep;
        double TarrifTVQ = 0.05;
        double TarrifTPS = 0.1;
        double TVQ;
        double TPS;
        double prixSansTaxe = Double.parseDouble(Facture.resultat[3]);
        TVQ = prixSansTaxe * TarrifTVQ;
        TPS = prixSansTaxe * TarrifTPS;

        double prixTTC = prixSansTaxe + TVQ + TPS;
        
do{
        AffichageMenuDebut.Bienvenue();
        System.out.println(" - Categorie: " + Facture.resultat[0]);
        System.out.println(" - Type: " + Facture.resultat[1]);
        System.out.println(" - Tarrif: " + Facture.resultat[2]);
        System.out.println(" - Prix initial: " + Facture.resultat[3]);
        System.out.println(" - Prix a payer sans taxes: " + prixSansTaxe);
        System.out.println(" - TPS: " + TPS);
        System.out.println(" - TVQ: " + TVQ);
        System.out.println(" ____________________________________________");
        System.out.println(" - Prix avec taxes: " + prixTTC);             
        System.out.println("**                                             **");
        System.out.println("**  Desirez-vous continuer vers le paiement:   **");
        System.out.println("**       1 pour continuer                      **");
        System.out.println("**       2 pour Quitter                        **");
        String chaine = sc.next();
        chaine = chaine.toLowerCase();
        rep = chaine.charAt(0);
        }
        while (rep !='1' && rep !='2');
        if (rep == '1') {
            Paiement.VraiPaiement();
        }
        else {
            if (rep != '2')
              AffichageMenuDebut.menuPrincipal();  
        }
    
    
    }
    
    public static double arrondi(double A, int B) {
 return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10,
B);}

    public static void CalculPricTTC() {

    }

    
}
    
    
    
   
