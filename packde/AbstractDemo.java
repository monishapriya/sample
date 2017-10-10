package packde;

public abstract class AbstractDemo {
	int side;
	String name;
	AbstractDemo()
	{	
	}
	AbstractDemo(int s,String n)
	{
		side=s;
		name=n;
	}
	public void display()
	{
		System.out.println("name is: "+name);
		System.out.println("side is:"+side);
	}
	abstract void area();
	abstract void perimeter();
	
}

