
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//creamos objeto		
		Puntos puntoA = new Puntos(2,4);
		
		Puntos puntoB = new Puntos(5,1);
		
			System.out.println("mi punto A es:" + puntoA);
			
			System.out.println("mi punto B es:" + puntoB);
		
			//llamamos al m�todo calcular distancia llamando a los puntos. 
			//El puntoA est� en el m�todo que es p�blico y al puntoB hay que llamarlo con el get.
		
			double distancia = puntoA.calcularDistancia (puntoB.getX(), puntoB.getY());
			
			System.out.println(distancia);
			
			double distancia = puntoA.calcularDistancia (puntoB.getX(), puntoB.getY());
			
			System.out.println(distancia);
			
		
		}
	
						
	}
