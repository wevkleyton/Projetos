package br.com.constantes;

public class ConstanteComandos {

	private String diretorio = "/u1/jap/deploy_4.4/";
	private String deploy_sh =  diretorio + "deploy.sh -pc -dc -ps -ds";
	private String ultima_release = "ls -r -1 " +  diretorio + "releases | head -n1 | cut -d. -f1" ;
	private String ultima_releaseJap = "ls -r -1 " +  diretorio + "releases | head -n1 | cut -d. -f1" ;
	private String log = "tail -n 100 /var/log/tomcat6/catalina.out" ;
	private String baixaRelase = diretorio + "get_release.sh";
	
	
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
				
	public String getDiretorio() {
		return diretorio;
	}
	public void setDiretorio(String diretorio) {
		this.diretorio = diretorio;
	}
	public String getDeploy_sh() {
		return deploy_sh;
	}
	public void setDeploy_sh(String deploy_sh) {
		this.deploy_sh = deploy_sh;
	}
	public String getBaixaRelase() {
		return baixaRelase;
	}
	public void setBaixaRelase(String baixaRelase) {
		this.baixaRelase = baixaRelase;
	}
	public String getUltima_release() {
		return ultima_release;
	}
	public void setUltima_release(String ultima_release) {
		this.ultima_release = ultima_release;
	}
	public String getUltima_releaseJap() {
		return ultima_releaseJap;
	}
	public void setUltima_releaseJap(String ultima_releaseJap) {
		this.ultima_releaseJap = ultima_releaseJap;
	}
	
	
	
}
