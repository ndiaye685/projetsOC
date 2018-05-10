import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Fenetre extends JFrame {
	private Panel panel = new Panel();
	private JMenuBar menuBar = new JMenuBar();
	private JMenu fichier = new JMenu("Fichier");
	private JMenuItem erase = new JMenuItem("Effacer");
	private JMenuItem quit = new JMenuItem("Quitter");
	private JMenu edition = new JMenu("Edition");
	private JMenu forme = new JMenu("Forme du pointeur");
	private JMenuItem rond = new JMenuItem("Rond");
	private JMenuItem carre = new JMenuItem("Carré");
	private JMenu couleur = new JMenu("Couleur du pointeur");
	private JMenuItem rouge = new JMenuItem("Rouge");
	private JMenuItem vert = new JMenuItem("Vert");
	private JMenuItem bleu = new JMenuItem("Bleu");  

	private JToolBar toolBar = new JToolBar();
	private JButton square = new JButton(new ImageIcon("test1.png"));
	private JButton circle = new JButton(new ImageIcon("cercle.png"));
	private JButton blue = new JButton(new ImageIcon("bleu.png"));
	private JButton red = new JButton(new ImageIcon("rouge.png"));
	private JButton green = new JButton(new ImageIcon("vert.png"));
	private JButton gomme = new JButton(new ImageIcon("gomme1.png"));

	public Fenetre() {
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				System.exit(0);
			}
		});
		FormeListener fl = new FormeListener();
		CouleurListener cl = new CouleurListener();

		rond.addActionListener(fl);
		carre.addActionListener(fl);
		square.addActionListener(fl);
		circle.addActionListener(fl);

		rouge.addActionListener(cl);
		vert.addActionListener(cl);
		bleu.addActionListener(cl);
		green.addActionListener(cl);
		blue.addActionListener(cl);
		red.addActionListener(cl);
		gomme.addActionListener(cl);
		erase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				panel.erase();
			}
		});

		//Menu
		fichier.add(erase);
		fichier.add(quit);
		menuBar.add(fichier);
		forme.add(rond);
		forme.add(carre);
		edition.add(forme);
		couleur.add(rouge);
		couleur.add(vert);
		couleur.add(bleu);
		edition.add(couleur);
		menuBar.add(edition);

		//Barre d'outils
		toolBar.add(square);
		toolBar.add(circle);
		toolBar.addSeparator();
		toolBar.add(gomme);
		toolBar.addSeparator();
		toolBar.add(red);
		toolBar.add(green);
		toolBar.add(blue);
		this.getContentPane().add(toolBar, BorderLayout.NORTH);

		this.setJMenuBar(menuBar);
		this.getContentPane().add(panel, BorderLayout.CENTER);
		this.setVisible(true);
	}
	class FormeListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(event.getSource().getClass().getName().equals("javax.swing.JMenuItem")) {
				if(event.getSource() == rond) {
					panel.setPointerType("CARRÉ");
				}
				else {
					panel.setPointerType("ROND");
				}
			}
			else {
				if(event.getSource() == square) {
					panel.setPointerType("CARRÉ");
				}
				else {
					panel.setPointerType("ROND");
				}
			}
			
		}
	}

	class CouleurListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(event.getSource().getClass().getName().equals("javax.swing.JMenuItem")) {
				if(event.getSource() == rouge) {
					panel.setPointerColor(Color.RED);
				}
				else if(event.getSource() == vert) {
					panel.setPointerColor(Color.GREEN);
				} 
				else {
					panel.setPointerColor(Color.BLUE);
				}
			}
			else {
				if(event.getSource() == red) {
					panel.setPointerColor(Color.RED);
				}
				else if(event.getSource() == green) {
					panel.setPointerColor(Color.GREEN);
				}
				if(event.getSource() == blue) {
					panel.setPointerColor(Color.BLUE);
				}
				else {
					panel.setPointerColor(Color.WHITE);
				}
			}

		}
	}
}