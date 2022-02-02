import java.util.HashSet;
import java.util.Set;

public class Colecciones {
    public static void main(String[] args){
        //Las colecciones nos sirven para almacenar un
		// conjunto de objetos
		
		//La diferencia de las colecciones y objetos
		//es que las colecciones son dinámicas, pueden cambiar
		//el número de objetos agregados
		
		//Set, tiene 3 implementaciones: 
		//No pueden contener elementos repetidos
		
		// 1) HashSet
		//Los elementos no mantienen un orden
		// Es la implementación más rápida
		
		/*Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");*/
		
		// forEach, puede recorrer una colección y en cada 
		//recorrido recupera el valor y lo podemos almacenar
		// en una variable 
		//Sintaxis
		//for(tipoDeDatoElemento variable : elementoARecorrer)
		
		/*for(String fruta : frutas) {
			System.out.println(fruta);
		}*/
		
		
		// 2) TreeSet
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		
		
		// 3) LinkedHashSet
    }
}
