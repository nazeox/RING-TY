package Capacites;

import Personnage.Combattant;

public class Arme extends Capacite implements Attaque,Parade {
	private float IMP;
	private float MAN;
	
	public Arme(){
		super();
		IMP=NB_POINT_CAP_MIN;
		MAN=NB_POINT_CAP_MIN;
	}
	
	public float PAttaque(Combattant c){
		PBA=(c.getDex()*MAN)/10000;
		return PBA;
	}
	
	public float PDefense(Combattant c){
		PBA=(c.getDex()*MAN)/5000;
		return PBA;
	}
	
	public float EAttaque(Combattant c){
		EFF=(c.getDex()*MAN)/10000;
		return EFF;
	}
	
	public int attaque(){
        if(this.reussite(this.MAN,Dex))
            return this.getC().getForce()*this.impact/100;
        return 0;
}
	
    /**
     * redefinition de la parade
     * retourne l'efficacite de la parade
     */
	public int parade(){
        if(this.reussite(this.MAN,Dex))
            return this.getC().getForce()*this.parade/100;
        return 0;
	}
}
