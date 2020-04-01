package Interface;

public interface in {
	//final int a = 10;
	void display();
}

class test implements in
{
	public void display()
	{
		System.out.println("I am in test class");
	}
	public static void main(String[] args)
	{
		test t = new test();
		t.display();
		//System.out.println(a);
	}

}