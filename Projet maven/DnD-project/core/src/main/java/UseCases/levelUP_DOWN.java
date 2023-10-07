package UseCases;

import entities.Character;
import datatransfertobjects.CharacterSheetDTO;
import datatransfertobjects.Response;

public class levelUP_DOWN {
    public Response leveling(CharacterSheetDTO request, boolean levelup){
        if (levelup){
            Character c = new Character(request.Name, request.Race, request.Age, request.Level+1, request.Classe, request.Background, request.Langues[1], request.Stats[0], request.Stats[1], request.Stats[2], request.Stats[3], request.Stats[4], request.Stats[5], request.Skills[0], request.Skills[1], request.Skills[2]);
            request.Level+=1;
        }
        else {
            Character c = new Character(request.Name, request.Race, request.Age, request.Level-1, request.Classe, request.Background, request.Langues[1], request.Stats[0], request.Stats[1], request.Stats[2], request.Stats[3], request.Stats[4], request.Stats[5], request.Skills[0], request.Skills[1], request.Skills[2]);
            request.Level-=1;
        }
        return new Response("Changement de Niveau effectué avec succès",request);
    }
}