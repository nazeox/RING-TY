package Personnage;

public class Mage extends Combattant {
	public Mage(){
        super();
        this.For=0;
        this.Dex=0;
        this.Int=0;
        this.Con=0;    
    }
   
    public boolean MageCarac(){
    	if(super.CombattantCarac() && 
				(this.Int >= this.For + 15 && this.Int >= this.Dex + 15)&&
				(this.Con >= this.For + 15 && this.Con >= this.Dex + 15))
			return true;
		return false;
    }
}
