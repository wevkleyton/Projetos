package br.com.utilitarios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.swing.JOptionPane;

public class TesteComunicacao {
	
	public static boolean isIpValido(String ip) {
	    if (ip == null || ip.isEmpty()) return false;
	    ip = ip.trim();
	    if ((ip.length() < 6) & (ip.length() > 15)) return false;

	    try {
	        Pattern pattern = Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
	        Matcher matcher = pattern.matcher(ip);
	        return matcher.matches();
	        
	    } catch (PatternSyntaxException ex) {
	        return false;
	    }
	}

	public static boolean isOnLine(String host) {
		boolean ping = false;
		String comando = null; 
	         
			String osName = System.getProperty("os.name");
			
			if(host.equals("STI")){
				comando = osName.toUpperCase().contains("LINUX") ? "ping -c 2 "
						+ "ubt" +host.toLowerCase()
						: "ping -n 2 " + "sco" + host.toLowerCase();
			}else{
				comando = osName.toUpperCase().contains("LINUX") ? "ping -c 2 "
						+ "sco" +host.toLowerCase()
						: "ping -n 2 " + "sco" + host.toLowerCase();
			}
	        
	        try {  
	        	String s = "";
	        	Process process = Runtime.getRuntime().exec(comando);
	        	BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
	        	int c = 0;
	        	
	        	while ((s = stdInput.readLine()) != null){
	        		
	        		if (c == 1){
	        			String outProcess = s.toString();
		        		
		        		  if (outProcess.contains("64 bytes") || outProcess.contains("40 bytes") || outProcess.contains("bytes=32")) {
		        			  ping = true;
		        			  
		                  } else {
		                	  ping = false;
		                  }	
	        		}
	        		
	        		c++;
	        	}
	               
	            
	        } catch (IOException ex) {  
	            ex.printStackTrace();  
	         
			
		} 
		
		return ping;
	}	
}
