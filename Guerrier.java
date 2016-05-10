package Personnage;

public class Guerrier extends Combattant{
	public Guerrier(){
        super();
        this.For=0;
        this.Dex=0;
        this.Int=0;
        this.Con=0;    
    }
   
    public boolean GuerrierCarac(){
        if((super.CombattantCarac() && (this.For >= this.Dex + 10)&&(this.Dex >= this.Int + 10) && (this.Int+10 >= this.Con)))
            return true;
        else
            return false;
    }
}
