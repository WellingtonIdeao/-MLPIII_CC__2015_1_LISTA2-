package br.unipe.cc.ui;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparacaoSet {

	public static void main(String[] args) {
		Set<Integer> tree = new TreeSet<>();
		Set<Integer> linked = new LinkedHashSet<>();
		System.out.println("Iniciando testes de performance da treeSet...");
		long inic = System.currentTimeMillis();
		int it = 30000;
		for (int i = 0; i < it; i++) {
			tree.add(i);
		}
		for (int i = 0; i < it; i++) {
			tree.contains(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inic;
		System.out.println("Tempo gasto: " + tempo);
		inic = fim = tempo = 0;
		System.out.println("Iniciando testes de performance da LinkedHashSet...");
		inic = System.currentTimeMillis();
		for (int i = 0; i < it; i++) {
			linked.add(i);
		}
		for (int i = 0; i < it; i++) {
			linked.contains(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim-inic;
		System.out.println("Tempo gasto: " + tempo);
		
//      Conclusão da Comparação
		
//		Como podemos observar pela execução do codigo, a implementação TreeSet, 
//		na maioria das vezes é mais lenta que a implementação LinkedHashSet.
//		Em algumas execuções LinkedHashSet é três vezes mais rápida que a TreeSet.
//		A estrutura LinkedHashSet além de possuir todas as garantias da treeSet, seu
//		desempenho é bem superior e chega próximo ao desepenho da estrutura HashSet.
//		Logo isso pode ser um fator determinante para que o envio de mensagems esteja tão lenta no sistema do facebook.
//		Portanto, é recomendado a substituíção  de todas as implementações TreeSet por LinkedHashSet.
		
		

	}

}
