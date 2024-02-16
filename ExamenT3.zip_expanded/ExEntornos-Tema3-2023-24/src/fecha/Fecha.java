package fecha;

/**
 * Clase donde se guardan los atributos relacionados con la fecha
 */
public class Fecha {
	/**
	 * Atributo para guardar el dia
	 */
	private int d; // d�a

	/**
	 * Atributo para guardar el mes
	 */
	private int m; // mes

	/**
	 * Atributo para guardar el anio
	 */
	private int a; // a�o

	public Fecha() {

	}

	public Fecha(int dia, int mes, int anio) {
		this.d = dia;
		this.m = mes;
		this.a = anio;
	}

	/**
	 * Funcion que comprueba que la fecha sea posible
	 * 
	 * @return diaCorrecto Indica si el dia es correcto o no
	 * @return mesCorrecto Indica si el mes es el correcto
	 * @return anioCorrecto Indica si el anio es correcto
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		anioCorrecto = a > 0;
		mesCorrecto = m >= 1 && m <= 12;
		switch (m) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = d >= 1 && d <= 29;
			} else {
				diaCorrecto = d >= 1 && d <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = d >= 1 && d <= 30;
			break;
		default:
			diaCorrecto = d >= 1 && d <= 31;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	/**
	 * Funcion que comprueba si el anio es bisiesto o no
	 * 
	 * @return
	 */
	// M�todo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
	private boolean esBisiesto() {
		boolean esBisiesto = (a % 4 == 0 && a % 100 != 0 || a % 400 == 0);
		return esBisiesto;
	}

	/**
	 * Funcion que aniade un dia mas y si el dia resulta ser el ultimo del mes añade
	 * un mes más y vuelve al dia 1. No devuelve nada
	 */
	// M�todo diaSiguiente
	public void diaSiguiente() {
		d++;
		if (!fechaCorrecta()) {
			d = 1;
			m++;
			if (!fechaCorrecta()) {
				m = 1;
				a++;
			}
		}
	}

	/**
	 * Funcion que convierte la fecah en un String. Devuelve un String
	 */
	// M�todo toString
	public String toString() {
		if (d < 10 && m < 10) {
			return "0" + d + "-0" + m + "-" + a;
		} else if (d < 10 && m >= 10) {
			return "0" + d + "-" + m + "-" + a;
		} else if (d >= 10 && m < 10) {
			return d + "-0" + m + "-" + a;
		} else {
			return d + "-" + m + "-" + a;
		}
	}

}
