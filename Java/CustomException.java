package Activities;

public class CustomException extends Exception {
	private String message;

	public CustomException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String getMessage()
	{
		return "The error happens because: " + this.message;
	}
	

}
