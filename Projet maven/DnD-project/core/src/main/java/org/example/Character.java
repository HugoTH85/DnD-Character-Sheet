package org.example;

public class Character extends Entities{
    private String Name;
    private String Race;
    private String Classe;
    private int Age;
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

    void setName(String Name){
        this.Name=Name;
    }
    void setClasse(String Classe){
        this.Classe=Classe;
    }
    void setRace(String Race){
        this.Race=Race;
    }
    void setAge(int Age){
        this.Age=Age;
    }
    void setSkills(String Skill1,String Skill2,String Skill3){
        this.Skills[0]=Skill1;
        this.Skills[1]=Skill2;
        this.Skills[2]=Skill3;
    }
    void setLangues(String Langue){
        this.Langues[0]="Common";
        this.Langues[1]=Langue;
    }
    void setBackground(String Background){
        this.Background=Background;
    }

    String getName(){
        return this.Name;
    }
    String getRace(){
        return this.Race;
    }
    String getClasse(){
        return this.Classe;
    }

    String getBackground(){
        return this.Background;
    }
    int getAge(){
        return this.Age;
    }
    String[] getSkills(){
        return this.Skills;
    }
    String[] getLangues(){
        return this.Langues;
    }
    Stats getStats(){
        return this.Stats;
    }

    public void display(){
        System.out.println("Personnage : "+this.Name+"    Age : "+this.Age);
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
