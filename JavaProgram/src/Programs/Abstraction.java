package Programs;

abstract class Animal {
	abstract public void cat();

	 public void dog()
	 {
		 System.out.println("The dog says bow bow");
	 }
}

class Sounds extends Animal {
	public void cat() {
		System.out.println("The cat says meow meow ");
	}

	public void dog() {
		System.out.println("The dog says  bow");
	}
}

class Abstraction {
	public static void main(String[] args) {
		Sounds obj = new Sounds();
		obj.cat();
		obj.dog();
	}
}
