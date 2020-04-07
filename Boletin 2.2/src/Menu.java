
import java.util.Scanner;

public abstract class Menu {
	
	
	public static void imprimirMenu() {
		
		System.out.println ("1. Calcular área triángulo");
		System.out.println ("2. Calcular área cuadrado");
		System.out.println ("3. Calcular área círculo");
		System.out.println ("4. Calcular área rombo");
		System.out.println ("5. Calcular área rectángulo");
		
	}
	
	public static void interpretarOpcion() {
		
		int option;
		option = 1;
		switch(option) {
		
		case 1:
		{
			System.out.println("Calcular área triángulo");	
			break;	
		}
				
		case 2:
		{
			System.out.println("Calcular área cuadrado");	
			break;
		}
		
		case 3:{
			System.out.println("Calcular área círculo");	
			break;
		}
		
		case 4:{
			System.out.println("Calcular área rombo");	
			break;			
		}
		
		
		case 5:{
			System.out.println("Calcular área rectángulo");	
			break;
		}
		
		default:{
		
		System.out.println("La opción elegida no es correcta");
		}
		
		}
	}
}
		
		
		
		
	

