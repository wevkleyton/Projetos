package br.com.bean;

import java.io.Serializable;

/**
 *
 * @author WevKleyton
 * Bean de geração de relatorios
 */
@SuppressWarnings("serial")
public class Release implements Serializable {
	
	private String loja;
	private String diretorio = "/u1/jap/deploy_4.4/";
	private String releaseBaixada;
	private String releaseAplicada  = "ls -r -1 " +  diretorio + "releases | head -n1 | cut -d. -f1";

	public String getLoja() {
		return loja;
	}

	public String getDiretorio() {
		return diretorio;
	}

	public void setDiretorio(String diretorio) {
		this.diretorio = diretorio;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	public String getReleaseBaixada() {
		return releaseBaixada;
	}

	public void setReleaseBaixada(String releaseBaixada) {
		this.releaseBaixada = releaseBaixada;
	}

	public String getReleaseAplicada() {
		return releaseAplicada;
	}

	public void setReleaseAplicada(String releaseAplicada) {
		this.releaseAplicada = releaseAplicada;
	}

}
