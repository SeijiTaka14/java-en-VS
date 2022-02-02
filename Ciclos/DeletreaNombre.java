import java.util.Scanner;

public class DeletreaNombre {
    public static void main(String[] args){
        System.out.println("Introduzca su nombre: ");

        //Pedir nombre a usuario
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        //Imprimir las letras del nombre de usuario
        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
}
