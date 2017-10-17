package questoes;
import java.util.Scanner;

public class Questao_2 {
	
	public static Scanner sc = new Scanner(System.in);
	public static final int QTD_NUMS = 5;
	
//	public static void main(String[] args) {
//		int[] vet = new int[QTD_NUMS];
//		int[] vetInvertida = new int[QTD_NUMS];
//		
//		obterNumeros(vet);
//		inverterOrdemNumeros (vet,vetInvertida);
//		exibirVetores(vet,vetInvertida);		
//	}
	
	public static void obterNumeros(int[] vet) {	
		System.out.println("Informe 5 números:");	
	 	for(int i=0;i<vet.length;i++) {
	 		vet[i] = sc.nextInt();
	 	}
	}

	 public void inverterOrdemNumeros (int[] vet, int[] vetInvertida) {
		 int cont = 0;
		for (int i = vet.length-1; i >= 0; i--) {
			vetInvertida[cont] = vet[i];
			cont++;
		}
	 }

	 public static void exibirVetores(int[] vet, int[] vetInvertida) {
	 	System.out.println("Números informados:");
	 	for(int i=0;i<vet.length;i++) {
	 		System.out.print(vet[i]+ " ");
	 	}
	 	System.out.println("");
	 	System.out.println("Número em ordem inversa: ");
	 	for(int i=0;i<vet.length;i++) {
	 		System.out.print(vetInvertida[i]+ " ");
	 	}
	 }


}
