package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhaint.Pilha;
import controller.FatController;

public class Main {

	public static void main(String[] args) throws Exception {
		
		int valor;
		
		do {

			valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		} while(valor < 0 || valor > 10);
		
		FatController fController = new FatController();
		fController.fatorial(valor);

	}

}
