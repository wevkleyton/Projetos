package br.com.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.bean.Release;
import br.com.constantes.ConstanteComandos;
import br.com.utilitarios.Conecta;

/**
 *
 * @author WevKleyton
 *
 */
public class VerificaUltimaReleasesFiliais  extends javax.swing.JDialog {
	Release release = new Release();
	ConstanteComandos constantes = new ConstanteComandos();
	Conecta conecta = new Conecta();

//	String releaseAplicada ;
	@SuppressWarnings("static-access")
	public String verRelease(String loja, int qtdloja) {
		String lojaComParametros = null;
		
		System.out.println("Loja => " + loja);

		release.setReleaseAplicada("cat /var/lib/tomcat6/webapps/cliente_" + loja.toLowerCase() +
				"/socic-" + loja.toLowerCase() + "-client.jnlp |grep Update |cut -d\"-\" -f3 |cut -d\" \" -f3");
//15950567
		try {
 		    if (loja.equals("STI")){
				release.setLoja(loja.toUpperCase());
				release.setReleaseAplicada(conecta.Conecta("ubt" + loja.toLowerCase(), release.getReleaseAplicada()));
				release.setReleaseBaixada(conecta.Conecta("ubt" + loja.toLowerCase(), constantes.getUltima_releaseJap()));
				lojaComParametros = release.getLoja() + "," + release.getReleaseBaixada() + "," +  release.getReleaseAplicada();
			}else if (loja.equals("BME")) {
				release.setReleaseAplicada("cat /var/lib/tomcat6/webapps/cliente_bmt" + "/socic-bmt" + "-client.jnlp |grep Update |cut -d\"-\" -f3 |cut -d\" \" -f3");
				release.setLoja(loja.toUpperCase());
				release.setReleaseAplicada(conecta.Conecta("172.17.7.2" , release.getReleaseAplicada()));
				release.setReleaseBaixada(conecta.Conecta("172.17.7.2" , constantes.getUltima_releaseJap()));
				lojaComParametros = release.getLoja() + "," + release.getReleaseBaixada() + "," +  release.getReleaseAplicada();
				
				
			}else if (loja.equals("SAA")) {
				release.setLoja(loja.toUpperCase());
				release.setReleaseAplicada(conecta.Conecta("scosta" , release.getReleaseAplicada()));
				release.setReleaseBaixada(conecta.Conecta("scosta" , constantes.getUltima_releaseJap()));
				lojaComParametros = release.getLoja() + "," + release.getReleaseBaixada() + "," +  release.getReleaseAplicada();
				
			}else{
				
				release.setLoja(loja.toUpperCase());
				release.setReleaseBaixada(conecta.Conecta("sco" + loja.toLowerCase(), constantes.getUltima_release()));
				release.setReleaseAplicada(conecta.Conecta("sco" + loja.toLowerCase(), release.getReleaseAplicada()));
				lojaComParametros = release.getLoja() + "," + release.getReleaseBaixada() + ","
						+ release.getReleaseAplicada();
			}
//		    fwDialog.disable();
		    
		} catch (Exception e) {
			System.out.println(e);
			lojaComParametros = release.getLoja() + "," + "Falha de Autenticação" + "," + "Falha de Autenticação";
		}
		return lojaComParametros;

	}

	public List executaReleaseList(String loja){
		List<String> comandos = new ArrayList<String>();
		release.setReleaseAplicada("cat /var/lib/tomcat6/webapps/cliente_" + loja.toLowerCase() + "/socic-" + loja.toLowerCase().subSequence(3, 6) + "-client.jnlp |grep Update |cut -d\"-\" -f3 |cut -d\" \" -f3");
		try {

			comandos.add(release.getReleaseAplicada());
			comandos.add(release.getReleaseBaixada());
			Conecta.Conecta(loja, comandos);
		}catch (Exception e){
			e.printStackTrace();
		}
		return comandos ;
	}

	@SuppressWarnings("static-access")
	public void BaixarRelease(String loja, int tdloja) {
		try {
			release.setLoja(loja.toUpperCase());
			
			if (loja.equals("AMT")){
				conecta.Conecta("alt" + loja.toLowerCase(), constantes.getDiretorio() + constantes.getBaixaRelase());
			}else if (loja.equals("STI")){
				conecta.Conecta("ubt" + loja.toLowerCase(), constantes.getDiretorio() + constantes.getBaixaRelase());
			}else if (loja.equals("SAA")){
				conecta.Conecta("sta" + loja.toLowerCase(), constantes.getDiretorio() + constantes.getBaixaRelase());
			}else{
				conecta.Conecta("sco" + loja.toLowerCase(), constantes.getDiretorio() + constantes.getBaixaRelase());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
