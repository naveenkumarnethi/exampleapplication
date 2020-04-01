package stringexamples;

public class Tstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello World";
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
			System.out.println(s.charAt(i));
			}
		}
		
		String a = "hyderabad";
		System.out.println(a);
		
		for(int j=0;j<a.length();j++)
		{
			char c = a.charAt(j);
			System.out.println(c);
		}
		
		
		String c ="abcd";
		c = c.concat("efgh");
		System.out.println(c);
	}
}
