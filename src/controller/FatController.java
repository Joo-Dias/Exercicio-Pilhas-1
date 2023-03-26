package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class FatController {
	
	public void fatorial(int valor) throws Exception {
		
		Pilha pilha = new Pilha();
		pilha.push(valor);
		int resultado = 1;
		
		while(!pilha.isEmpty()) {
			int n = pilha.pop();
			resultado = resultado * n;
			if(n > 1) {
				pilha.push(n - 1);
			}
		}
		
		System.out.println("O fatorial de "+valor+" é "+resultado);
	}

}
