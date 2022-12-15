package data;
//Create the class Car
public class Car {

	public String brand;
	public String model;
	public int amountOfFuel;

	public Car (String brand , String model, int amountOfFuel ) 
	

	{
		this.brand= brand;
		this.model= model;
		this.amountOfFuel = amountOfFuel;
		
	

}
public void printData()
	
	{
	System.out.println(brand);
	System.out.println(model);
	System.out.println(amountOfFuel);
	
}
	public void Car1()
	
	{
	System.out.println("Fiat");
	System.out.println("500");
	System.out.println("50");

}
	public void accelerate()
	{
		if(amountOfFuel> 0)
		{
			
		System.out.println("Car is accelerating");
		amountOfFuel= amountOfFuel-1;
		}
	}
	public void brake()
	{
		System.out.println ("Car is breaking");
	
	}
	public void refuel(int fuel)
	{
		amountOfFuel= fuel +amountOfFuel;
		System.out.println("Fuel on the tank: 10");
		System.out.println("Refuel=5");
		System.out.println("Fuel on the tank after the refuel = 15");
	}
	//parameterized constructor that I can assign the values of brand, model and amountOfFuel.
	public  Car() {
	 brand="";
	 model="";
	amountOfFuel=0;
}	
	}
