import java.util.Scanner;

public class Questao_3 {
	
	public static Scanner sc = new Scanner(System.in);	

	public static void main(String[] args) {
		int num = obterNumero();
		verificarNumeroPrimo(num);
		boolean situacaoPrimo = verificarNumeroPrimo(num);
		exibirResulado(num, situacaoPrimo);		
	}
	
	public static int obterNumero(){
		System.out.println("Informe um n�mero maior ou igual � zero:");
		return sc.nextInt();
	}

	public static boolean verificarNumeroPrimo(int n) {
		int contPrim = 0;
		for (int i=1;i<=n;i++) {
			if(n%i==0) {
				contPrim++;	
			}
		}
		if (contPrim > 2) {
			return false;
		}
		return true;
	}

	public static void exibirResulado(int n, boolean situacaoPrimo) {
		if(situacaoPrimo) {
			System.out.println("O n�mero " + n + " � primo.");
		} else {
			System.out.println("O n�mero " + n + " n�o � primo.");
		}
		
	}





}
