package br.com.bo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;
/**
 *
 * @author WevKleyton
 *
 */
public class GeraBuildNFCE {

	// ler lista lojas
	public void listaLojas(){

	}

	// Gera WAR para as loja individualmente
	public void loja() throws IOException, InterruptedException{

		String loja = JOptionPane.showInputDialog("Informa a loja Ex: bme");
		String host = JOptionPane.showInputDialog("Informa o endereço IP ");

		this.ajustaJgenesisBO(host, loja);


		// faz a modificação do arquivos



//		BufferedReader buffer = new BufferedReader(new InputStreamReader(processo.getInputStream()));
//		while((result = buffer.readLine() ) != null){
//			System.out.println(result);
//		}


	}
	public void ajustaJgenesisBO(String hosts, String loja) throws IOException, InterruptedException{

		String arquivos = "/tmp/jgenesis-bo.xml" ;
 		StringBuilder strBuild = new StringBuilder();
		strBuild.append("cat " + arquivos);
		Process processo = Runtime.getRuntime().exec(strBuild.toString());
		processo.waitFor();
		BufferedReader bf = new BufferedReader(new InputStreamReader(processo.getInputStream()));
		String linhas = null;
		while ((linhas = bf.readLine()) != null){
			System.out.println(linhas.equals("    <environment name="));
		}
	}

	public String verificaMD5(String arquivo) throws IOException, InterruptedException{
		String md5 = null;

		String linha;
		StringBuilder comando = new StringBuilder();
		comando.append("md5sum -t ").append("/tmp/server/socic_nfce_vde.war");
		Process process = Runtime.getRuntime().exec(comando.toString());
		process.waitFor();
		BufferedReader buffer = new BufferedReader(new InputStreamReader(process.getInputStream()));
		while((linha = buffer.readLine()) != null){
			System.out.println(linha);
		}

		return md5;
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		GeraBuildNFCE gera = new GeraBuildNFCE();
		gera.loja();

		System.out.println("Teste de gitts");
		// teste de commit para o leleco

	}

}
