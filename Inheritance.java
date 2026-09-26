class Animal {
	String type = "Farm Animal";

	void eat() {
		System.out.println("This animal eats food");
	}

	void sleep() {
		System.out.println("This animal sleeps");
	}
}

class Pig extends Animal {
	String sound = "Oink!";

	void makeSound() {
		System.out.println("The pig says: " + sound);
	}

	void rollnMud() {
		System.out.println("The pig is rolling in mud!");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Pig myPig = new Pig();

		myPig.eat();
		myPig.sleep();
		myPig.makeSound();
		myPig.rollnMud();
	}
}