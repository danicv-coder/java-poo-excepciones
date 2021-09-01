package org.danicv.excepciones;

import javax.swing.JOptionPane;

public class EjemploExcepciones {

	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		String valor = JOptionPane.showInputDialog("Ingrese un numerador");
		String valor2 = JOptionPane.showInputDialog("Ingrese un denominador");

		int divisor;
		try {
			divisor = Integer.parseInt(valor);
			cal.dividir(10, divisor);
			System.out.println(divisor);
			
			double division2 = cal.dividir(valor, valor2);
			System.out.println("division2: " + division2);

		} catch (DivisionPorZeroExcepcion e) {
			System.out.println("Se capturo el error " + e.getMessage());
		}

		catch (FormatoNumeroExcepcion nfe) {
			System.out.println("Se capturo el error: " + nfe.getMessage());
			main(args);
		}
		catch (NumberFormatException e) {
			System.out.println("Se capturo el error: " + e.getMessage() );
		}

		finally {
			System.out.println("flujo normal de la aplicacion");
		}
	}

}
