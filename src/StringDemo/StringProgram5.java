package StringDemo;

public class StringProgram5 {
	public static void main(String args[]) {
		String str = "The compiled code of java can run on mac linux or windows if jre is available on the operating system";
		String str1[] = str.split(" ");
		String output = "";
		for (int i = 0; i <= str1.length - 1; i++) {
			if (str1[i].charAt(0) == 'o')
				output = output + str1[i].toUpperCase() + " ";
		}
		System.out.println("The required output is: " + output);
	}
}
