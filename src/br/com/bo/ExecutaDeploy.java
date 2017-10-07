package br.com.bo;

import br.com.constantes.ConstanteComandos;
import br.com.utilitarios.Conecta;

/**
 * 
 * @author WevKleyton
 * 
 */
public class ExecutaDeploy {
	
	public String deploy(String loja) {
		ConstanteComandos contante = new ConstanteComandos();
		String saida = null;

		Conecta conecta = new Conecta();
		try {
			saida = conecta.Conecta("sco" + loja.toLowerCase(), contante.getDeploy_sh());
			saida = conecta.Conecta("sco" + loja.toLowerCase(), contante.getLog());
			System.out.println("baixando release: " + saida);

		} catch (Exception e) {
			System.out.println("ERRO:" + loja + e);
		}
		return saida;
	}
}