package Inheritace;

public interface print {
	public void display();

}

class A implements print
{
	public void display() {
		System.out.println("Hello");
	}
	public static void main(String args[])
	{
		A obj = new A();
		obj.display();
	}
}
