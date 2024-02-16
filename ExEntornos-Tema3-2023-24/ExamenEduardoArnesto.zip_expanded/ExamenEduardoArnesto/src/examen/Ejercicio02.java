package examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
	/* Introduzo: 145, n| Espero: 
		La cantidad mínima de billetes necesarias para tener 145€ es:
		1 billetes de 100€
		2 billetes de 20€
		1 billetes de 5€
		Has salido del programa
	 * Resultado:
		La cantidad mínima de billetes necesarias para tener 145€ es:
		1 billetes de 100€
		2 billetes de 20€
		1 billetes de 5€
		Has salido del programa
	 * Introduzo: 565, s| Espero: 
	    La cantidad mínima de billetes necesarias para tener 565€ es:
		1 billete de 500€
		1 billete de 50€
		1 billete de 10€
		1 billete de 5€
		Me vuelve a pedir otra cantidad, introduzco 145
		La cantidad mínima de billetes necesarias para tener 145€ es:
		1 billetes de 100€
		2 billetes de 20€
		1 billetes de 5€
	 * Resultado:
	   La cantidad mínima de billetes necesarias para tener 565€ es:
		1 billete de 500€
		1 billete de 50€
		1 billete de 10€
		1 billete de 5€
		Me pregunta si quiero introducir otra cantidad
		Introduzco nhhf
		Has salido del programa
		Me vuelve a pedir otra cantidad, introduzco 145
		La cantidad mínima de billetes necesarias para tener 145€ es:
		1 billetes de 100€
		2 billetes de 20€
		1 billetes de 5€ 
		Me pregunta si quiero introducir otra cantidad
		Introduzco nhhf
		Has salido del programa
	 * Introduzo: ert| Espero: Me vuelve a preguntar por la cantidad| Resultado: Me vuelve a preguntar por la cantidad
	 */

	public static void main(String[] args) {
		//Variable para la cantidad de dinero
		int dinero=0;
		
		//Variable para el resto de dinero
		int resto;
		
		//Varibale para la respuesta a si quiere salirse o no
		String respuesta;
		
		//Vatiables para guardar el número de billetes necesarios
		int numeroBilletes5;
		int numeroBilletes10;
		int numeroBilletes20;
		int numeroBilletes50;
		int numeroBilletes100;
		int numeroBilletes200;
		int numeroBilletes500;
		
		//Constantes para el valor de los billetes
		final int BILLETE5 = 5;
		final int BILLETE10 = 10;
		final int BILLETE20 = 20;
		final int BILLETE50 = 50;
		final int BILLETE100 = 100;
		final int BILLETE200 = 200;
		final int BILLETE500 = 500;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			//Compruebo que la cantidad introducida es mayor que 0 y múltiplo de 5
			do {
				//Compruebo que el valor introducido es del tipo correcto
				try {
					//Pregunto por la cantidad de dinero
					System.out.println("Introduzca una cantidad de dinero múltiplo de 5:");
					
					//Leo del Scanner
					dinero=sc.nextInt();
				} catch(InputMismatchException e) {
					//Muestro que el valor introducido no es válido
					System.out.println("Valor introducido no válido");
				} finally {
					//Limpio el Scanner
					sc.nextLine();
				}
			}while(dinero<=0||dinero%5!=0);//Fin del do while
			
			//Calculo el número de billetes de 500 necesarios
			numeroBilletes500=dinero/BILLETE500;
			
			//Calculo cuanto dinero sobra
			resto=dinero%BILLETE500;
			
			//Calculo el número de billetes de 200 necesarios
			numeroBilletes200=resto/BILLETE200;
			
			//Calculo cuanto dinero sobra
			resto=resto%BILLETE200;
			
			//Calculo el número de billetes de 100 necesarios
			numeroBilletes100=resto/BILLETE100;
			
			//Calculo cuanto dinero sobra
			resto=resto%BILLETE100;
			
			//Calculo el número de billetes de 50 necesarios
			numeroBilletes50=resto/BILLETE50;
			
			//Calculo cuanto dinero sobra
			resto=resto%BILLETE50;
			
			//Calculo el número de billetes de 20 necesarios
			numeroBilletes20=resto/BILLETE20;
			
			//Calculo cuanto dinero sobra
			resto=resto%BILLETE20;
			
			//Calculo el número de billetes de 10 necesarios
			numeroBilletes10=resto/BILLETE10;
			
			//Calculo cuanto dinero sobra
			resto=resto%BILLETE10;
			
			//Calculo el número de billetes de 5 necesarios
			numeroBilletes5=resto/BILLETE5;
			
			//Muestro la cantidad mínima de billetes necesaria
			System.out.println("La cantidad mínima de billetes necesarias para tener " + dinero + "€ es:");
			
			//Imprime si se necesitan billetes de 500
			if(numeroBilletes500!=0) {
				if(numeroBilletes500!=1) {
					System.out.println(numeroBilletes500 + " billetes de 500€");
				} else {
					System.out.println(numeroBilletes500 + " billete de 500€");
				}
			}//Fin del if
			
			//Imprime si se necesitan billetes de 200
			if(numeroBilletes200!=0) {
				if(numeroBilletes500!=1) {
					System.out.println(numeroBilletes200 + " billetes de 200€");
				} else {
					System.out.println(numeroBilletes200 + " billete de 200€");
				}
			}//Fin del if
			
			//Imprime si se necesitan billetes de 100
			if(numeroBilletes100!=0) {
				if(numeroBilletes500!=1) {
					System.out.println(numeroBilletes100 + " billetes de 100€");
				} else {
					System.out.println(numeroBilletes100 + " billete de 100€");
				}
				
			}//Fin del if

			//Imprime si se necesitan billetes de 50
			if(numeroBilletes50!=0) {
				if(numeroBilletes500!=1) {
					System.out.println(numeroBilletes50 + " billetes de 50€");
				} else {
					System.out.println(numeroBilletes50 + " billete de 50€");
				}
				
			}//Fin del if
			
			//Imprime si se necesitan billetes de 20
			if(numeroBilletes20!=0) {
				if(numeroBilletes500!=1) {
					System.out.println(numeroBilletes20 + " billetes de 20€");
				} else {
					System.out.println(numeroBilletes20 + " billete de 20€");
				}
				
			}//Fin del if
			
			//Imprime si se necesitan billetes de 10
			if(numeroBilletes10!=0) {
				if(numeroBilletes500!=1) {
					System.out.println(numeroBilletes10 + " billetes de 10€");
				} else {
					System.out.println(numeroBilletes10 + " billete de 10€");
				}
				
			}//Fin del if
			
			//Imprime si se necesitan billetes de 5
			if(numeroBilletes5!=0) {
				if(numeroBilletes500!=1) {
					System.out.println(numeroBilletes5 + " billetes de 5€");
				} else {
					System.out.println(numeroBilletes5 + " billete de 5€");
				}
				
			}//Fin del if
			try {
				//Pregunto si quiere introducir otra cantidad
				System.out.println("¿Desea introducir otra cantidad? Introduzca S para coninuar o N para salir");
				
				//Leo del teclado
				respuesta=sc.nextLine();
				
			} catch(InputMismatchException e) {
				respuesta="N";
			}
			
			//Si la respuesta es S continuo y si la respuesta es distinta me salgo del programa
			if(respuesta.equalsIgnoreCase("s")){
				resto=0;
				continue;
			}//Fin del if 
			else {
				System.out.println("Has salido del programa");
				//Cierro el Scanner aquí ya que al tratarse de un bucle que puede ser infinito da error
				sc.close();
				break;
			}//Fin del if
		}//Fin del for
	} //Fin del main
}//Fin del public class