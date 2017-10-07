package br.com.utilitarios;

import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
// Essa classe é a responsavel pela impressao. Ela detecta a impressora
// instalada, recebe o texto e o imprime.
public class Impressao {

    public void impressaoSO(String str){
    	
    	PrinterJob pjob = PrinterJob.getPrinterJob();
    	PageFormat pf = pjob.defaultPage();
    	DocFlavor docFlavor = DocFlavor.STRING.TEXT_PLAIN;
    	Doc doc = new SimpleDoc(str, docFlavor, null);
    	DocPrintJob dpj = pjob.getPrintService().createPrintJob();
		PrintRequestAttributeSet aset;

    	
    	if (pjob.printDialog()){
			try {
			aset = new HashPrintRequestAttributeSet();
			aset.add(new Copies(pjob.getCopies()));
			dpj.print(doc, aset);
			} catch (PrintException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
    		
    }
    public static void main(String[] args) {
		Impressao impressao = new Impressao();
		impressao.impressaoSO("teste");
	}
    
}
