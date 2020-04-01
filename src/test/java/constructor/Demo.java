package constructor;

public class Demo {
int a;
int b;

//static int b;


/*Demo()
{
	a = 10;
	b = 20;
	System.out.println("i am in constructor method");
}*/

Demo(int c){
	a = c;
	System.out.println("1st constructor");
}
Demo(int c, int d)
{
	a=c;
	b=d;
	System.out.println("2nd contructor");
}
public void display()
{
	System.out.println("a value is "+a);
	System.out.println("b value is "+b);
}
public static void main(String args[])
{
	Demo d1= new Demo(30);
	Demo d2= new Demo(40,50);
	Demo d3= new Demo(60);
	d1.display();
	d2.display();
	d3.display();
	
}
}
