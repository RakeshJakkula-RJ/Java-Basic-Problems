class ClassesAndObjects{
    public static void main(String[] args){
         
         Car c1 = new Car("Tata", 1500000);
          
          System.out.println(c1.getBrand());
          System.out.println(c1.getPrice());
    }
}

 class Car{
     
     // Fully encapsulated class
     private String brand;
     private int price;
     
     //Constructor
     public Car(String brand, int price){
         this.brand = brand;
         setPrice(price);
     }
     
     public void setBrand(String brand){
          this.brand = brand;
     }
     
     public void setPrice(int price){
          if(price < 0){
             throw new IllegalArgumentException("price cannot be nagative");
          }
          else{
              this.price = price;
          }
     }
     
     public String getBrand(){
          return brand;
     }
     
     public int getPrice(){
         return price;
     }
}

