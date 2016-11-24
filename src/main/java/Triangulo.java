package main.java;

public class Triangulo {

	public static String calcular(Integer lado1, Integer lado2, Integer lado3) {
		String retorno = null;

		if (lado1 == null || lado2 == null || lado3 == null)
			return "";
		else if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0)
			retorno = "Não é um triângulo";
		else {
			if (lado1 == lado2 && lado2 == lado3)
				retorno = "O triângulo é Equilátero";
			else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
				retorno = "O triângulo é Isósceles";
			else
				retorno = "O triângulo é Escaleno";
		}
		return retorno;
	}

}
