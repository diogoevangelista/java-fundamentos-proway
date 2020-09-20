package src.br.com.fundamentos;

public class ProgressaoAritimetica {
	
		public static void main(String[] args) {
			int inicial = 1;
			int quociente = 2;
			int gn = inicial;
			int valor_max = 32;
			
			System.out.printf("elementos da pg, de valor inicial %d e razão %d, menores que %d/n" , inicial, quociente, valor_max);
			
				while (gn <= valor_max) {
					System.out.println(gn);
					gn *= quociente;
				}
		}
		

}
