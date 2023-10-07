package controller;

import datatransfertobjects.*;
import UseCases.createCharacterSheet;

import java.util.Scanner;

public class createCharacterSheetController {
    public CharacterSheetDTO run() throws InterruptedException {
        String userInput;

        System.out.println("Création de la fiche de personnage");
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer le nom de votre personnage (ou entrer \"quit\" pour annuler la création :");
        userInput=sc.nextLine();
        if (userInput.equals("quit")) return null;
        String Name=userInput;

        System.out.println("Entrer l'âge de votre personnage (ou entrer \"quit\" pour annuler la création :");
        userInput=sc.nextLine();
        if (userInput.equals("quit")) return null;
        int Age=Integer.parseInt(userInput);

        System.out.println("Choisissez la classe de votre personnage (ou entrer \"quit\" pour annuler la création :");
        System.out.println("Tapper \"Barbare\" ou \"Rôdeur\"");
        userInput=sc.nextLine();
        if (userInput.equals("quit")) return null;
        String Classe=userInput;

        System.out.println("Choisissez la classe de votre personnage (ou entrer \"quit\" pour annuler la création :");
        System.out.println("Tapper \"Elfe\" ou \"Nain\"");
        userInput=sc.nextLine();
        if (userInput.equals("quit")) return null;
        String Race=userInput;

        System.out.println("Choisissez le premier skill de votre personnage (ou entrer \"quit\" pour annuler la création :");
        System.out.println("Tapper \"Perception\" ou \"Discrétion\"");
        userInput=sc.nextLine();
        if (userInput.equals("quit")) return null;
        String Skill1=userInput;

        System.out.println("Choisissez le deuxième skill de votre personnage (ou entrer \"quit\" pour annuler la création :");
        System.out.println("Tapper \"Histoire\" ou \"Acrobatie\"");
        userInput=sc.nextLine();
        if (userInput.equals("quit")) return null;
        String Skill2=userInput;

        System.out.println("Choisissez le troisième skill de votre personnage (ou entrer \"quit\" pour annuler la création :");
        System.out.println("Tapper \"Persuasion\" ou \"Intimidation\"");
        userInput=sc.nextLine();
        if (userInput.equals("quit")) return null;
        String Skill3=userInput;

        System.out.println("Choisissez la langue de votre personnage (ou entrer \"quit\" pour annuler la création :");
        System.out.println("Tapper \"elfique\" ou \"Nain\"");
        userInput=sc.nextLine();
        if (userInput.equals("quit")) return null;
        String Langue=userInput;

        System.out.println("Ecriver le passé de votre personnage (ou entrer \"quit\" pour annuler la création :");
        userInput=sc.nextLine();
        if (userInput.equals("quit")) return null;
        String Background=userInput;

        System.out.println("Choisissez une valeur entre 1 et 20 pour votre statistique de Force (ou entrer \"quit\" pour annuler la création :");
        userInput=sc.nextLine();
        if (userInput.equals("quit")) return null;
        int Force=Integer.parseInt(userInput);

        System.out.println("Choisissez une valeur entre 1 et 20 pour votre statistique de Dextérité (ou entrer \"quit\" pour annuler la création :");
        userInput=sc.nextLine();
        if (userInput.equals("quit")) return null;
        int Dexterity=Integer.parseInt(userInput);

        System.out.println("Choisissez une valeur entre 1 et 20 pour votre statistique de Consitution (ou entrer \"quit\" pour annuler la création :");
        userInput=sc.nextLine();
        if (userInput.equals("quit")) return null;
        int Constitution=Integer.parseInt(userInput);

        System.out.println("Choisissez une valeur entre 1 et 20 pour votre statistique de Sagesse (ou entrer \"quit\" pour annuler la création :");
        userInput=sc.nextLine();
        if (userInput.equals("quit")) return null;
        int Wisdom=Integer.parseInt(userInput);

        System.out.println("Choisissez une valeur entre 1 et 20 pour votre statistique de Charisme (ou entrer \"quit\" pour annuler la création :");
        userInput=sc.nextLine();
        if (userInput.equals("quit")) return null;
        int Charism=Integer.parseInt(userInput);

        System.out.println("Choisissez une valeur entre 1 et 20 pour votre statistique de Intelligence (ou entrer \"quit\" pour annuler la création :");
        userInput=sc.nextLine();
        if (userInput.equals("quit")) return null;
        int Intelligence=Integer.parseInt(userInput);

        var createRequest = new CharacterSheetDTO(Name,Race,Classe,Age,1,Skill1,Skill2,Skill3,Langue,Force,Dexterity,Constitution,Wisdom,Charism,Intelligence,Background);
        var createRequestUseCase = new createCharacterSheet();

        var Response = createRequestUseCase.creationCharacterSheet(createRequest);

        System.out.println(Response.getMessage());
        return createRequest;
    }
}
