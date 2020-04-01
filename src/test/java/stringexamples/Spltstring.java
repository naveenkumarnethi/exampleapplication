package stringexamples;

public class Spltstring {

	public static void main(String[] args) {
		String str = "Hello Welcome Hyderabad";
		String sp[] = str.split(" ", 0);
        for (String s: sp)
            System.out.println(s);
        
        String stra = "abcdef";
        System.out.println(stra.substring(2));
        
        for(int i=0;i<stra.length();i++)
        {
        	System.out.println(stra.charAt(i));
        }
        
        String abc = "hyderabad";
        char s[] = abc.toCharArray();
        
        for(int j=0; j<s.length; j++)
        {
        	System.out.println(s[j]);
        }
        
    }

}
