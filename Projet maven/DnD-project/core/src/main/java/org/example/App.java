package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        String Name="Lolo";
        String Race="Elfe";
        String Classe="Roublard";
        int Age=86;
        String Background="J'ai Alzheimer...";
        String Langue = "Elfique";
        String Skill1="Escamotage";
        String SKill2="Médecine";
        String SKill3="Arcanes";
        int Force=8;
        int Dexterity=15;
        int Charism=17;
        int Intelligence=10;
        int Constitution=12;
        int Wisdom=13;

        Character lolo=new Character(Name,Race,Age,Classe,Background,Langue,Force,Dexterity,Constitution,Wisdom,Charism,Intelligence,Skill1,SKill2,SKill3);

        lolo.display();
        System.out.println(lolo.getId());
    }
}
