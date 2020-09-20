package src.br.com.fundamentos;

public class lacoEncadeadoFor {

		public static void main(String[] args) {
			
			for (int linha = 1; linha <= 10; linha++) {
				
				for (int coluna = 1; coluna <= 10; coluna++) {
					if(coluna > linha) {
						break;
					}
					System.out.println("*");
				}
			System.out.println();
			}
			
		}
}
