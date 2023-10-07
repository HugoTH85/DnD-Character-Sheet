package UseCases;

import entities.Character;
import datatransfertobjects.CharacterSheetDTO;
import datatransfertobjects.Response;

public class createCharacterSheet {
    public Response creationCharacterSheet(CharacterSheetDTO request){
        Character c = new Character(request.Name, request.Race, request.Age, request.Level, request.Classe, request.Background, request.Langues[1], request.Stats[0], request.Stats[1], request.Stats[2], request.Stats[3], request.Stats[4], request.Stats[5], request.Skills[0], request.Skills[1], request.Skills[2]);
        return new Response("Fiche de personnage créée avec succès",request);
    }
}
