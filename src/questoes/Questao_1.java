package questoes;
import java.util.Scanner;

public class Questao_1 {
	
	public  Scanner sc = new Scanner(System.in);
	
	public void obterNumeros(int[] vet) {	
		System.out.println("Informe 5 números:");	
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
	 	System.out.println("Dentre os números informados, o maior foi " + maior);
	 }

}
