public class Main{
    public static void main(String[] args){
        
         Car car = new Tata();
         
         car.engine();
         car.breaks();
         car.mirrors();
        
    }
}

public interface Car{
    
    void engine();
    void breaks();
    
    default void mirrors(){
         System.out.println("Default Mirrors");
    }
}

public interface carTyres{
    void fourTyres();
}

public class Tata implements Car, carTyres{
    
     public void engine(){
         System.out.println("Tata Engine");
     }
     
     public void breaks(){
          System.out.println("Tata Car brakes");
     }
     
     public void fourTyres(){
          System.out.println("4 Tata Tyres");
     }
}
