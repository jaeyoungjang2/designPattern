package headfirst.designpatterns.decorator.starbuzz;

import org.omg.CORBA.PUBLIC_MEMBER;

public abstract class Beverage {

	public enum Size {
		TALL, GRANDE, VENTI;
	}

	Size size = Size.TALL;
	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}
 
	public abstract double cost();


}
