
public class Puntos {

	private int x;
	private int y;
	
	// Constructor// Dentro del objeto no hace falta SET Y GET usar dentro de la
		// CLASE, se usan desde el MAIN//
	public Puntos(int x, int y) {

		this.setX(x);
		this.setY(y);

	
	// Siempre público y el nombre del constructor igual al de la clase//

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;

	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;

	}

	
	public double calcularDistancia (int x, int y) {

		int cateto1 = Math.abs(this.x - x);
		int cateto2 = Math.abs(this.y - y);
		int cuadradoCateto1 = (cateto1 * cateto1);
		int cruadradoCateto2 = (cateto2 * cateto2);
		int cuadradoHipotenusa = cuadradoCateto1 + cruadradoCateto2;
		double distancia = Math.sqrt(cuadradoHipotenusa);
		return distancia;
		
			}
	
	public double calcularDistancia(Puntos miOtroPunto) {
		
		return this.calcularDistancia(miOtroPunto.getX(), miOtroPunto.getY());
	}

	// Definir un método toString, siempre devuelve un String. Es lo mismo que la
		// clase MOSTRARDATOS//

	
	public String toString() {
		
		return "El punto 1 es ("+ this.x + "," + this.y +")";

		

}

	
		
	}
