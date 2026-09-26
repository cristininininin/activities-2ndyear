class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("Cat meows!");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks!");
	}
}

public class Polymorphism1 {
	public static void main(String[] args) {
		Animal myAnimal;

		myAnimal = new Cat();
		myAnimal.sound();

		myAnimal = new Dog();
		myAnimal.sound();
	}
}