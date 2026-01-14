package Package1;


public class TC008_DC {

		static int intNum1 = 3;
		static int intNum2;
	static {
		System.out.println("Static block initialized.");
		intNum2 = intNum1 * 4;
	}
	static void myMethod(int intNum3) {
		System.out.println("Number3 =" + intNum3);
		System.out.println("Number1 ="+ intNum1);
		System.out.println("Number2 =" + intNum2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Name : Ravindra");
		System.out.println("Last Name : Kumar");
		System.out.println("Gender : Male");
		System.out.println("Age : 21");
		System.out.println("Weight : 81");

		myMethod(10);

	}

}
