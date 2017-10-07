package br.com.constantes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author WevKleyton Constante de lojas para teste de ip das filias
 */

public class ConstanteIpLojas {

	public String lojasEndereco(String loja){
		HashMap<String, String>  lojasIp = new HashMap<String, String>();

		lojasIp.put("1", "172.16.40.9");
		lojasIp.put("2", "172.16.40.175");
		lojasIp.put("3","172.16.40.22");
		lojasIp.put("4","172.16.40.24");
		lojasIp.put("5","172.16.40.180");
		lojasIp.put("6","172.16.40.237");
		lojasIp.put("7","172.16.40.238");
		
		return lojasIp.get(loja);
	}

}
