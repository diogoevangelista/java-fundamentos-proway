package src.br.com.fundamentos;

public class TrabalhoComVariavel {
	
	/*
	 * Tipos primitivos de dados
	 * https://medium.com/@mauriciogeneroso/java-oca-1z0-808-2-1-tipos-de-dados-vari%C3%A1veis-vari%C3%A1veis-primitivas-e-de-refer%C3%AAncia-c8f007756bc5
	 */
	public static void main (String[] args) {
		int quantidade ; // Declarando variavel inteiro
		quantidade = 10; // atribuindo o valor 10
		
		System.out.println(quantidade);
		
		quantidade = 15;
		
		System.out.println(quantidade);
		
		double numeroComVirgula;
		numeroComVirgula = 1.3;
		
		System.out.println("numero decimal -> " + numeroComVirgula);
		
		float numeroComVirgulaPontoFluante = 1.5f;
		System.out.println("numero decimal com float -> " + numeroComVirgulaPontoFluante);
		
		long numeroInteiroGrande = 25l;
		
		System.out.println("numero inteiro com long -> " + numeroInteiroGrande);
		
		//double precoProduto = 9.43;
		
		//boolean alunoMatriculado = true;
		//boolean clienteBloqueado = false;
		
		//char turmaAluna1 = 'A';
		//char tipoCliente = '2';
		//char simbolo = '@';
		
		//String nomePessoa = "Diogo";
		
		long populacaoUberlandia = 650000;
		System.out.println(populacaoUberlandia);
		
		long populacaoMundial = 7000000000L;
		System.out.println(populacaoMundial);
		
		float saldoConta = 1030.43F;
		System.out.println(saldoConta);
		
	}
	
	
}
