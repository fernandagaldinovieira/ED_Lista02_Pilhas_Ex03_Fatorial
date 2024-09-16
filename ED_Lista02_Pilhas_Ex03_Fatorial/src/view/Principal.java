package view;

import controller.FatController;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {

		FatController fatController = new FatController();
		
		int n = -1;
		while(n < 0 || n > 10) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 10: "));
			if (n < 0 || n > 10) {
				n = Integer.parseInt(JOptionPane.showInputDialog("Número Inválido. Digite um número entre 0 e 10: "));
			}
		}
		
		System.out.println(fatController.fatorial(n));
	}

}
