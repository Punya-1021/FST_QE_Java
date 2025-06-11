package Activities;
class Bicycle implements BicycleOperations,BicycleParts
{
	int gears;
	int currentSpeed;
	
	//constructor
	Bicycle(int gears,int currentSpeed)
	{
		this.gears=gears;
		this.currentSpeed=currentSpeed;
		
	}
	
	//Functions to implement
	@Override
	public void applyBrake(int decrementValue)
	{
		System.out.println("Cycle speed decreased");
		if(currentSpeed != 0)
		{
			currentSpeed -= decrementValue;
		}
		else
		{
			System.out.println("Cycle stopped");
		}
	}
	
	@Override
	public void speedUp(int incrementValue)
	{
		System.out.println("Cycle speed increased");
		if(currentSpeed != maxSpeed)
		{
			currentSpeed += incrementValue;
		}
		else
		{
			System.out.println("Cycle stopped");
		}
	}
	
	//Function to describe bicycle
	public void bicycleDesc()
	{
		System.out.println("Bicycle has " + gears +" gears, " + tyres + "tyres and a maximum speed of " + maxSpeed);
	    System.out.println("Its current speed is: "+currentSpeed);
	}
	
}
class MountainBike extends Bicycle
{
	int seatHeight;
	
	//Constructor
	MountainBike(int gears,int currentSpeed,int seatHeight)
	{
		super(gears,currentSpeed);
		this.seatHeight=seatHeight;
	}
	
	//setter for seatHeight
	public void setSeatHeight(int newValue)
	{
		this.seatHeight = newValue;
		
	}
	
	//Override for the description function
	public void bicycleDesc()
	{
		System.out.println("MountainBike has "+ gears +" gears," + tyres + "tyres and a maximum speed of " + maxSpeed);
		System.out.println("Current seat height is : "+ seatHeight);
		System.out.println("Current speed is:" +currentSpeed);
		
	}
}
public class Activity7 {
	public static void main(String[] args) {
		Bicycle mb = new MountainBike(3, 0, 25);
		mb.bicycleDesc();
	    mb.speedUp(20);
	    mb.applyBrake(5);
		
	}

}
