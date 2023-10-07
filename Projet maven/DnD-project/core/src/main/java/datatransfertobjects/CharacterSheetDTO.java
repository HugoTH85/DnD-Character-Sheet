package datatransfertobjects;

public class CharacterSheetDTO {
    public String Name;
    public String Race;
    public String Classe;
    public int Age;
    public int Level;
    public String[] Skills=new String[3];
    public String[] Langues=new String[2];
    public int[] Stats=new int[6];
    public String Background;

    public CharacterSheetDTO(String Name, String Race, String Classe, int Age, int Level, String Skill1, String SKill2, String Skill3, String Langue, int Force, int Dexterity, int Constitution, int Wisdom, int Charism, int Intelligence, String Background){
        this.Name=Name;
        this.Race=Race;
        this.Classe=Classe;
        this.Age=Age;
        this.Level=Level;
        this.Skills[0]=Skill1;
        this.Skills[1]=SKill2;
        this.Skills[2]=Skill3;
        this.Langues[0]="Common";
        this.Langues[1]=Langue;
        this.Stats[0]=Force;
        this.Stats[1]=Dexterity;
        this.Stats[2]=Constitution;
        this.Stats[3]=Wisdom;
        this.Stats[4]=Charism;
        this.Stats[5]=Intelligence;
        this.Background=Background;
    }
}
