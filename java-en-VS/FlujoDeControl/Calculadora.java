import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        /*
		   * Pedir al usuario 2 números por consola y preguntarle que desea realizar
		   * 1) Suma
		   * 2) Resta
		   * 3) División
		   * 4) Multiplicación
		   * 
		   * y despues imprimir el resultado
		   */

        System.out.println("Selecciona una operación a realizar: 1. Suma    2. Resta    3. División     4. Multiplicación   (Introduce sólo el número");

        //Pedir la operación a realizar
        Scanner scOp = new Scanner(System.in);
        int op = scOp.nextInt();

        //Pedir el primer número
        System.out.println("Introduce el primer número: ");
        Scanner scNum = new Scanner(System.in);
        double num1 = scNum.nextDouble();
        
        //Pedir el segundo número
        System.out.println("Introduce el segundo número: ");
        double num2 = scNum.nextDouble();

        //Switch

        switch(op) {
            case 1:
                System.out.println("El resultado de la suma de " + num1 + " + " + num2 + " es: " + (num1 + num2));
                break;
            
            case 2:
                System.out.println("El resultado de la resta de " + num1 + " - " + num2 + " es: " + (num1 - num2));
                break;
            
            case 3:
                System.out.println("El resultado de la división de " + num1 + " / " + num2 + " es: " + (num1 / num2));
                break;

            case 4:
                System.out.println("El resultado de la multiplicación de " + num1 + " * " + num2 + " es: " + (num1 * num2));
                break;

            default:
                System.out.println("Operación no válida por el momento");
        }

    }
}
