
public class DesafioMultiplosDeTres {
	public static void main(String[] args) {
		//Forma um
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		//Forma dois
		for (int i = 3; i < 100; i += 3) {
			System.out.println(i);
		}
	}
}
