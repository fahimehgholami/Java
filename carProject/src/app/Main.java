package app;

import data.Car;

public class Main {
	//Create the objects
public static void main(String[] args) {
		
		Car car1 = new Car("Fiat","500", 50);
		Car car2 = new Car("Benz","s500",45);
		
		car1.printData();
		car1.accelerate();
		car1.brake();
		car1.printData();
		car1.refuel(5);
		car2.printData();
	}

}
// adding comment