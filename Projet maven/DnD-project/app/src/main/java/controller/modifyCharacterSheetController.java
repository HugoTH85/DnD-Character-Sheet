package controller;

import datatransfertobjects.CharacterSheetDTO;

import java.util.Scanner;

public class modifyCharacterSheetController {
    public void run(CharacterSheetDTO c){
        String userInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Modification de la fiche de personnage (ou entrer \"quit\" pour annuler la modification)");
        System.out.println("Que souhaitez-vous modifier ?");
        System.out.println("Tapper \"1\" pour le nom, \n\"2\" pour l'age, \n\"3\" pour la race, \n\"4\" pour la classe, \n\"5\"pour la langue, \n\"6\" pour une statistique, \n\"7\" pour un skill, \n\"8\" pour le passé");
        userInput=sc.nextLine();

        switch (userInput) {
            case "1" -> {
                System.out.println("Saisissez le nouveau nom :");
                userInput = sc.nextLine();
                c.Name = userInput;
            }
            case "2" -> {
                System.out.println("Saisissez le nouvel âge :");
                userInput = sc.nextLine();
                c.Age = Integer.parseInt(userInput);
            }
            case "3" -> {
                System.out.println("Saisissez la nouvelle race :");
                userInput = sc.nextLine();
                c.Race = userInput;
            }
            case "4" -> {
                System.out.println("Saisissez la nouvelle classe :");
                userInput = sc.nextLine();
                c.Classe = userInput;
            }
            case "5" -> {
                System.out.println("Choisissez la nouvelle langue entre \"elfique\" ou \"nain\" :");
                userInput = sc.nextLine();
                c.Langues[1] = userInput;
            }
            case "6" -> {
                System.out.println("Choisissez une valeur entre 1 et 20 pour votre statistique de Force :");
                userInput = sc.nextLine();
                c.Stats[0] = Integer.parseInt(userInput);
                System.out.println("Choisissez une valeur entre 1 et 20 pour votre statistique de Dextérité :");
                userInput = sc.nextLine();
                c.Stats[1] = Integer.parseInt(userInput);
                System.out.println("Choisissez une valeur entre 1 et 20 pour votre statistique de Consitution :");
                userInput = sc.nextLine();
                c.Stats[2] = Integer.parseInt(userInput);
                System.out.println("Choisissez une valeur entre 1 et 20 pour votre statistique de Sagesse :");
                userInput = sc.nextLine();
                c.Stats[3] = Integer.parseInt(userInput);
                System.out.println("Choisissez une valeur entre 1 et 20 pour votre statistique de Charisme :");
                userInput = sc.nextLine();
                c.Stats[4] = Integer.parseInt(userInput);
                System.out.println("Choisissez une valeur entre 1 et 20 pour votre statistique de Intelligence :");
                userInput = sc.nextLine();
                c.Stats[5] = Integer.parseInt(userInput);
            }
            case "7" -> {
                System.out.println("Choisissez le premier skill de votre personnage :");
                System.out.println("Tapper \"Perception\" ou \"Discrétion\"");
                userInput = sc.nextLine();
                c.Skills[0] = userInput;
                System.out.println("Choisissez le deuxième skill de votre personnage :");
                System.out.println("Tapper \"Histoire\" ou \"Acrobatie\"");
                userInput = sc.nextLine();
                c.Skills[1] = userInput;
                System.out.println("Choisissez le troisième skill de votre personnage :");
                System.out.println("Tapper \"Persuasion\" ou \"Intimidation\"");
                userInput = sc.nextLine();
                c.Skills[2] = userInput;
            }
            case "8" -> {
                System.out.println("Saisissez le nouveau passé de votre personnage :");
                userInput = sc.nextLine();
                c.Background = userInput;
            }
        }
    }
}
