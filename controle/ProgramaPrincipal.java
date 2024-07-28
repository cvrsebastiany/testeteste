package controle;

import modelo.Livro;
import visao.Janela;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		Janela j= new Janela();
		j.setVisible(true);
		Livro liv= new Livro();
		Controle livCon= new Controle(j, liv);
	}

}