package UseCases;
import entities.Character;
import java.util.Scanner;

public class createCharacterSheetp1 {
    private String NameField;
    private String RaceField;
    private String ClassField;
    private int AgeField;

    public createCharacterSheetp1(String Name, String Race, String Classe, int Age){
        this.NameField=Name;
        this.RaceField=Race;
        this.ClassField=Classe;
        this.AgeField=Age;
    }

    public void CharacterStep1(Character c){
        if (!this.NameField.isEmpty()){
            c.setName(this.NameField);
        }
        else {
            System.out.println("Erreur : Nom manquant");
        }
        if (!this.RaceField.isEmpty()){
            c.setName(this.RaceField);
        }
        else {
            System.out.println("Erreur : Race manquante");
        }
        if (!this.ClassField.isEmpty()){
            c.setName(this.ClassField);
        }
        else {
            System.out.println("Erreur : Classe manquante");
        }
        if (this.AgeField>0){
            c.setName(this.NameField);
        }
        else {
            System.out.println("Erreur : Âge manquant ou incorrect");
        }
    }
}
