package Package1;

abstract class shape{
	abstract void draw();
}

class rectangle extends shape{
	
	void draw() {
		System.out.println("Drawing the Rectangle");
	}
	
}


public class TC015_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rectangle obj = new rectangle();
		obj.draw();
		
	}

}
