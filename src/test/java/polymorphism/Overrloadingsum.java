package polymorphism;

public class Overrloadingsum {

	int add(int n1,int n2)
	{
		return n1+n2;
		
	}
	
	int add(int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overrloadingsum obj = new Overrloadingsum();
		System.out.println("two numbers are "+obj.add(10, 20));
		System.out.println("three numbers are "+obj.add(10, 20, 30));

	}

}
