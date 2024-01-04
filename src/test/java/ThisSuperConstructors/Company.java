package ThisSuperConstructors;

class Employee
{  
    int empId;            // parent class instance variables
    String empName;     
    
    public Employee(int empId,String empName)     // parent class constructor
    {
        this.empId=empId;
        this.empName=empName;
    }
    
    public void disp()
    {
        System.out.println(" Name : "+empName);
        System.out.println(" ID : "+empId);
    }
}

public class Company extends Employee
{
    String compName , compAdds;        // child class instance variables
    
    public Company(int empId, String empName, String compName, String compAdds)  // child class constructor
    {
        super(empId,empName);        // calling parent class constructor by using super keyword
        this.compName=compName;
        this.compAdds=compAdds;
    }
    
    public void show()
    {
        System.out.println(" Company Details of Employee..");
        System.out.println(" Emp ID : "+empId);
        System.out.println(" Emp Name : "+empName);
        System.out.println(" Company Name : "+compName);
        System.out.println(" Company Adds : "+compAdds);
    }

    public static void main(String[] args)
    {
        Company c=new Company(102,"Jack Sparow","Google","New York");
        c.show();
    }
    
}
