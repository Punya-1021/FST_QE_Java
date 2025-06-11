package Activities;

public class Activity6
{
	public static void main(String[] args) throws InterruptedException {
		Plane p = new Plane(10);
		p.onboard("John");
		p.onboard("Steve");
		p.onboard("Anna");
		
		System.out.println("Plane took off at: "+p.takeOff());
		
		System.out.println("People on the plane:"+p.getPassengers());
		
		Thread.sleep(5000);
		
		p.setland();
		
		System.out.println("Plane landed at : "+p.getLastTimeLanded());
		System.out.println("People on the plane after lnding : "+p.getPassengers());
		
		
	}
}