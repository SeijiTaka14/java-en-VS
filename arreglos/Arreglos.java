public class Arreglos {
    public static void main(String[] args){
        //En Java, solo pueden almacenar 1 tipo de dato
		//Tenemos que especificar el tamaño / cantidad 
		// de elementos que va a contener
		
		// 1era manera de crear un array en Java
		
		int numeros[]; //creamos la variable
		numeros = new int[4]; //creamos el arreglo
		
		//2a manera de crear un array en Java
		String[] nombres = new String[4];
		
		//3era manera - array literal
		String []nombreFrutas = new String[]{"Manzana", "Plátano", "uva", "Pera"};
		
		//Poner elementos en los arrays
		
		numeros[0] = 10; //10 es el primer elemento del array
		numeros[1] = 14;
		numeros[2] = 18;
		numeros[3] = 100;
		
		nombres[0] = "Seiji";
		nombres[1] = "Pedro";
		nombres[2] = "Daniel";
		nombres[3] = "Luis";
		
		
		System.out.println(numeros[0]);
		
		for(int i = 0; i < numeros.length; i++) {
			//en los arrays .length es una propiedad por eso va sin () 
			System.out.println("Elemento de números: " + numeros[i]); 
			System.out.println("Elemento de nombres: " + nombres[i]);
			System.out.println("Elemento de nombres: " + nombreFrutas[i]);
			System.out.println("-------------------------");
		}
    }
}
