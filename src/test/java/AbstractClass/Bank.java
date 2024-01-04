package AbstractClass;

abstract class Bank             // abstract class
{
    Bank()                      // We can create the constructor of abstract class
    {
        System.out.println(" Bank Info ");
    }
    
    static void BankROI()       // We can define static methods in abstract class
    {
        System.out.println(" ROI details of Indian Banks ");
    }
    
    abstract void HomeLoan();   // abstract method
    abstract void CarLoan();    // abstract method
    
    final void run()             // we can define final method in abstract class 
    {
    	                      
    }          // abstract class can have abstract as well as non abstract methods
}

class SBI extends Bank
{
	// if normal class inherits the abstract class then compulsory 
	// we need to create the body of abstract method
    void HomeLoan()
    {
        System.out.println(" SBI HomeLoan ROI : 8.5 ");
    }
    void CarLoan()
    {
        System.out.println(" SBI CarLoan ROI : 7.5 ");
    }
}

 class HDFC extends Bank
{
	// if normal class inherits the abstract class then compulsory 
	// we need to create the body of abstract method
    void HomeLoan()
    {
        System.out.println(" HDFC HomeLoan ROI : 9.0 ");
    }
    void CarLoan()
    {
        System.out.println(" HDFC CarLoan ROI : 8.5 ");
    }
    
    
    public static void main(String args[]) 
    {
        Bank.BankROI();       // directly calling static method from abstract class 
        SBI sbi=new SBI();    // creating the instance of SBI class
        sbi.HomeLoan();
        sbi.CarLoan();
        HDFC hdfc=new HDFC(); // creating the instance of HDFC class
        hdfc.HomeLoan();
        hdfc.CarLoan();
        
        //  Bank b=new Bank();    // we cannot create the object of abstract class
        //  Constructor executes automatically when we creates an object
    }
}