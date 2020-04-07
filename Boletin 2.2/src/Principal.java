import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		Menu.imprimirMenu();
			
		System.out.println("Introduzca la opción deseada: ");
		
		
		
		int opcion;
		
		opcion = teclado.nextInt();
		
		if(opcion==1) {
			
			Triangulo Area = new Triangulo();
			
			System.out.println ("El área del triángulo es "+ Area.areaTriangulo);
						
		}
		
		else if (opcion==2){
			
			Cuadrado Area = new Cuadrado();
			
			System.out.println ("el área del cuadrado es " + Area.areaCuadrado);
		}
		
		else if(opcion==3){
			
			Circulo Area = new Circulo();
			
			System.out.println ("el área del círculo es " + Area.areaCirculo);
		}
		
		else if (opcion==4){
			
			Rombo Area = new Rombo();
			
			System.out.println ("el área del rombo es " + Area.areaRombo);
		}
		
		else if(opcion==5){
			
			Rectangulo Area = new Rectangulo();
			
			System.out.println ("el área del rectángulo es " + Area.areaRectangulo);
		}
		
		else if(opcion>5) {
			
			System.out.println ("La opción elegida no es correcta");
		}
	}

}
