package StringDemo;

public class StringProgram2 {
	public static void main(String args[]) {
		String str = "tom is becoming a programmer";
		System.out.println("Original String is: " + str);
		String[] arr = str.split(" ");
		String capitalWords="";
		for(String words:arr)
		{
			String first=words.substring(0,1);
			String afterFirst=words.substring(1);
			capitalWords=capitalWords+first.toUpperCase()+afterFirst+" ";
		}
		System.out.println("Result of String operation is: "+ capitalWords);
	}
}
