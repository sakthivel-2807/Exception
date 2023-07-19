package exception;

public class throwexception {
	public static void main (String[]args) throws AgeException {
		String name="sakthi";
		String s1="15";
		System.out.println(name);
		int age=Integer.parseInt(s1);
		if (age>=18) {
			System.out.println("valid");
		}
		else {
			throw new AgeException("invalid age");
		}
		System.out.println("thank u");
	}

}
