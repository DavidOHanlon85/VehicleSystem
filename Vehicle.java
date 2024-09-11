/**
 * 
 */
package slideDeckExercises;

/**
 * This is a vehicle class that contains name and powerType
 */
public class Vehicle {

	// Instance variables

	private String name;
	private String powerType;
	
	// Default constructor
	
	public Vehicle(){
		
	}
	
	// Constructor with args
	
	public Vehicle (String name, String powerType) {
		this.name = name;
		this.powerType = powerType;
	}
	
	// Getters and setters

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the powerType
	 */
	public String getPowerType() {
		return powerType;
	}

	/**
	 * @param powerType the powerType to set
	 */
	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}

	// toString method
	
	/**
	 * toString method for the vehicle class
	 */
	
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", powerType=" + powerType + "]";
	}
	
	// Testing super methods
	
	public void display() {
		System.out.println("I'm in vehicle");
	}

}
