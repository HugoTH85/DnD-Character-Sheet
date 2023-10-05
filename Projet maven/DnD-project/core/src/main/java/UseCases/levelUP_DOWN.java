package UseCases;

import entities.Character;

public class levelUP_DOWN {
    private boolean UPclicked;
    private boolean DOWNclicked;

    public levelUP_DOWN(){
        this.UPclicked=false;
        this.DOWNclicked=false;
    }

    public void leveling(Character c){
        if (this.UPclicked){
            c.IncrLevel();
        }
        else if (this.DOWNclicked){
            c.DecrLevel();
        }
        else {
            System.out.println("Erreur Controller : Demande incohérente de passage de niveau.");
        }
    }
}