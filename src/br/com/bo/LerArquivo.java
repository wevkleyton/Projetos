package br.com.bo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Timer;
/**
 *
 * @author WevKleyton
 *
 */
public class LerArquivo {

	public static void main(String[] args) throws IOException {

		String file = "/tmp/catalina.out";
		if (!file.isEmpty()) {

			BufferedReader bfr = new BufferedReader(new FileReader(file));
			String linha;
			Timer time = new Timer();

			while ((linha = bfr.readLine()) != null) {
				if(linha.contains("org.apache.catalina.core.StandardEngine start")){
					System.out.println(linha);
					System.out.println("Aplicação ok !!");
				}
			}
		}

	}
}
