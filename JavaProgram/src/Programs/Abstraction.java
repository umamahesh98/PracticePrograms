package Programs;

abstract class Animal {
	abstract public void cat();

	 public void dog()
	 {
		 System.out.println("You are in dog class");
	 }
}

class Sounds extends Animal {
	public void cat() {
		System.out.println("you are in cat class ");
	}

	public void dog() {
		System.out.println("you are in dog 2 class");
	}
}

class Abstraction {
	public static void main(String[] args) {
		Sounds obj = new Sounds();
		obj.cat();
		obj.dog();
	}
}
