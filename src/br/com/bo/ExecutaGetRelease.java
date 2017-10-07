package br.com.bo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.utilitarios.Conecta;
/**
 *
 * @author WevKleyton
 *
 */
public class ExecutaGetRelease {

	public static void main(String[] args) {

	int resposta = Integer.parseInt(JOptionPane.showInputDialog("Deseja consultar todas as filiais?"
			+ "\n" + "1 - TODAS" + "\n" + "2 - Apenas UMA", JOptionPane.YES_OPTION == JOptionPane.YES_OPTION ? 1 : 2));

	ArrayList<String> lojas = new ArrayList<String>();
	lojas.add("IGM");lojas.add("NRE");lojas.add("SDN");lojas.add("VMR");lojas.add("JAC");lojas.add("SLL");lojas.add("ABA");lojas.add("RED");
	lojas.add("COA");lojas.add("TCM");lojas.add("TAL");lojas.add("MJU");lojas.add("STI");lojas.add("BNV");lojas.add("RBC");lojas.add("BCN");
	lojas.add("VDE");lojas.add("BGC");lojas.add("AMT");lojas.add("SAT");lojas.add("PAP");lojas.add("PAG");lojas.add("TUB");lojas.add("MAR");
	lojas.add("ARG");lojas.add("GUR");lojas.add("PTO");lojas.add("CUP");lojas.add("EDC");lojas.add("PNA");lojas.add("SFX");lojas.add("VIR");
	lojas.add("CDC");lojas.add("ITU");lojas.add("CAP");lojas.add("TMC");lojas.add("RMO");lojas.add("CPO");lojas.add("PAF");lojas.add("ANN");
	lojas.add("SDA");lojas.add("RBV");lojas.add("PAM");lojas.add("WAD");lojas.add("MIT");lojas.add("BAO");lojas.add("XIG");lojas.add("XAB");
	lojas.add("FOA");lojas.add("TOC");lojas.add("SAA");

	Conecta conecta = new Conecta();


	if(resposta == 1){
		 VerificaUltimaReleasesFiliais lista = new VerificaUltimaReleasesFiliais();
		 for (int i = 0; i < lojas.size(); i++) {

			 try {
//				 String command2 ="cat /var/lib/tomcat6/webapps/cliente_" + lojas.get(i).toLowerCase() +"/socic-"+lojas.get(i).toLowerCase() +"-client.jnlp |grep Update |cut -d\"-\" -f3 |cut -d\" \" -f3";
				 String command ="/u1/jap/deploy_4.0/get_release.sh";
				 String command1 ="ls -r -1 /u1/jap/deploy_4.0/releases | head -n1 | cut -d. -f1";


				 System.out.println("Filial de : " +"sco" + lojas.get(i).toLowerCase());
				 System.out.println("baixando release: " + conecta.Conecta("sco"+lojas.get(i).toLowerCase(), command));
				 System.out.println(""+ conecta.Conecta("sco"+lojas.get(i).toLowerCase(), command1));
			} catch (Exception e) {
				System.out.println("ERRO:" + lojas.get(i) + e);
			}

		}
		 System.out.println("Fim do get_release");
	 }else{
		 String loja = JOptionPane.showInputDialog("Informe a loja","Ex: bme");
		 try {
			 String command ="/u1/jap/deploy_4.0/get_release.sh";
			 String comando1 ="ls -r -1 /u1/jap/deploy_4.0/releases | head -n1 | cut -d. -f1";

			 String comando = conecta.Conecta("sco" + loja, command);
			 String comando2 = conecta.Conecta("sco" + loja, comando1);
			 System.out.println("Filial: " + loja);
			 System.out.println("Release Baixada: " + comando);
			 System.out.println("Release Aplicada: " + comando2);
		} catch (Exception e) {
			// TODO: handle exception
		}
	 }

	}
}
