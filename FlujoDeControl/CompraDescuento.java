import java.util.Scanner;

public class CompraDescuento {
    public static void main(String[] args) {
        // solicitar el total de una compra por consola.
		// si la cuenta es de menos de 1000
		// sila cuenta es de 1001 - 4999 10%
		// si la cuenta es de 5001 a 9999 20%
		// si la copra es de 10000 o más 30%
		
		System.out.println("Introduzca el total de su compra: ");
		
		//Pedir total de compra a usario
		Scanner compra = new Scanner(System.in);
		double totalCompra = compra.nextDouble();
		
		//No aplica descuento
		if(totalCompra <= 999) {
			System.out.println("El monto de su compra no es válido para descuento");
			
			//Descuento del 10%
		} else if (totalCompra >= 1000 && totalCompra <= 4999) {
			double compraDescuento = totalCompra * 0.90;
			System.out.println("El total de su compra con descuento es: " + "$" + compraDescuento);
			//Descuento del 20%
		} else if (totalCompra >= 5000 && totalCompra <=9999) {
			double compraDescuento = totalCompra * 0.80;
			System.out.println("El total de su compra con descuento es: " + "$" + compraDescuento);
			//Descuento del 30%
		} else {
			double compraDescuento = totalCompra * 0.70;
			System.out.println("El total de su compra con descuento es: " + "$" + compraDescuento);
		}

	}
}

