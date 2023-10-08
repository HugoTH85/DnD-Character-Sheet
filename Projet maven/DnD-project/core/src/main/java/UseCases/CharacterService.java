package UseCases;

import datatransfertobjects.CharacterSheetDTO;
import datatransfertobjects.Response;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CharacterService {
    public Response retreaveDataSheet(CharacterSheetDTO request) throws IOException {
        /* ECRIRE
        Character c = new Character(request.Name, request.Race, request.Age, request.Level, request.Classe, request.Background, request.Langues[1], request.Stats[0], request.Stats[1], request.Stats[2], request.Stats[3], request.Stats[4], request.Stats[5], request.Skills[0], request.Skills[1], request.Skills[2]);
        FileWriter writer = new FileWriter("data.txt", false);
        writer.write(c.getName()+"\n"+c.getRace()+"\n"+c.getAge()+"\n"+c.getLevel()+c.getClasse()+"\n"+c.getBackground()+"\n"+c.getLangues()[1]+"\n"+c.getStats().getForce()+"\n"+c.getStats().getDexterity()+"\n"+c.getStats().getConstitution()+"\n"+c.getStats().getWisdom()+"\n"+c.getStats().getCharism()+"\n"+c.getStats().getIntelligence()+"\n"+c.getSkills()[0]+"\n"+c.getSkills()[1]+"\n"+c.getSkills()[2]);
        writer.close();
        */
        /* LIRE
        * */
        String name, race, age, level ,classe, background, language, force, dexterity, constitution, wisdom, charism, intelligence, skill1, skill2, skill3;
        System.out.println("TEST3");
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            // Read data from the file line by line
            name = reader.readLine();
            race = reader.readLine();
            age = reader.readLine();
            level = reader.readLine();
            classe = reader.readLine();
            background = reader.readLine();
            language = reader.readLine();
            force = reader.readLine();
            dexterity = reader.readLine();
            constitution = reader.readLine();
            wisdom = reader.readLine();
            charism = reader.readLine();
            intelligence = reader.readLine();
            skill1 = reader.readLine();
            skill2 = reader.readLine();
            skill3 = reader.readLine();
        } catch (IOException e) {
            System.out.println("TEST4");
            e.printStackTrace();
            return new Response("Failed to retrieve data from file", request);
        }
        System.out.println("TEST2");
        CharacterSheetDTO characterSheetDTO = new CharacterSheetDTO(name, race, classe, Integer.parseInt(age),
                Integer.parseInt(level), skill1, skill2, skill3,language,
                Integer.parseInt(force), Integer.parseInt(dexterity), Integer.parseInt(constitution),
                Integer.parseInt(wisdom), Integer.parseInt(charism), Integer.parseInt(intelligence), background);

        return new Response("Data retrieved successfully", characterSheetDTO);
    }
}
