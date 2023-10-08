package UseCases;

import entities.Character;
import datatransfertobjects.CharacterSheetDTO;
import datatransfertobjects.Response;

import java.io.FileWriter;
import java.io.IOException;

public class saveCharacterSheet {
    public Response savingDataSheet(CharacterSheetDTO request) throws IOException {
        Character c = new Character(request.Name, request.Race, request.Age, request.Level, request.Classe, request.Background, request.Langues[1], request.Stats[0], request.Stats[1], request.Stats[2], request.Stats[3], request.Stats[4], request.Stats[5], request.Skills[0], request.Skills[1], request.Skills[2]);
        FileWriter writer = new FileWriter("data.txt", false);
        writer.write(c.getName()+"\n"+c.getRace()+"\n"+c.getAge()+"\n"+c.getAge()+"\n"+c.getClasse()+"\n"+c.getBackground()+"\n"+c.getLangues()[1]+"\n"+c.getStats().getForce()+"\n"+c.getStats().getDexterity()+"\n"+c.getStats().getConstitution()+"\n"+c.getStats().getWisdom()+"\n"+c.getStats().getCharism()+"\n"+c.getStats().getIntelligence()+"\n"+c.getSkills()[0]+"\n"+c.getSkills()[1]+"\n"+c.getSkills()[2]);
        writer.close();
        return new Response("Fiche sauvegardée avec succès",request);
    }
}
