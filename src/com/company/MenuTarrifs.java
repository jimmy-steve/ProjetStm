package com.company;

public class MenuTarrifs {
    public static double prix;
    public static double[][] tabprix = new double[13][4];

    public static void preparationTarrif() {

        tabprix[0][0] = 3.5;  //passageReg = 3.50
        tabprix[0][1] =2.50;  //passageEnfant = 2.50
        tabprix[0][3] = 1; //passageAine = 1.00

        tabprix[1][0] = 5.5;  //passageDeuxReg = 5.5
        tabprix[1][1] =4.25;  //passageDeuxEnfant = 4.25
        tabprix[1][3] = 2; //passageDeuxAine = 2.0

        tabprix[2][0] = 30;  //passageDixReg = 30
        tabprix[2][1] =19;  //passageDixEnfant = 19.00
        tabprix[2][3] = 9; //passageDixAine = 9.00

        tabprix[3][0] = 5.75;  //soir = 5.75
        tabprix[4][0] = 10; // journee = 10
        tabprix[5][0] = 14.50; //fds = 14.50
        tabprix[6][0] = 20.50; //3jours = 30.00

        tabprix[7][0] = 28.00; // HebdoReg=28.00
        tabprix[7][1] = 16.25;  //HebdoEnfant = 16.25
        tabprix[7][3] = 8.50; //HebdoAine = 8.50


        tabprix[8][0] = 90.50; // MensuelReg=90.50
        tabprix[8][1] = 54;  //MensuelEnfant = 54.00
        tabprix[8][2] = 54; //MensuelEtud= 54.00
        tabprix[8][3] = 27; // MensuelAine = 27.00

        tabprix[9][1] = 212;  //4moisEnfant = 54.00
        tabprix[9][2] = 212; //4moisEtud= 54.00
        tabprix[9][3] = 106; // 4moisAine = 27.00

        tabprix[10][1] = 19;    //groupe

        tabprix[11][0] = 10;    //YUL
        tabprix[12][0] = 10;    //747O

    }
    

    public static void PrixSoir(){
        String type="Soiree illimitee";
        double prix=5.75;
        System.out.print(prix);

    }
    public static void Prix1jour(){
        String type="1 jour (24h)";
        double prix=10.00;
        System.out.print(prix);
    }
    public static void PrixWeekend(){
        String type="Weekend illimitee (du vendredi au dimanche)";
        double prix=14.50;
       System.out.print(prix);
    }

    public static void Prix3jours(){
        String type="3 jours (consecutif)";
        double prix=20.50;
        System.out.print(prix);
    }
    public static void PrixGroupe(){
        String type="Groupe: 1 adulte + 10 enfants de 6-12 ans";
        double prix=19.00;
       System.out.print(prix);
    }
    public static void PrixYul(){
        String type="Yul Aeroport Mtl Trudeau (747), valide 24h";
        double prix=10.00;
        System.out.print(prix);
    }
    public static void Prix747O(){
        String type="Passage 747 Ouest";
        double prix=10.00;
        System.out.print(prix);
    }

}
