package stringexamples;

public class SpltIntStr {
	
	static void splitString(String str)
	{
		StringBuffer alpha = new StringBuffer(),
					num = new StringBuffer(),
					special = new StringBuffer();
					//upper = new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			num.append(str.charAt(i));
			else if(Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));
			else
				special.append(str.charAt(i));
		}
		System.out.println(num);
		System.out.println(alpha);
		System.out.println(special);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDefg5@#ki324*";
		splitString(str);
	}

}
