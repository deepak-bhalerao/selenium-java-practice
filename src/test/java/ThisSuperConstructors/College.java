package ThisSuperConstructors;

class Student 
{
    int id;       // parent class instance variables
    String name;
    
     Student(int id,String name)   // parent class constructor
    {
        this.id=id;
        this.name=name;
        
        // this is reference variable which is used to refer current class instance varibles
    }
}

public class College extends Student
{
    int clgId;              // child class instance variables 
    String clgName;
    
    College(int id,String name,int clgId,String clgName)   // child class constructor
    {
        super(id,name);     //  calling parent class constructor using super keyword

        // super is reference variable whihch is used to refer parent class instance varibles
        
        this.clgId=clgId;
        this.clgName=clgName;
    }
    
    public void disp()
    {
        System.out.println("Student Details...");
        System.out.println("Student Name : "+name);
        System.out.println("Student ID : "+id);
        System.out.println("Student College ID : "+clgId);
        System.out.println("Student College Name : "+clgName);
    }
    
    public static void main(String args[])
    {
        College c=new College(45,"Harry",12345,"COEP");
        c.disp();
    }
}