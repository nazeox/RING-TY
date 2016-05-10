package Capacites;

public class Capacite {
	protected float PBA;
	protected float EFF;
	public static final int NB_POINT_CAP_MIN = 20;
    public static final int NB_POINT_CAP_MAX = 80;
    public static final int TOTAL_POINT = 100;
	/**
	 * @return the pBA
	 */
	public float getPBA() {
		return PBA;
	}
	/**
	 * @param pBA the pBA to set
	 */
	public void setPBA(float pBA) {
		this.PBA = pBA;
	}
	/**
	 * @return the eFF
	 */
	public float getEFF() {
		return EFF;
	}
	/**
	 * @param eFF the eFF to set
	 */
	public void setEFF(float eFF) {
		this.EFF = eFF;
	}
	
	public Capacite(){
		PBA = 0;
		EFF = 0;
	}
}
