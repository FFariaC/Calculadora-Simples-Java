import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		Double primeiroNumero = scanner.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		Double segundoNumero = scanner.nextDouble();

		String[] operacoes = new String[] {"Adição", "Subtração", "Multiplicação", "Divisão"};
		
		System.out.println("Digite a operação desejada: ");		
		
		for (int i = 0; i < operacoes.length; i++ ) {
			System.out.println(i + ": " + operacoes[i]);
		}
		
		Integer operacao = scanner.nextInt();		
		
		System.out.println("Operação escolhida: " + operacoes[operacao]);
		
		if (operacao.equals(0)) {
			System.out.println("Resultado: " + adicao(primeiroNumero, segundoNumero));			
		} else if (operacao.equals(1)) {
			System.out.println("Resultado: " + subtracao(primeiroNumero, segundoNumero));	
		} else if (operacao.equals(2)) {
			System.out.println("Resultado: " + multiplicacao(primeiroNumero, segundoNumero));	
		} else if (operacao.equals(3)) {
			System.out.println("Resultado: " + divisao(primeiroNumero, segundoNumero));	
		} else {
			System.err.println("Operação Inválida");
		}
		
		
		scanner.close();
				
	}
	
	static Double adicao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero + segundoNumero;
		
	}
	
	static Double subtracao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero - segundoNumero;
	}
	
	static Double multiplicacao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero * segundoNumero;
	}
	
	static Double divisao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero / segundoNumero;
	}
}

