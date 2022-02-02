public class Ciclos {
    public static void main(String[] args) {
        /*//while
		int control1 = 0;
		
		while(control1 < 10) {
			System.out.println("Control = " + control1);
			control++;
		}*/
		
		//do while
		
		/*int control2= 3;
		
		do {
			//Código a ejecutar
			System.out.println("Control = " + control2);
			
			//Modificador de la variable control
			control2++;
		} while(control2 < 3);
		*/
		
		// for
		/*
		for(int i = 0; i < 3; i++) {
			System.out.println("Control = " + i);
		}
		//break & continue
		*/
		
		/*for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) { //Números pares
				System.out.println("Control = " + i);
				break; //termina el ciclo
				//solo deja que se ejecute una vez lo que está 				antes
				
			}
			
		}*/
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue; //permite saltarnos una ejecución del ciclo
				//deja que continúe el ciclo
			}
			System.out.println("Control = " + i);
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Control2 = " + i);
			continue;
		}
    }
}
