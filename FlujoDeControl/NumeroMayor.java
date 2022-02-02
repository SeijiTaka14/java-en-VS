import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        /*
		 * Pedir 3 numeros al usuario y mostrar un mensaje con el número mayor
		 */

         System.out.println("Introduce 3 números: ");
        
         Scanner sc1 = new Scanner(System.in);
         int num1 = sc1.nextInt();
         
         Scanner sc2 = new Scanner(System.in);
         int num2 = sc2.nextInt();
         
         Scanner sc3 = new Scanner(System.in);
         int num3 = sc3.nextInt();
         
         if(num1 > num2 && num1 > num3) {
             System.out.println("El número mayor es " + num1);
         } else if (num2 > num1 && num2 > num3) {
             System.out.println("El número mayor es " + num2);
         } else {
             System.out.println("El número mayor es " + num3);
         }
         
    }
}
