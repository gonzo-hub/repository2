
import java.util.Scanner;

public abstract class Menu {
	
	
	public static void imprimirMenu() {
		
		System.out.println ("1. Calcular �rea tri�ngulo");
		System.out.println ("2. Calcular �rea cuadrado");
		System.out.println ("3. Calcular �rea c�rculo");
		System.out.println ("4. Calcular �rea rombo");
		System.out.println ("5. Calcular �rea rect�ngulo");
		
	}
	
	public static void interpretarOpcion() {
		
		int option;
		option = 1;
		switch(option) {
		
		case 1:
		{
			System.out.println("Calcular �rea tri�ngulo");	
			break;	
		}
				
		case 2:
		{
			System.out.println("Calcular �rea cuadrado");	
			break;
		}
		
		case 3:{
			System.out.println("Calcular �rea c�rculo");	
			break;
		}
		
		case 4:{
			System.out.println("Calcular �rea rombo");	
			break;			
		}
		
		
		case 5:{
			System.out.println("Calcular �rea rect�ngulo");	
			break;
		}
		
		default:{
		
		System.out.println("La opci�n elegida no es correcta");
		}
		
		}
	}
}
		
		
		
		
	

