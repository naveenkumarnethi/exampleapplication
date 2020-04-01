package polymorphism;

public class Bike
{
void run()
{
	System.out.println("Running");
}

public static void main(String args[])
{
	Bike b = new Splendor();
	b.run();
}
}

class Splendor extends Bike
{
	void run()
	{
		System.out.println("running safely with 60km");
	}
	
}
