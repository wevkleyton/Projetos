package br.com.factory;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import br.com.bean.Release;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import dori.jasper.engine.JRException;

/**
 * 
 * @author WevKleyton
 * 
 */
public class RelatorioDeReleases {

	@SuppressWarnings("unused")
	public void montaRelatorio(String loja, String releaseBaixada,	String releaseAplicada, int qtdloja) throws JRException,DocumentException, IOException {
		Document document = null;
		OutputStream os = null;

		try {
			document = new Document(PageSize.A4, 50, 50, 50, 50);
			os = new FileOutputStream("/tmp/Release.pdf");
			PdfWriter.getInstance(document, os);
			document.open();
			Font font = new Font(FontFamily.COURIER, 25, Font.BOLD);
			Paragraph linha, titulo = null;
			titulo = new Paragraph("Relatorio de Releses em PDF!", font);
			
			if (qtdloja > 1) {
				for (int i = 0; i < qtdloja; i++) {
					linha = new Paragraph("FILIAL : " + loja + "     " +  " Release Baixada : "	+ releaseBaixada.trim() + "      " + " Release Aplicada : "+ releaseAplicada);
					linha.setAlignment(Element.ALIGN_CENTER);
					linha.setAlignment(Element.ALIGN_LEFT);
					linha.setSpacingAfter(20);
					document.add(titulo);
					document.add(linha);
					//Desktop desktop = Desktop.getDesktop();
					//desktop.open(new File("/tmp/Release.pdf"));

				}

			} else {

//				linha = new Paragraph("FILIAL : " + loja + "     " + " Release Baixada : "	+ releaseBaixada + "      " + " Release Aplicada : "+ releaseAplicada);
				linha = new Paragraph("FILIAL : " + loja + "     " +  " Release Baixada : "	+ releaseBaixada.trim() + "      " + " Release Aplicada : "+ releaseAplicada);

				//linha.setAlignment(Element.ALIGN_CENTER);
				linha.setAlignment(Element.ALIGN_LEFT);
				linha.setSpacingAfter(80);
				document.add(titulo);
				document.add(linha);
				//Desktop desktop = Desktop.getDesktop();
				//desktop.open(new File("/tmp/Release.pdf"));

			}

		} finally {
			//if (document != null) {
				document.close();
			//}
			//if (os != null) {
				os.close();
			//}
		}
	}

	public void montaRelatorioTabela(String loja, String releaseBaixada,
			String releaseAplicada) throws FileNotFoundException,
			DocumentException {
		Document document = null;
		OutputStream os = null;

		document = new Document(PageSize.A4, 50, 50, 50, 50);
		os = new FileOutputStream("/tmp/Release.pdf");
		PdfWriter.getInstance(document, os);
		document.open();
		Font font = new Font(FontFamily.COURIER, 20, Font.BOLD);

		PdfPTable table = new PdfPTable(3);
		PdfPCell header = new PdfPCell(new Paragraph("Relatório de Releases."));
		header.setColspan(3);
		table.addCell(loja);
		table.addCell(releaseBaixada);
		table.addCell(releaseAplicada);
		document.add(table);

	}
}
