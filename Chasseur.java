package Personnage;

public class Chasseur extends Combattant {
	public Chasseur(){
        super();
        this.For=20;
        this.Dex=20;
        this.Int=20;
        this.Con=20;    
    }
   
    public boolean ChasseurCarac(){
    	if(super.CombattantCarac() && 
				(For>=20 && Dex>=20 && Int>=20 && Con>=20))
			return true;
		return false;
    }
}
