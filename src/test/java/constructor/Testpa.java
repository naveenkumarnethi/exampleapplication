package constructor;

public class Testpa {
	
	int id;
	String name;
	
	
	Testpa(int id,String name)
	{
		//id = id;
		//name  = name;
		this.id = id;
		this.name = name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testpa s1 = new Testpa(2,"abc");
		Testpa s2 = new Testpa(3,"def");
		s1.display();
		s2.display();
	}

}
