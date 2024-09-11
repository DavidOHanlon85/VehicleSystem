/**
 * 
 */
package slideDeckExercises;

/**
 * 
 */
public class Ship extends Vehicle {
	
	// Instance variables
	
	private int tonnage;
	
	// Default constructor
	
	public Ship() {
		
	}
	
	// Constructor with args
	
	public Ship(String name, String powerType, int tonnage) {
		super(name, powerType);
		this.tonnage = tonnage;
	}

	// Getters and setters
	
	/**
	 * @return the tonnage
	 */
	public int getTonnage() {
		return tonnage;
	}

	/**
	 * @param tonnage the tonnage to set
	 */
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	// toString method
	
	/**
	 * toString method for the ship class
	 */
	
	@Override
	public String toString() {
		return "Ship [tonnage=" + tonnage + ", Name = " + getName() + ", Power Type=" + getPowerType() + "]";
	}
	
	
	
	

}
