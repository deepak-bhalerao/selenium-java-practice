package StaticKeyword;

 class Employee  {
    
    String name;  // instance variable
    int age;
    static String company="Synechron";  // static variable 
    
    public Employee(String name , int age)  // parameterize constructor
    { 
        this.name=name;
        this.age=age;
    }
    
    void display()          // method to display the values  
    {
        System.out.println(name+" "+age+" "+company);
    }

    public static void main(String args[]) {

      Employee e1=new Employee("Haresh Prajapati",31);
      Employee e2=new Employee("Deepak Bhalerao",32);
      Employee e3=new Employee("Amol Dhawale",34);
      e1.display();
      e2.display();
      e3.display();

    }
}