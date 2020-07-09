
public class Laptop extends Computadora {
	private Computadora a;
	private double peso;
	
	public Laptop() {
		this.a=a;
		this.peso=peso;
	}	
	public Laptop(Computadora a, double peso) {
		this.a=a;
		this.peso=0;
	}
	public Computadora getA() {
		return a;
	}
	public void setA(Computadora a) {
		this.a = a;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String toString () {
		return ","+this.peso+"Kg)";
	}
}
