/**
 * 
 */
package slideDeckExercises;

/**
 * 
 */
public class Car extends Vehicle {
	
	// Instance Variables
	
	private int numberOfWheels;
	
	// Default constructor
	
	public Car() {
		
	}
	
	// Constructor with args
	
	public Car (String name, String powerType, int numberOfWheels) {
		super(name, powerType);
		this.numberOfWheels = numberOfWheels;
	}
	
	// Getters and setters

	/**
	 * @return the numberOfWheels
	 */
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	/**
	 * @param numberOfWheels the numberOfWheels to set
	 */
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	/**
	 * toString method for the car class
	 */
	@Override
	public String toString() {
		return "Car [numberOfWheels=" + numberOfWheels + ", Name=" + getName() + ", Power Type="
				+ getPowerType() + "]";
	}
	
	public void displayFromSubclass() {
		super.display();
		System.out.println("I'm actually calling this from inside the subclass Car");
	}

}
