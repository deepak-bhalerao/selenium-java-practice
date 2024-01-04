package Strings_Arrays_Streams;

public class ParamConstructor {
    
    String name;                                     // instance variables
    int eid;
    
    
    public ParamConstructor(String name, int eid)   // parameterize constructor
    {
        this.name=name;
        this.eid=eid;
    }

    public static void main(String args[]) {
     
      //Constructor executes automatically when we creates an object 
    	
      ParamConstructor e1=new ParamConstructor("Harry",101);
      ParamConstructor e2=new ParamConstructor("Haresh",102);

      System.out.println("Emp Name : "+e1.name+" Emp Id : "+e1.eid);
      System.out.println("Emp Name : "+e2.name+" Emp Id : "+e2.eid);
      
    }
}