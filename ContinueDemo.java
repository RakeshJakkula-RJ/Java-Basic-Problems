
// continue demo - print A-Z , a-z using a single loop
 
// 65 = A & 90 = Z (91,92,93,94,95,96)..... 97=a & 122=z

public class ContinueDemo{
	public static void main(String[] args){
            
            for(int i=65; i<=122; i++){
            	  if(i>90 && i<97)
            	  	 continue;

            	  	System.out.print((char)i+"  ");
            }

            System.out.println();
	}
}