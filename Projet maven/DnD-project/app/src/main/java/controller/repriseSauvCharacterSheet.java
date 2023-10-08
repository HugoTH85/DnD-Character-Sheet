package controller;

import UseCases.CharacterService;
import datatransfertobjects.*;

import java.io.IOException;
public class repriseSauvCharacterSheet {
    public  CharacterService characterService;
    // Constructor to initialize characterService
    public repriseSauvCharacterSheet(CharacterService characterService) {
        this.characterService = characterService;
    }
    public CharacterSheetDTO retrieveCharacterData(CharacterSheetDTO Cha) {
        try {
            System.out.println("TEST");
            return characterService.retreaveDataSheet(Cha).getData();
        } catch (IOException e) {
            System.out.println("TEST2");
            e.printStackTrace();
            return new Response("Error occurred while retrieving data", Cha).getData();
        }
    }
}
