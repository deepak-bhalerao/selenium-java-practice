package Covariant_ReturnType;

class A
{
     Object show()
    {
        System.out.println("A class Method");
        return null;
    }
}

// In 1.5 verion java allow us to use different return type for overriden methods  
// But both method return type should be in parent and child relationship
// here also we can see return type 'Object' declare in parent class and return type 'String' declare in child class
// So String is child class of Object class and Object is the parent class of all classes in java

public class B extends A
{
     String show()
    {
        System.out.println("B class Method");
        return null;
    }
    
    public static void main(String[] args)
    {
        A a=new A();
        a.show();
        B b=new B();
        b.show(); 
    }
}
