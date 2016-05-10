package Personnage;

public class Combattant {
	protected String Nom;
	protected int For;
	protected int Dex;
	protected int Int;
	protected int Con;
	protected int Vit;
	protected int Exp;
	protected ArrayList<Attaque> Attaque;
	
	public String getNom() {
	    return Nom;
	}
	
	public void setNom(String Nom){
	    this.Nom=Nom;
	}
	
	public int getFor() {
	    return For;
	}
	
	public void setFor(int for1) {
	    this.For = for1;
	}
	
	public int getDex() {
	    return Dex;
	}
	
	
	public void setDex(int dex) {
	    this.Dex = dex;
	}
	
	public int getInt() {
	    return Int;
	}
	
	
	public void setInt(int i) {
	    this.Int = i;
	}
	
	
	public int getCon() {
	    return Con;
	}
	
	
	public void setCon(int con) {
	    this.Con = con;
	}
	
	
	public int getVit() {
	    return Vit;
	}
	
	public void setVie(){      
	    this.Vit = 200;
	    this.Vit-= (this.getFor() + this.getDex() + this.getInt() + this.getCon());
	    this.Vit+= (this.getExp() * 3);
	    }
	
	/**
	 * @return the exp
	 */
	public int getExp() {
	    return Exp;
	}
	
	/**
	 * @param exp the exp to set
	 */
	public void setExp(int exp) {
	    this.Exp = exp;
	}
	
	public ArrayList<Attaque> getAttaque(){
        return this.attaque;
    }
	
	public void ajouterAttaque(Attaque attaque){
        this.add(attaque);
    }
	

	public String toString() {
	    return String.format(
	            "Combattant [For=%s, Dex=%s, Int=%s, Con=%s, Vit=%s, Exp=%s]", For,
	            Dex, Int, Con, Vit, Exp);
	}
	
	public Combattant(){
	    this.Nom="";
	    this.Exp=1;
	    this.Attaque = new ArrayList<Attaque>();
	}
	
	public boolean CombattantCarac(){
	    return((For + Dex + Int + Con) <= (100 + Exp) && this.For>=0 && this.Dex >=0 && this.Con >=0 && this.Int >= 0);
	}
}