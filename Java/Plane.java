package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	private List<String> passengers;
	private final int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;

	
	public Plane(int maxPassengers) {
		super();
		this.passengers = new ArrayList<>();
		this.maxPassengers = maxPassengers;
		
	}


	public void onboard(String passengerName)
	{
		if(passengers.size() <= maxPassengers)
		{
			this.passengers.add(passengerName);
		}
		else 
		{
			System.out.println("Plane is full");
		}
	}
	public Date takeOff()
	{
		this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
		
	}
	public void setland()
	{
		this.lastTimeLanded = new Date();
		this.passengers.clear();
		
	}
	public Date getLastTimeLanded()
	{
		return lastTimeLanded;
		
	}
	public List<String> getPassengers()
	{
		return passengers;
		
	}

}

//public class Activity6
//{
//	public static void main(String[] args) throws InterruptedException {
//		Plane p = new Plane(10);
//		p.onboard("John");
//		p.onboard("Steve");
//		p.onboard("Anna");
//		
//		System.out.println("Plane took off at: "+p.takeOff());
//		
//		System.out.println("People on the plane:"+p.getPassengers());
//		
//		Thread.sleep(5000);
//		
//		p.setland();
//		
//		System.out.println("Plane landed at : "+p.getLastTimeLanded());
//		System.out.println("People on the plane after lnding : "+p.getPassengers());
//		
//		
//	}
//}
