package overrideandoverloadexamples;

class Animal
{
	void breed()
	{
		System.out.println("animal breed");
	}

}
public class Overridexaple extends Animal {
	
	void breed() {
		System.out.println("hello...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overridexaple obj = new Overridexaple();
		obj.breed();
		
		
		
		
	}

}
