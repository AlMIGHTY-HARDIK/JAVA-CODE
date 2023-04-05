/***********************
*         q21          *
* ---------------------*
* +SLOW: int           *
* ----------           *
* +MEDIUM: int         *
* ------------         *
* +FAST: int           *
* ----------           *
* -speed: int          *
* -on: boolean         *
* -radius: double      *
* +color: String       *
* +q21()               *
* +setSpeed(int)       *
* +turnOn()            *
* +turnOff()           *
* +setRadius(double):  *
* +setColor(String):   *
* +getSpeed(): String  *
* +isOn(): boolean     *
* +getRadius(): double *
* +getColor(): String  *
* +toString(): String  *
***********************/

public class q21 {
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	String color;

	/** Constructor that creates a default q21 */
	q21() {
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}

	/** Mutator methods */
	/** Sets speed */
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	/** Sets q21 on */
	public void turnOn() {
			on = true;
	}

	/** Sets q21 off */ 
	public void turnOff() {
			on = false;
	}

	/** Sets color */
	public void setColor(String newColor) {
		color = newColor;
	}

	/** Sets radius */
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	/** Accessor methods */
	/** Return speed */
	public String getSpeed() {
		String s = "";
		switch (speed) {
			case SLOW: s = "SLOW"; break;
			case MEDIUM: s = "MEDIUM"; break;
			case FAST: s = "FAST";
		}
		return s;
	}

	/** Return on */
	public boolean isOn() {
		return on;
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Returns a string description for the q21 */
	public String toString() {
		if (on == true) {
			return "\nFan speed: " + getSpeed() + ", color: " + color + 
					 ", radius: " + radius + "\n";
		}
		else{
			return "\nFan color: " + color + ", radius: " + radius +
					 "\nfan is off\n";
		}
	}
}