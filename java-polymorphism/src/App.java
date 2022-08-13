/*
 	Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
 */

class Bird {
	public void sing() {
		System.out.println("tweet tweet tweet");
	}
}

//inheritance in action
class Robin extends Bird{
	
}

public class App {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.sing();
		
		Robin r = new Robin();
		r.sing();
	}
}
