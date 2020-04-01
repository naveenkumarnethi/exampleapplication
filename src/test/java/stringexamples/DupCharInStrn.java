package stringexamples;

public class DupCharInStrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1 = "Hello Welcome Hyderabad";
		
		char string[] = string1.toCharArray(); //convert string into char array
		
		System.out.println("Duplicate characters are:");
		
		for(int i=0;i<string.length;i++)
		{
			int count = 1;
			
			for(int j=i+1;j<string.length;j++) {
				if(string[i]==string[j]) {
					count++;
				string[j] = '0';
				}
			}
			if(count > 1 && string[i] != '0')
			{
				System.out.println(string[i]);
			}
			
		}

	}

}
