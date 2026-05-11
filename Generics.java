import java.util.ArrayList;

class Generics{
    public static void main(String[] args){
         
         ArrayList list = new ArrayList();
         
         list.add("Rakesh");
         list.add(100);
         
         String name = (String) list.get(1);
         
         System.out.println(name);
         
    }
}