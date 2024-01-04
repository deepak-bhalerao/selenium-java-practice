package Encapsulation;

//    By declaring all the variables in the class as private and writing public methods to 
//    set and get the values of those variables known as Encapsulation 

class Tiago
{
	private String carModel;      // data hiding 
	private int carEngine;
	private String carColor;
	private long carPrice;
	
	public void setCarModel(String model)  {   // public setter methods 
		carModel=model;   }    
	public String getCarModel() {              // public getter methods 
		return carModel;   }
	
	public void setCarEngine(int cc)  {
		carEngine=cc;   }
	public int getCarEngine()  {
		return carEngine;  }
	
	public void setCarColor(String color)  {
		carColor=color;   }
	public String getCarColor() {
		return carColor;  }
	
	public void setCarPrice(long price) {
		carPrice=price;   }
	public long getCarPrice()  {
		return carPrice;   }	
}

public class Tata {
	
	static public void main(String[] args)
	{
		Tiago t=new Tiago();
		t.setCarModel("Tata Tiago CNG");  
		System.out.println("Car Model : "+t.getCarModel());
		t.setCarEngine(1200); 
		System.out.println("Car Engine : "+t.getCarEngine()+" cc");
		t.setCarColor("Opal White");  
		System.out.println("Car Color : "+t.getCarColor());
        t.setCarPrice(847000);	
        System.out.println("Car Price : "+t.getCarPrice());	
	}

}
