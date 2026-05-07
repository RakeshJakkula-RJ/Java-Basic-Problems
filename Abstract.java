
abstract class Animal{

	  abstract void makeSound();
	  
	   void sleep(){
	   	 System.out.println("Sleeping...!");
	   }
}

class Dog extends Animal{

	 @Override
	 void makeSound(){
	 	System.out.println("Dog Barks...!");
	 }
}

 
public class Abstract{
	 public static void main(String[] args){

	 	  Animal a = new Dog();

	 	   a.makeSound();

	 	   a.sleep();
	 }
}