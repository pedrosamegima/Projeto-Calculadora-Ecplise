package Calculadora;

public class Principal {

	public static void main(String[] args) {
		Adicionar adicionar = new Adicionar();
		System.out.println(adicionar.somar(5, 8));
		
		Subtrair subtrair = new Subtrair();
		System.out.println(subtrair.sub(77, 33));
		
		Calcular calcular = new Calcular();
		System.out.println(calcular.div(100, 5));
		System.out.println(calcular.mult(8, 4));
		
		Expo expo = new Expo();
		System.out.println(expo.exp(8, 7));

	}

}
