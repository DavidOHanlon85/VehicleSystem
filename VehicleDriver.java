/**
 * 
 */
package slideDeckExercises;

/**
 * 
 */
public class VehicleDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Vehicle();
		
		v1.setName("Bicycle");
		v1.setPowerType("Kinetic");
		
		Car c1 = new Car();
		
		c1.setName("The Black Flash");
		c1.setPowerType("Nitrous Oxide");
		c1.setNumberOfWheels(4);
		
		Ship s1 = new Ship();
		s1.setName("Boaty McBoatface");
		s1.setPowerType("Oars");
		s1.setTonnage(2);
		
		System.out.println(v1.toString());
		System.out.println(c1);
		System.out.println(s1.toString());
		
		Ship s2 = new Ship("Bertha", "Diesel", 1234);
		
		System.out.println(s2);
		
		c1.displayFromSubclass();
		
		s1.display();
		
	}

}
