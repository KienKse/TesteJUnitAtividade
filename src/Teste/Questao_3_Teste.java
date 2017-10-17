package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import questoes.Questao_3;

public class Questao_3_Teste {
			
			@Test
			public void testando() {
				Questao_3 teste=new Questao_3();
				int num = 23;
				boolean numPrimo = teste.verificarNumeroPrimo(num);
				boolean esperado = true;
				assertEquals(esperado,numPrimo);			
			}
}