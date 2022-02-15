/**
* An object designed to model a circle. 
* It has a radius and circumference and can calculate the area a cylinder given a height and radius.
* 
* @author Anthony Marchiafava
* @version 1.0
*/
public class Circle{
	//circumference
	private double circ;
	
	//radius
	private double radius;
	
	//constructs a Circle
    /**
    * Makes a Circle object.
    * @param radius The radius of the circle.
    */	
    public Circle(double radius){
		this.radius = radius;
		this.circ = 2*Math.PI*radius;
	}
	
	//sets the circ of the Circle
    /**
    * Sets the circumference of the circle.
    * @param circ The new circumference of the circle.
    */
	public void setCirc(double circ){
		this.circ = circ;
	}
	
    /**
    * Returns the circumference of the circle.
    * @return The circumference of the cirlce.
    *
    */
	//gets the circ of the Circle
	public double getCirc(){
		return circ;
	}

    /**
    * Calculates the area of a cylinder. The area of the cylinder would be 2*pi*radius*height + 2*pi*r^2.
    * @param height The height of the cylinder we want to use.
    * @param radius The radius of the cylinder we want to use.
    * @return the area of the cylinder.
    */
	//returns the area of the cylinder that would be produced if the circle became three dimensional
	public double calculateArea(double height, double radius){
		return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
	}
}
