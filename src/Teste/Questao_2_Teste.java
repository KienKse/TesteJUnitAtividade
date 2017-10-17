package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import questoes.Questao_2;

public class Questao_2_Teste {
		
		@Test
		public void testando() {
			int[] vet=new int[]{7,9,12,5,2};
			Questao_2 teste=new Questao_2();
			int[] vetEsperado=new int[]{2,5,12,9,7};
			int[] vetinvertido=new int[5];
			teste.inverterOrdemNumeros(vet, vetinvertido);
			assertArrayEquals(vetEsperado, vetinvertido);
			
		}
		
	}
