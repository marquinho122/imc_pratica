package application;

import java.util.Locale;

import entities.Paciente;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Paciente paciente1 = new Paciente(71.0, 1.70);
		Paciente paciente2 = new Paciente(90.0, 1.50);
		Paciente paciente3 = new Paciente(99.0, 1.80);
		
		System.out.printf("%.2f%n",paciente1.calcularIMC());
		System.out.printf("%.2f%n",paciente2.calcularIMC());
		System.out.printf("%.2f%n",paciente3.calcularIMC());
		
		String dig1 = paciente1.diagnostico();
		String dig2 = paciente2.diagnostico();
		String dig3 = paciente3.diagnostico();
		
		System.out.println(dig1);
		System.out.println(dig2);
		System.out.println(dig3);
		
		
	}

}
