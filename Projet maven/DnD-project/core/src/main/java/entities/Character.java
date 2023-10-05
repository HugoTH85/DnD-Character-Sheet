package entities;

import java.util.logging.Level;

public class Character extends Entities{
    private String Name;
    private String Race;
    private String Classe;
    private int Age;
    private int Level;
    private String[] Skills=new String[3];
    private String[] Langues=new String[2];
    private Stats Stats;
    private String Background;

    public Character(){
        this.setId();
        this.Name="Timothée";
        this.Race="Human";
        this.Age=8;
        this.Classe="Warrior";
        this.Background="Pas grand chose finalement...";
        setLangues("Goblin");
        this.Stats=new Stats(18,12,15,8,10,4);
        setSkills("Athletics","Acrobatic","Nature");
    }

    public Character(String Name, String Race, int Age, String Classe, String Background, String Langue, int Force, int Dexterity, int Constitution, int Wisdom, int Charism, int Intelligence, String Skill1, String Skill2, String Skill3){
        this.setId();
        this.Name=Name;
        this.Race=Race;
        this.Age=Age;
        this.Classe=Classe;
        this.Background=Background;
        setLangues(Langue);
        this.Stats=new Stats(Force, Dexterity, Constitution, Wisdom, Charism, Intelligence);
        setSkills(Skill1, Skill2, Skill3);
    }

    public void setName(String Name){
        this.Name=Name;
    }
    public void setClasse(String Classe){
        this.Classe=Classe;
    }
    public void setRace(String Race){
        this.Race=Race;
    }
    public void setAge(int Age){
        this.Age=Age;
    }
    public void setSkills(String Skill1,String Skill2,String Skill3){
        this.Skills[0]=Skill1;
        this.Skills[1]=Skill2;
        this.Skills[2]=Skill3;
    }
    public void setLangues(String Langue){
        this.Langues[0]="Common";
        this.Langues[1]=Langue;
    }
    public void IncrLevel(){
        this.Level+=1;
    }
    public void DecrLevel(){
        this.Level-=1;
    }
    public void setBackground(String Background){
        this.Background=Background;
    }

    public String getName(){
        return this.Name;
    }
    public String getRace(){
        return this.Race;
    }
    public String getClasse(){
        return this.Classe;
    }

    public String getBackground(){
        return this.Background;
    }
    public int getAge(){
        return this.Age;
    }
    public String[] getSkills(){
        return this.Skills;
    }
    public String[] getLangues(){
        return this.Langues;
    }
    public Stats getStats(){
        return this.Stats;
    }
    public int getLevel() {
        return this.Level;
    }


    public void display(){
        System.out.println("\nPersonnage : "+this.Name+"    Age : "+this.Age);
        System.out.println("Race : "+this.Race+"   Classe : "+this.Classe);
        System.out.println("Langues : "+this.Langues[0]+", "+this.Langues[1]);
        System.out.println("--------Stats--------");
        System.out.println("FORCE          "+this.Stats.getForce());
        System.out.println("DEXTERITY      "+this.Stats.getDexterity());
        System.out.println("CONSITUTION    "+this.Stats.getConstitution());
        System.out.println("WISDOM         "+this.Stats.getWisdom());
        System.out.println("CHARISM        "+this.Stats.getCharism());
        System.out.println("INTELLIGENCE   "+this.Stats.getIntelligence());
        System.out.println("---------------------");
        System.out.println("Skills : "+this.Skills[0]+", "+this.Skills[1]+", "+this.Skills[2]);
        System.out.println("Background : "+this.Background);
    }
}
