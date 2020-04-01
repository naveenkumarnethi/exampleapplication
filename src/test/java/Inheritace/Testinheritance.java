package Inheritace;

class Animal
{
	void eat()
	{
		System.out.println("eating..");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking..");
		
	}
}
public class Testinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new Dog();
		obj.bark();
		obj.eat();
	}

}
