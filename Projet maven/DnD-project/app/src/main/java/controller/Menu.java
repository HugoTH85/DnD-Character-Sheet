package controller;

import UseCases.CharacterService;
import datatransfertobjects.CharacterSheetDTO;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    createCharacterSheetController creationSheet = new createCharacterSheetController();

    CharacterService c = new CharacterService();
    repriseSauvCharacterSheet retrieveSheet = new repriseSauvCharacterSheet(c);
    DisplayCharacterSheetController displaySheet = new DisplayCharacterSheetController();
    public void run() throws InterruptedException, IOException {
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
                    CharacterSheetDTO c = creationSheet.run();
                    if (c!=null) {
                        displaySheet.run(c);
                    }
                    break;
                case "2":
                    //instance de controller pour reprendre une fiche sauvegardée
                    CharacterSheetDTO d = new CharacterSheetDTO("","","",0,0,"","","","",0,0,0,0,0, 0, "");
                    displaySheet.run(retrieveSheet.retrieveCharacterData(d));
                    break;
                case "3":
                    break;
            }
        }while (!userInput.equals("3"));
    }
}
