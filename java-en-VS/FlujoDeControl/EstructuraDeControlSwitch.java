import java.util.Scanner;

public class EstructuraDeControlSwitch {
    //Estructuras de control nos sirve para controlar el flujo de comportamiento de un programa.
	
	/*
	 * switch(condicion_a_evaluar) {
	 * 	case "valor":
	 *		//código a ejecutar
	 *		//break;
	 *	case "n":
	 *		//codigo a ejecutar
	 *		//break;
	 *
	 *	default:
	 *		//código a ejecutar  
	 */
	
	public static void main(String[] args) {
		//Solicitarle al usuario un día de la semana y mostrarle un mensaje
		
		System.out.println("¿Qué día de la semana es?");
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine();
		
		
		switch(dia.toLowerCase()) {
			case "lunes":
				System.out.println("Odio los lunes...");
				break;
			case "martes":
				System.out.println("Otro lunes? No gracias");
				break;
			case "miercoles":
				System.out.println("What a week, huh? Captain it's wednseday");
				break;
			case "jueves":
				System.out.println("Ya más para allá que para acá");
				break;
			case "viernes":
				System.out.println("Lo lograste");
				break;
			case "sabado":
				System.out.println("Disfrútalo, se pasa rápido");
				break;
			case "domingo":
				System.out.println("Domingo con sabor a lunes :(");
				break;
		}
		
	}
}
