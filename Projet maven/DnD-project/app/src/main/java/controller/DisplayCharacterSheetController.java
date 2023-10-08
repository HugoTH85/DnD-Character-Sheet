package controller;
import datatransfertobjects.CharacterSheetDTO;
import UseCases.*;

import java.io.IOException;
import java.util.Scanner;

public class DisplayCharacterSheetController {
    public void run(CharacterSheetDTO c) throws IOException {
        String userInput;

        do {
            System.out.println("\nPersonnage : " + c.Name + "    Age : " + c.Age);
            System.out.println("Level : " + c.Level);
            System.out.println("Race : " + c.Race + "   Classe : " + c.Classe);
            System.out.println("Langues : " + c.Langues[0] + ", " + c.Langues[1]);
            System.out.println("--------Stats--------");
            System.out.println("FORCE          " + c.Stats[0]);
            System.out.println("DEXTERITY      " + c.Stats[1]);
            System.out.println("CONSITUTION    " + c.Stats[2]);
            System.out.println("WISDOM         " + c.Stats[3]);
            System.out.println("CHARISM        " + c.Stats[4]);
            System.out.println("INTELLIGENCE   " + c.Stats[5]);
            System.out.println("---------------------");
            System.out.println("Skills : " + c.Skills[0] + ", " + c.Skills[1] + ", " + c.Skills[2]);
            System.out.println("Background : " + c.Background + "\n");

            System.out.println("Tapper \"1\" pour modifier la fiche de personnage");
            System.out.println("Tapper \"2\" pour sauvegarder la fiche de personnage");
            System.out.println("Tapper \"3\" pour passer au niveau supérieur");
            System.out.println("Tapper \"4\" pour passer au niveau inférieur");
            System.out.println("Tapper \"5\" pour retourner au menu principal \n");

            Scanner sc = new Scanner(System.in);
            userInput = sc.nextLine();

            switch (userInput) {
                case "1":
                    var modifyController = new modifyCharacterSheetController();
                    modifyController.run(c);
                    break;
                case "2":
                    var saveUseCase = new saveCharacterSheet();
                    var saveResponse = saveUseCase.savingDataSheet(c);
                    System.out.println(saveResponse.getMessage());
                    break;
                case "3":
                    var levelingupUseCase = new levelUP_DOWN();
                    var lvlupResponse = levelingupUseCase.leveling(c, true);
                    System.out.println(lvlupResponse.getMessage());
                    break;
                case "4":
                    var levelingdownUseCase = new levelUP_DOWN();
                    var lvldownResponse = levelingdownUseCase.leveling(c, false);
                    System.out.println(lvldownResponse.getMessage());
                    break;
                case "5":
                    break;
            }
        }while (!userInput.equals("5"));
    }
}
