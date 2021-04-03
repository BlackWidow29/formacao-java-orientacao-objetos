
public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		// Atribuicao de valores e não referencia
		segundo = primeiro;
		primeiro = 10;
		// Segundo continua sendo 5
		System.out.println(segundo);
	}
}
