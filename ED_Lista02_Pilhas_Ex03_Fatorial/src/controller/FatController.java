package controller;

import br.edu.fateczl.pilhas.PilhaInt;

public class FatController {
	
	public FatController() {
		super();
	}
	
	PilhaInt pilha = new PilhaInt();
	
	public int fatorial(int n) {
		for (int i = 1; i <= n; i++) {
			pilha.push(i);
		}
		
		int fat = 1;
		while (!pilha.isEmpty()) {
			try {
				fat = fat * pilha.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return fat;
	}
}

