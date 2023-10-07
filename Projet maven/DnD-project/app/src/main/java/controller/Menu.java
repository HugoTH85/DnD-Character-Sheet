package controller;

import java.util.Scanner;

public class Menu {

    public void run(){
        String userInput;

        do {
            System.out.println("Bienvenue sur cette application d'autogestion de fiche de personnage DnD 5e !");
            System.out.println("Que souhaitez-vous faire ?\n");
            System.out.println("Tapper \"1\" pour créer une fiche de personnage");
            System.out.println("Tapper \"2\" pour reprendre une fiche sauvegardée");
            System.out.println("Tapper \"3\" pour quitter");

            Scanner sc = new Scanner(System.in);
            userInput = sc.nextLine();

            switch (userInput) {
                case "1":
                    //instance de controller pour la création de personnage
                case "2":
                    //instance de controller pour reprendre une fiche sauvegardée
                case "3":
                    break;
            }
        }while (!userInput.equals("3"));
    }
}
