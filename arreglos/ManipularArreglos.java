public class ManipularArreglos {
    public static void main(String[] args){
        /*Crea una clase llamara ManipularArreglo
		crea un array con los siguientes números enteros:

		1, 6, 45, 53, 80, 102, 145, 326, 450, 892
		Crea un programa que use un ciclo que tome los números de arreglo y devuelva la suma total, la suma de los números pares y la suma de los números impares.*/

        //Creación del array 
        int []numeros = new int[]{1, 6, 45, 53, 80, 102, 145, 326, 450, 892};

        //Declarar sumas
        int sumaTotal = 0;
        int sumaPar = 0;
        int sumaImpar = 0;

        //Sumar con ciclo
        for(int i = 0; i < numeros.length; i++){
            sumaTotal += numeros[i];

            //Suma de # par
            if(numeros[i] % 2 == 0){
                sumaPar += numeros[i];
            } else {
                sumaImpar += numeros[i];
            }
        }

        System.out.println("La suma total de los números es: " + sumaTotal);
        System.out.println("La suma total de los números pares es: " + sumaPar);
        System.out.println("La suma total de los números impares es: " + sumaImpar);

    }
}
