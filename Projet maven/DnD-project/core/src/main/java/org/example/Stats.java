package org.example;

public class Stats{
    private int Force;
    private int Dexterity;
    private int Constitution;
    private int Wisdom;
    private int Charism;
    private int Intelligence;

    public Stats(){
        this.Force=0;
        this.Dexterity=0;
        this.Constitution=0;
        this.Wisdom=0;
        this.Charism=0;
        this.Intelligence=0;
    }

    public Stats(int Force, int Dexterity, int Constitution, int Wisdom, int Charism, int Intelligence){
        this.Force=Force;
        this.Dexterity=Dexterity;
        this.Constitution=Constitution;
        this.Wisdom=Wisdom;
        this.Charism=Charism;
        this.Intelligence=Intelligence;
    }

    void setForce(int Force){
        this.Force=Force;
    }
    void setDexterity(int Dexterity){
        this.Dexterity=Dexterity;
    }
    void setConstitution(int Constitution){
        this.Constitution=Constitution;
    }
    void setWisdom(int Wisdom){
        this.Wisdom=Wisdom;
    }
    void setCharism(int Charism){
        this.Charism=Charism;
    }
    void setIntelligence(int Intelligence){
        this.Intelligence=Intelligence;
    }

    int getForce(){
        return this.Force;
    }
    int getDexterity(){
        return this.Dexterity;
    }
    int getConstitution(){
        return this.Constitution;
    }
    int getWisdom(){
        return this.Wisdom;
    }
    int getCharism(){
        return this.Charism;
    }
    int getIntelligence(){
        return this.Intelligence;
    }

    int getModifier(int x){
        if (x==1){
            return -5;
        }
        else if (x<=3){
            return -4;
        }
        else if (x<=5){
            return -3;
        }
        else if (x<=7){
            return -2;
        }
        else if (x<=9){
            return -1;
        }
        else if (x<=11){
            return 0;
        }
        else if (x<=13){
            return 1;
        }
        else if (x<=15){
            return 2;
        }
        else if (x<=17){
            return 3;
        }
        else if (x<=19){
            return 4;
        }
        else {
            return 5;
        }
    }
}
