package org.danicv.excepciones;

public class Calculadora {

	public double dividir(int num1, int dividiendo) throws DivisionPorZeroExcepcion {
		if (dividiendo == 0) {
			throw new DivisionPorZeroExcepcion("No se puede dividir por cero");
		}
		return num1 / (double) dividiendo;
	}

	public double dividir(String num, String divisor) throws DivisionPorZeroExcepcion, FormatoNumeroExcepcion {

		try {
			int num1 = Integer.parseInt(num);
			int div = Integer.parseInt(divisor);
			return this.dividir(num1, div);

		} catch (NumberFormatException e) {
			throw new FormatoNumeroExcepcion("Debes ingresar un numero en el numerador y divisor");
		}
	}
}
