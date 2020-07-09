
public class Desktop {
	private Computadora b;
	private int power;

	public Desktop(Computadora b, int power) {
		this.b=b;
		this.power=power;
	}
	public Desktop() {
		this.b=b;
		this.power=0;
	}

	public Computadora getB() {
		return b;
	}

	public void setB(Computadora b) {
		this.b = b;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}	
	public String toString() {
		return ","+this.power+"W )";
	}	
}
