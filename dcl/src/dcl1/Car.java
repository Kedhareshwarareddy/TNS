package dcl1;

public class Car {
	void start() {
		System.out.println("Car starts");
	}
	void shiftGear(int gn) {
		System.out.println("gear shifts to" +gn+"gear");
		if(gn==0) {
			stop();
		}
	}
	void stop() {
		System.out.println("car stops");
	}
}
class Driver{
	void drives() {
		System.out.println("driver starts the car");
		Car c = new Car();
		c.start();
		c.shiftGear(1);
		c.shiftGear(3);
		c.shiftGear(0);
	}
}
 
