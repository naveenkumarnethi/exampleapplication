package overrideandoverloadexamples;

class Test
{
	int numb(int a, int b)
	{
		return a + b ;
	}
	int numb(int a,int b,int c)

	{
		return a + b + c;
		}
}

public class Overloding extends Test{


	public static void main(String[] args)
	{
		Overloding obj = new Overloding();
		System.out.println("the sum of two numbers are " +obj.numb(20,30));
		System.out.println("the sum of three numbers are " +obj.numb(10, 20, 30));
		System.out.println("sum of 3 numbers are "+obj.numb(30, 40, 50));
		
	}
}

