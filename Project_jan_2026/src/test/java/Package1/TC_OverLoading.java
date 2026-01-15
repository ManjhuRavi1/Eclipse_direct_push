package Package1;


class car{
	int noofcylinders;
	int noofvalves;
	int enginepower;
	boolean ispowersteering;
	
	
	car(){
		noofcylinders = 3;
		noofvalves = 4;
		enginepower = 46;
		ispowersteering = false;
	}
	
	car(boolean ispowersteering){
		this.ispowersteering = ispowersteering;
	}
	
	car(int noofcylinders, int noofvalves, int enginepower){
		this.noofcylinders = noofcylinders;
		this.noofvalves = noofvalves;
		this.enginepower = enginepower;
		this.ispowersteering = true;
	}
}

public class TC_OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car obj1 = new car();
		System.out.println(obj1.noofcylinders);
		
		car obj2 = new car(true);
		System.out.println("is powersteering : " +obj2.ispowersteering);
		
		car obj3 = new car(4,50,4);
		System.out.println("noofcyliners : "+obj3.noofcylinders);
		System.out.println("noofvalves : "+obj3.noofvalves);
		System.out.println("enginpower : "+obj3.enginepower);
	}

}
