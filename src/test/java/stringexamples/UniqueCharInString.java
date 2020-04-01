package stringexamples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueCharInString {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter input: ");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		input.close();
		LinkedHashMap<Character,Integer> list = new LinkedHashMap<Character,Integer>();
		for(Character c: s.toCharArray())
		{
			if(list.containsKey(c))
			{
				list.put(c, list.get(c)+1);
			}
			else
			{
				list.put(c, 1);
			}
		}
		for(Map.Entry e: list.entrySet())
		{
			if(e.getValue() == 1);
			//if((int)e.getValue() == 1);
			System.out.println(e.getKey());
				
		}
	}

}
