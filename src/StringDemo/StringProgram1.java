package StringDemo;

public class StringProgram1 {
	public static void main(String args[]) {
		try {
			String str = "www.google.com";
			System.out.println("Original String is " + str);
			String result = str.replace("com", "in");
			System.out.println("After using replace() function to replace .com by .in the result is  " + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
