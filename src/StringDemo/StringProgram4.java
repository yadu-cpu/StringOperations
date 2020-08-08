package StringDemo;

public class StringProgram4 {
	public static void main(String args[])
	{
		String str="#%$#%$*!! Hello There *&*&%$%$^ good";
		String output=str.replaceAll("[#%&$*!^]", "");
		System.out.println(output);
	}

}
