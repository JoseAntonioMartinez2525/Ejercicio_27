import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);		
		int c;
		Laptop a=new Laptop();
		Desktop b=new Desktop();
		
		System.out.println("Ingrese los datos de la computadora: ");
		System.out.println("Ingrese 1.laptop, 2.Escritorio");
		c=teclado.nextInt();
		switch (c) {
		case 1:registrarLaptop();break;
		case 2:registrarDesktop();break;
		default:
			break;
		}
			
		
	}

	static void registrarLaptop() {
		Laptop x=new Laptop();
		Computadora n=new Computadora();		
		Scanner teclado = new Scanner(System.in);		
		System.out.print("Ingrese el codigo: ");
		n.setCodigo(teclado.nextLine());
		System.out.print("Ingrese la marca: ");
		n.setMarca(teclado.nextLine());
		System.out.print("Ingrese el eslogan: ");		
		n.setEslogan(teclado.nextLine());
		System.out.print("Ingrese el precio: $");
		n.setPrecio(teclado.nextDouble());
		System.out.print("Ingrese el peso: ");
		x.setPeso(teclado.nextDouble());		
		System.out.println("\nCaracteristicas: ");
		System.out.println(n.toString()+","+x.toString());

		
	}
	
	static void registrarDesktop() {
		Desktop y=new Desktop();
		Computadora n=new Computadora();		
		Scanner teclado = new Scanner(System.in);		
		System.out.print("Ingrese el codigo: ");
		n.setCodigo(teclado.nextLine());
		System.out.print("Ingrese la marca: ");
		n.setMarca(teclado.nextLine());
		System.out.print("Ingrese el eslogan: ");		
		n.setEslogan(teclado.nextLine());
		System.out.print("Ingrese el precio: $");
		n.setPrecio(teclado.nextDouble());
		System.out.print("Ingrese la fuente de poder: ");
		y.setPower(teclado.nextInt());		
		System.out.println("\nCaracteristicas: ");
		System.out.println(n.toString()+","+y.toString());

		
	}	
	
}
