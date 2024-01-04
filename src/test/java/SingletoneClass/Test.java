package SingletoneClass;

	// Singleton class- A class which allow us to create only one object is called as singleton class
	  
	class Student 
	{
	    static Student std=new Student();
	    
	    private Student()   //   Constructor should be private for singleton class 
	    {
	      System.out.println("Contructor will invoke for only one object");
	    }
	    static Student getInstance()
	    {
	        return std;
	    }
	}
	
	public class Test
	{
	    static public void main(String[] args)
	    {
	        Student st1=Student.getInstance();
	        Student st2=Student.getInstance();
	    }
	}