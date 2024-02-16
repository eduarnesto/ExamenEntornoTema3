package examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {
	/* Introduzco: 3| Espero: 
	 *    ***
		 *****
		*******
		 *****
		  ***
	 * Resultado:  
	 * 	  ***
		 *****
		*******
		 *****
		  ***
	 * Introduzco: 7| Espero: 
	 *        *******
		     *********
		    ***********
		   *************
		  ***************
		 *****************
		*******************
		 *****************
		  ***************
		   *************
		    ***********
		     *********
		      *******
	 * Resultado: 
	 *        *******
		     *********
		    ***********
		   *************
		  ***************
		 *****************
		*******************
		 *****************
		  ***************
		   *************
		    ***********
		     *********
		      *******
	 * Introduzco: ert| Espero: El valor introducido no es válido| 
	 * Resultado: El valor introducido no es válido
	 * Introduzco: -1| Espero: El valor introducido no es válido| 
	 * Resultado: El valor introducido no es válido
	 * Introduzco: 0| Espero: El valor introducido no es válido| 
	 * Resultado: El valor introducido no es válido
	 */

	public static void main(String[] args) {
		//Variable para guardar el número
		int num;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Compruebo que el valor introducido es válido
		try {
			//Pregunto cuanto mide el lado del hexágono
			System.out.println("¿Cúanto mide el lado del hexágono?");
			
			//Leo del teclado
			num=sc.nextInt();
			
			//Compruebo que sea mayor que 0
			if(num>0) {
				//Muestro el rombo
				
				//Imprimo la primera parte del rombo
				for(int fila=0; fila<num-1; fila++) {
					for(int columna=num; columna>fila+1; columna--) {
						System.out.print(" ");
					}
					for(int columna=1; columna<=num+(fila*2); columna++) {
						System.out.print("*");
					}
					System.out.println();
				}//Fin del for para imprimir la primera parte del rombo
				
				//Imprimo la segunda parte del rombo
				for(int fila=num; fila>0; fila--) {
					for(int columna=num; columna>fila; columna--) {
						System.out.print(" ");
					}
					for(int columna=1; columna<=num+(fila*2)-2; columna++) {
						System.out.print("*");
					}
					
					System.out.println();
				}//Fin del for para imprimir la segunda parte del rombo
			}//Fin del if para comprobar si el número es mayor de 0
			else {
				System.out.println("El valor introducido no es válido");
			}
			
		}//Fin del try 
		
		catch (InputMismatchException e){
			System.out.println("El valor introducido no es válido");
		}//Fin del catch
		
		//Cierro el Scanner
		sc.close();
			
	}//Fin del main

}//Fin del public class