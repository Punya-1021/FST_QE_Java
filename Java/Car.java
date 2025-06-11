package Activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car(String color, String transmission, int make) {
		super();
		this.color = color;
		this.transmission = transmission;
		this.make = make;
		this.tyres = 4;
		this.doors = 4;
	}
	void displayCharacteristics()
	{
		System.out.println("Color of the Car is : "+this.color );
		System.out.println("Transmission Type is : "+this.transmission );
		System.out.println("Car was made in : "+this.make);
	    System.out.println("It has : "+this.tyres +"Tyers and " +this.doors +"Doors");

	}
	void accelarate()
	{
		System.out.println("Car is moving forward");
	}
	void brake()
	{
		System.out.println("Car has stopped");
	}
	

}
