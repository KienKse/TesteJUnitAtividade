package Teste;

import static org.junit.Assert.*;
import org.junit.Test;

import questoes.Questao_1;

public class Questao_1_Teste {
	
	@Test
	public void testando() {
		int[] vector=new int[]{4,8,7,4,3};
		Questao_1 teste=new Questao_1();
		int maior=teste.encontrarMaiorNumero(vector);
		int esperado = 8;
		assertEquals(esperado,maior);
		
	}
	
}
