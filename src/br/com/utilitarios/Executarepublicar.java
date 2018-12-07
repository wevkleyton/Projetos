package br.com.utilitarios;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.itextpdf.text.pdf.parser.Path;
import com.itextpdf.text.pdf.parser.clipper.Paths;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;

/**
 * 
 * @author wev kleyton Data : 17/12/16
 *
 */
public class Executarepublicar {

	private final String path_object = "/home/object/objectmmrs";
	private String schema;
	private String tabela;
	private String server;

	public String executaRepublicar(){
		String command = "cd " + path_object + "; . setclasspath.sh >> /tmp/teste;" + "./republicar.sh >> /tmp/teste; " + "cp " + getSchema() + ".sql /tmp";
		 System.out.println(command);
		 return command;

	}

	public void modificaArquivos() throws IOException, InterruptedException {
//		String republicar = "republicar.sh";
//		Path path = Paths.get(path_object + "/" + republicar);
//		List<String> linha = Files.readAllLines(path);
//		List<String> resultado = new ArrayList<String>();
//		for (String l : linha) {
//			if (l.contains("APP_SCHEMA=")) {
//				String novaLinha = "APP_SCHEMA= " + getSchema();
//				l = novaLinha;
//			}
//			if (l.contains("TABELAS=")) {
//				String novaLinha = "TABELAS=" + getTabela();
//				l = novaLinha;
//			}
//			resultado.add(l);
//		}
//		Files.write(path, resultado);
//		executaRepublicar();

	}

	public void conectaRemoto(String server) {

		try {
			JSch jSch = new JSch();
			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			Session session = jSch.getSession("wev", server, 22);
			session.setPassword("wkmo1985pa");
			session.setConfig(config);
			session.connect();
			int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha 1 - shell \n  2 - Executar Script "));
			if (op == 1) {
				Channel channel = session.openChannel("shell");
				channel.setInputStream(System.in);
				channel.setOutputStream(System.out);
//				channel.connect();
				channel.isClosed();
				session.disconnect();

			} else {
				setSchema(JOptionPane.showInputDialog("Informe o esquema?"));
				setTabela(JOptionPane.showInputDialog("Informe a tabela?"));
				Channel channel = session.openChannel("exec");
				String comando = executaRepublicar();
				((ChannelExec) channel).setCommand(comando);
				InputStream in = channel.getInputStream();
				channel.connect();
			     byte[] tmp=new byte[1024];
			      while(true){
			        while(in.available()>0){
			          int i=in.read(tmp, 0, 1024);
			          if(i<0)break;
//			          System.out.print(new String(tmp, 0, i));
//			          saida = new String(tmp,0,i);
			        }
					if (channel.isClosed()) {
						channel.disconnect();
						break;

					}
				}

				channel.isClosed();
				session.disconnect();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Executarepublicar exec = new Executarepublicar();
		exec.setServer(JOptionPane.showInputDialog("Informe o Ip do Servidor?"));
		exec.conectaRemoto(exec.getServer());
		

	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public String getTabela() {
		return tabela;
	}

	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}
}
