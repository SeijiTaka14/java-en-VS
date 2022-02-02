import java.util.Scanner;

public class AngulosTriangulo {
    public static void main(String[] args) {
        /*Pedirle 3 ángulos a un usuario y 		decirle si es 		un triangulo válido*/
		
		System.out.println("Introduce 3 ángulos: ");
		
		//Pedir primer ángulo
		Scanner sc1 = new Scanner(System.in);
		int ang1 = sc1.nextInt();
		
		//Pedir segundo ángulo
		Scanner sc2 = new Scanner(System.in);
		int ang2 = sc2.nextInt();
		
		//Pedir tercer ángulo
		Scanner sc3 = new Scanner(System.in);
		int ang3 = sc2.nextInt();
		
		int suma = ang1 + ang2 + ang3;
		
		if(suma == 180) {
			System.out.println("La suma de los ángulos " + ang1 + " + " + ang2 + " + " + ang3 + " es: " + suma + ". ¡Es un triángulo!");
		} else if (suma != 180) {
			System.out.println("No es un triángulo válido");
		}
    }
}
