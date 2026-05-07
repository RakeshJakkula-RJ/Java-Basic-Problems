public class StringsDemo {
    
    public static void main(String[] args) {
        
            String s = "Rakesh RJ";

            //  s.concat("Jakkula");

            // String s1 = s.concat("Jakkula");


            // System.out.println(s1); // it will print only Rakesh RJ because String is immutable
               

            // Mutable Strings

            StringBuilder sb = new StringBuilder("Rakesh RJ");

               sb.append("Jakkula");

            System.out.println(sb); // it will print Rakesh RJJakkula because StringBuilder is mutable
    }
}
