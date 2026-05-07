abstract class Animal{

	  String name;

	  void display(){
	  	 System.out.println("Printing from Animal class");
	  }
	  
	   abstract void makeSound();

}

interface AnimalInterface{
	
   public static final String name = "Animal";

   void makeSound();

}

class Dog implements AnimalInterface{

	@Override
	public void makeSound(){
		 System.out.println("Dark Barlking...!")
	}
}
 
public class Interface{
	 public static void main(String[] args){

	 	  Animal a = new Dog();

	 	   a.makeSound();

	 	   a.sleep();
	 }
}