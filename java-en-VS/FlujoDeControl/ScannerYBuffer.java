import java.util.Scanner;

public class ScannerYBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int numero1 = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
	

		System.out.println("Tu número es: " + numero1 + " Tu nombre es: " + nombre);
		
		
		/*System.out.println("Introduce otro número: ");
		//Se puede usar sc otra vez (en lugar de usar sc1, etc.)
		
		int numero2 = sc.nextInt();
		*/
    }
}
