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

//polymorphism in action
class Pelican extends Bird{
	/* important note: if the sing method below will have a parameter like sing(String song), 
	it will display the sing method from a Bird class because it has to be same forms. */
	public void sing() {
		System.out.println("kwah kwah kwah");
	}
}

public class App {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.sing();
		//displays tweet tweet tweet
		
		Robin r = new Robin();
		r.sing();
		//also displays tweet tweet tweet because it doesn't have its own method but it is inheriting from Bird class.
		
		Pelican p = new Pelican();
		p.sing();
		//displays kwah kwah kwah. Because of polymorphism even it is inheriting from a bird class it displays the sing method from its own class.		
	}
}
