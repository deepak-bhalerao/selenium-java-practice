package ThisSuperConstructors;


public class Test
{
    String name;
    int id;
    
    Test(String name, int id)
    {
      this.name=name;
      this.id=id;
    }
    
    public void show()
    {
        System.out.println("Emp Name : "+name);
        System.out.println("Emp id : "+id);
    }
    
    static public void main(String[] args)
    {
        Test t=new Test("Harry",101);
        t.show();
        Test t1=new Test("Potter",102);
        t1.show();
    }
}
