//package br.com.utilitarios;
//
//import java.util.Timer;
//
//import javax.swing.JDialog;
//import javax.swing.JPanel;
//import javax.swing.JProgressBar;
//import javax.swing.JTextField;
//
////public class BarraDeProgresso extends JDialog implements Runnable {
////
////	private static final long serialVersionUID = 3977298828280279606L;
////	private static final int MINUMUM = 0;
////	private JPanel painel = null;
////	private int qtTotal, qtdeProcessado;
////	private JTextField txtQtdeProcessada;
////	private Timer activityMonitor;
////	JProgressBar pbar = null;
////
////	@Override
////	public void run() {
////	}
////
////	public BarraDeProgresso() {
////		this.pbar = new JProgressBar();
////	}
////
////	public BarraDeProgresso(String texto) {
////		this();
////		this.pbar.setIndeterminate(true);
////		this.pbar.setStringPainted(true);
////		this.pbar.setString(texto);
//////		init();
////		setVisible(true);
////	}
////	public BarraDeProgresso(int qtTotal){
////		this();
////		this.pbar.setIndeterminate(true);
////		this.pbar.setStringPainted(true);
////		this.pbar.setMaximum(this.qtTotal);
//////		init();
////		setVisible(true);
////		
////	}
////	
////	public void setFont(String nomeFonte){
////		this.pbar.setFont(new java.awt.Font(nomeFonte, 0, 12));
////	}//
////}
//
//
//
//Iniciar  ▼
//    Guias de Referência
//    Cursos & Séries
//    Últimas atualizações  »
//    DevCast  »
//    Artigos  »
//    Fórum
//    Recomendado
//
//MVP
//
//Web-Currículo
//Tiago Sá0 pontos
//Baixe o APP
//DevMedia
//favorito imprimir anotar marcar como lido tirar dúvidas
//JProgressBar
//Veja neste artigo, através de exemplos práticos, como Criar um controle JProgressBar em sua aplicação.
//(1)  (2)
//Publicidade
//
//É um exemplo de que aceita uma String de mensagem, ou um valor int para carregar em %. tb é possivel mudar a cor de Fundo do ProgressBar, ou a cor da barra que carrega, e mudar a fonte da escrita.
//tem uma imagem, mas é só substituir.
//
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Font;
//import java.awt.Toolkit;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.ImageIcon;
//import javax.swing.JDialog;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JProgressBar;
//import javax.swing.JTextField;
//import javax.swing.SwingUtilities;
//import javax.swing.border.Border;
//import org.jfree.ui.FontChooserPanel;
//import lib.Formato;
//public class Espera extends JDialog implements Runnable { 
//private static final long serialVersionUID = 3977298828280279606L;
//private static final int MINIMUM = 0;    private JPanel painel     = null;
//private int qtTotal, qtdeProcessado;    
//private JTextField txtQtdeProcessada;
//private javax.swing.Timer activityMonitor;  
//JProgressBar pbar = null;
//        /**
// * Construtor
// */
//    public void run() {
//    }
//   public Espera() { 
//this.pbar = new JProgressBar();
//} 
//public Espera(String texto){
//this();
//this.pbar.setIndeterminate(true);
//this.pbar.setStringPainted(true);
//this.pbar.setString(texto);
//init(); 
//setVisible(true);
//}
// public Espera(int qtdTotal){
//this();
//this.qtTotal = qtdTotal;
//this.pbar.setIndeterminate(false);
//this.pbar.setStringPainted(true);
//this.pbar.setMaximum(this.qtTotal);
//  init(); 
//setVisible(true);
//}
// public void setFont(String nomeFonte){
//this.pbar.setFont(new java.awt.Font(nomeFonte, 0, 12));
//}
// public void setCorFundo(Color corFundo){
//this.pbar.setBackground(corFundo);
// }
// public void setCorBarra(Color corBarra){
//this.pbar.setForeground(corBarra);
//}
//         public int getQtTotal() {
//return qtTotal; } public void setQtTotal(int qtTotal) {
//this.qtTotal = qtTotal;
//}
//public int getQtdeProcessado() {
//return qtdeProcessado;
//}
//public void setQtdeProcessado(int qtdeProcessado) {
////this.qtdeProcessado = qtdeProcessado;
//pbar.setValue(qtdeProcessado);
//}
//public void setTexto(String texto) {
//pbar.setString(texto);
//}
//private void init(){
//initialize(); 
//            //Posiciona a janela
//    Toolkit thekit = this.getToolkit();
//    Dimension dim = thekit.getScreenSize();
//    int hor = (dim.width/2) - 150;
//    int ver = (dim.height/2) - 100;
//    this.setUndecorated(true);
//    this.setBounds(hor, ver, 301, 151);
//    this.setVisible(true);
//    this.requestFocus();
//}
//    /**
// * Construção do painel
// * @return void
// */
//private void initialize() { 
//    painel = new PanelBackground("/img/espera.png");
//    painel.setLayout(null);
//    painel.setBorder(Formato.GRID_BORDER);
//    painel.setBounds(1, 1, 300, 150);
//                          pbar.setBounds(155,115,120,20);
//    pbar.setVisible(true);
//painel.add(pbar);
//    this.setContentPane(painel); 
//        }
//}
//
//
//Um exemplo de como ele é aplicado com um int bem basico só para testes mesmo.
//
//import java.awt.Color;
//import javax.swing.SwingUtilities;
//import lib.Espera;
//public class TesteEspera {
//
//public static void main(String[] args) {
//Espera r = new Espera(100000000);
//r.setCorFundo(Color.DARK_GRAY);
//r.setCorBarra(Color.blue);
//r.setFont("Verdana");
//Thread tr = new Thread(r);
//tr.start();
//int a =100000000;
//for(int i=0; i   r.setQtdeProcessado(i);
//}
//}
//}
//
//
//E agora um exemplo de uma String
//
//import java.awt.Color;
//import javax.swing.SwingUtilities;
//import lib.Espera;
//public class TesteEspera {
//public static void main(String[] args) {
//Espera r = new Espera("Aguarde...");
//r.setCorFundo(Color.DARK_GRAY);
//r.setCorBarra(Color.YELLOW);
//r.setFont("Verdana");
//Thread tr = new Thread(r);
//tr.start();
//}
//}
//
//
//Espero que ajude quem precisar...
//
//Publicado no Canal Java
//	
//por Vitor Yudi
//
//Expert em Java e programação Web
//Ajude-nos a evoluir: você gostou do post?  (1)  (2)
//Compartilhe:
//Ficou com alguma dúvida?
//Seção de comentários em manutenção
//DevMedia - asp.net, Java, Delphi, SQL e web Design, tudo em um só lugar!
//Publique | Assine | Fale conosco
//
//DevMedia
//
//Hospedagem web por Porta 80 Web Hosting
