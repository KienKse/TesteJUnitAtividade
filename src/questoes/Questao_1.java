package questoes;
import java.util.Scanner;

public class Questao_1 {
	
	public static Scanner sc = new Scanner(System.in);

//	public static void main(String[] args) {
//		int maior;
//		final int QTD_NUMS = 5;		
//		int[] vet = new int[QTD_NUMS];		
//
//		obterNumeros(vet);
//		maior = encontrarMaiorNumero (vet);
//		exibirMaiorNumero(maior);
//		
//	}
	
	public void obterNumeros(int[] vet) {	
		System.out.println("Informe 5 n�meros:");	
	 	for(int i=0;i<vet.length;i++) {
	 		vet[i] = sc.nextInt();
	 	}
	}


	 public int encontrarMaiorNumero(int[] vet) {
	 	int m = vet[0];
	 	 for(int i=0;i<vet.length;i++) {
	 		if(m < vet[i]) {
	 			m = vet[i];
	 		}
	 	}
	 	return m;
	 }

	 public void exibirMaiorNumero(int maior) {
	 	System.out.println("Dentre os n�meros informados, o maior foi " + maior);
	 }

}
