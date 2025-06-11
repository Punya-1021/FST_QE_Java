package Activities;

public class Activity8 {
	//Functions to test strings
	public void exceptionTest(String str) throws CustomException
	{
		if(str.isEmpty())
		{
			throw new CustomException("String cannot be empty");
		}
		else
		{
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		Activity8 obj = new Activity8();
		try
		{
			obj.exceptionTest("This will be printed");
			obj.exceptionTest("");
		}
		catch(CustomException cx)
		{
			System.out.println(cx.getMessage());
		}
		System.out.println("End of Programme");
	}

}
