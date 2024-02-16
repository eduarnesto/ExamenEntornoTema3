package fecha;

/**
 * Clase donde se guardan los atributos relacionados con la fecha
 */
public class Fecha {
	public static final int DIEZ = 10;

	/**
	 * Atributo para guardar el dia
	 */
	private int dia; // d�a

	/**
	 * Atributo para guardar el mes
	 */
	private int mes; // mes

	/**
	 * Atributo para guardar el anio
	 */
	private int anio; // a�o

	public Fecha() {

	}

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	/**
	 * Funcion que comprueba que la fecha sea posible
	 * 
	 * @return diaCorrecto Indica si el dia es correcto o no
	 * @return mesCorrecto Indica si el mes es el correcto
	 * @return anioCorrecto Indica si el anio es correcto
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto;
		boolean mesCorrecto;
		boolean anioCorrecto;
		anioCorrecto = anio > 0;
		mesCorrecto = mes >= 1 && mes <= 12;
		boolean diaMayor1 = dia >= 1;
		switch (mes) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = diaMayor1 && dia <= 29;
			} else {
				diaCorrecto = diaMayor1 && dia <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = diaMayor1 && dia <= 30;
			break;
		default:
			diaCorrecto = diaMayor1 && dia <= 31;
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
		return anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0;
	}

	/**
	 * Funcion que aniade un dia mas y si el dia resulta ser el ultimo del mes añade
	 * un mes más y vuelve al dia 1. No devuelve nada
	 */
	// M�todo diaSiguiente
	public void nextDay() {
		dia++;
		if (!fechaCorrecta()) {
			dia = 1;
			mes++;
			if (!fechaCorrecta()) {
				mes = 1;
				anio++;
			}
		}
	}

	/**
	 * Funcion que convierte la fecha en un String. Devuelve un String
	 */
	// M�todo toString
	public String toString() {
		String fecha;
		if (dia < DIEZ && mes < DIEZ) {
			fecha = "0" + dia + "-0" + mes + "-" + anio;
		} else if (dia < DIEZ && mes >= DIEZ) {
			fecha = "0" + dia + "-" + mes + "-" + anio;
		} else if (dia >= DIEZ && mes < DIEZ) {
			fecha = dia + "-0" + mes + "-" + anio;
		} else {
			fecha = dia + "-" + mes + "-" + anio;
		}
		return fecha;
	}

}
