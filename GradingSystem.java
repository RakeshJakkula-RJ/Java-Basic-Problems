// 1.Grading System Problem Statement : Write a program that takes a Student's percentage as 
// Input and assingns a grade based on the following criteria :

// 90% and Above ---> A 
// 80% to 89% ---> B 
// 70% to 79% ---> C 
// 60% to 69% ---> D 
// Below 60% ---> Fail(F)

public class GradingSystem{
    public static void main(String[] args){
        
         int percentage = Integer.parseInt(args[0]);
                   
         if(percentage < 0 || percentage > 100){
            System.out.println("Invalid percentage! Must be between 0 and 100");
         }
        //  else if(percentage >= 90){
        //     System.out.println("Grade-A");
        //  }
        //  else if(percentage >= 80){
        //     System.out.println("Grade-B");
        //  }
        //  else if(percentage >= 70){
        //     System.out.println("Grade-C");
        //  }
        //  else if(percentage >= 60){
        //     System.out.println("Grade-D");
        //  }
        //  else{
        //     System.out.println("Grade-F");
        //  }

          int grade = percentage / 10;

          switch(grade){
              case 10 : 
              case 9  : System.out.println("Grade-A");
                 break;
              case 8 : System.out.println("Grade-B");
                 break;
              case 7 : System.out.println("Grade-C");
                 break;
              case 6 : System.out.println("Grade-D");
                 break;
              default : 
                 System.out.println("Grade-F");
          }
    }
}