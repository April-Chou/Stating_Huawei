package blackhorse;


//  This is the farther class of all animal
class Animal{
	private String fur_color;
	private int leg_number;
	
//	construction method
	public Animal() {
		
	}
	
	public Animal(String fur_color,int leg_number) {
		this.fur_color = fur_color;
		this.leg_number = leg_number;
		
	}
	
//	set fur color method
	
	public void setColor(String fur_color) {
		this.fur_color = fur_color;
	}
	
//	set leg number method
	public void setLeg(int leg_number) {
		this.leg_number = leg_number;
	}
	
//	get fur color method
	public String getFur() {
		System.out.print("Fur Color is " + fur_color);
		return fur_color;
	}
	
//	get leg number method
	public int getLeg() {
		System.out.print("The leg number is " + leg_number);
		return leg_number;
	}
	
//	eat method
	public void eat() {
		System.out.println("Eating.......");
	}
}

// inter face of jump high
interface Jump{
	public abstract void jump();
}

// son class cat extends animal
class Cat extends Animal implements Jump{
	
//	construction method
	public Cat() {
		
	}
	
	public Cat(String fur, int leg) {
		super(fur,leg);
	}
	
// overwrite the eat method	
	public void eat() {
		System.out.println("The cat is eating fish!");
	}
	
//	catch mouse method 
	public void catch_mouse() {
		System.out.println("Catch a mouse!");
	}
	
	public void jump() {
		System.out.println("Jump High");
	}
}



// son class dog extends animal
class Dog extends Animal{
	
//	Construction Method
	public Dog() {
		
	}
	
	public Dog(String fur, int leg_number) {
		super(fur, leg_number);
	}
	
//	Dog watch method
	public void watch() {
		System.out.println("Watch over.....");
	}
	
//	overwrite dog eat method
	public void eat() {
		System.out.println("The Dog is eating meat! ");
	}
}


public class Demo_Animal {
	public static void main(String[] args) {
		Cat c1 = new Cat("white", 4);
		c1.eat();
		c1.catch_mouse();
		c1.jump();
		
		Dog d1 = new Dog("Yellow", 4);
		d1.eat();
		d1.watch();
		
		System.out.println("............................");
		
	}

}
