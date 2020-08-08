package StringDemo;
public class StringProgram3 {
	public static void main(String args[])
	{
		String str="One two three four five six";
		String words[]=str.split(" ");
		String outputString="";
		for (int i = words.length-1; i >= 0; i--)
		{
		        outputString = outputString + words[i] + " ";
		}
		System.out.print(outputString);
	}

}
