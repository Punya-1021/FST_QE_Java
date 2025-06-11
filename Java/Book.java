package Activities;

public abstract class Book {
	String title;
	
	
	public abstract void setTitle(String title);
	
	public String getTitle()
	{
		return this.title;
	}
}


class MyBook extends Book{
	public void setTitle(String title)
	{
		if(title != null && !title.isEmpty())
		{
			this.title=title;
		}
	}
}

