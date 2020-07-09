
public class Computadora {
	private String codigo, marca, eslogan;
	private double precio;
	
	public Computadora() {
		this.codigo="";
		this.marca="";
		this.eslogan="";
		this.precio=0;
	}
	public Computadora(String c, String m, String s, double p) {
		this.codigo=c;
		this.marca=m;
		this.eslogan=s;		
		this.precio=p;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getEslogan() {
		return eslogan;
	}
	public void setEslogan(String eslogan) {
		this.eslogan = eslogan;
	}
	public String toString() {
		return "("+this.codigo+","+this.marca+","+this.eslogan+",$"+this.precio;
	}
}
