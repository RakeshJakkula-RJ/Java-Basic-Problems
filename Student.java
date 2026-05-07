

class Student{ // default specifier - package level
	
	// data members 
    
     int sid; // Instance - object - Heap 

     String sname; // Instance

     double gpa;  // Instance

     static String university = "JNTUH"; // Class-Class Area / Method Area 



	         // methods - setters and getters

          void setStudent(int id, String name, double avg){   // local variables - stack 

          	     sid = id;

          	     sname = name;

          	     avg = gpa;

          }

          void getStudent(){

          	   System.out.println(sid+"  "+sname+"  "+gpa);

          }
}