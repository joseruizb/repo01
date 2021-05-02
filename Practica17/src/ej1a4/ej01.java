package ej1a4;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class ej01 {

	public static void main(String[] args) {
		
		//Panel con los botones
		JFrame f =new JFrame("Perro");
		
		// Añado este comentario	
		//Panel de Jframe
		Container c = f.getContentPane();
		c.setLayout(new BorderLayout());
		
		//Parte norte
		JPanel pn = new JPanel(new FlowLayout());
		JLabel et1 = new JLabel("Esto es un ejercicio de JAVA");
		pn.add(et1);
		
		//Parte Sur
		JPanel ps = new JPanel(new FlowLayout());
		JTextField t = new JTextField("",15);
		JLabel et2 = new JLabel("Observación:");
		JComboBox<String> jc = new JComboBox<String>();
		jc.addItem("Eleccion 1");
		jc.addItem("Eleccion 2");
		jc.addItem("Eleccion 3");
		
		ps.add(jc);
		ps.add(et2);
		ps.add(t);
		
		//Panel central
		JPanel pc = new JPanel(new BorderLayout());
		
		JPanel pc1 = new JPanel(new GridLayout(3,1));
		JButton b1 = new JButton("Boton 1");
		JButton b2 = new JButton("Boton 2");
		JButton b3 = new JButton("Boton 3");
		pc1.add(b1);
		pc1.add(b2);
		pc1.add(b3);
		pc.add(pc1,BorderLayout.WEST);
		///////////////////////////////////////////////////
		JPanel pc2 = new JPanel(new FlowLayout());
		Vector<String> listaOpciones = new Vector<String>();
		for (int i=0; i<12; i++)
		listaOpciones.add("Item número "+(i+1));
		JList<String> miLista = new JList<String>(listaOpciones);
		JScrollPane scp1 = new JScrollPane(miLista);
		pc2.add(scp1);
		pc.add(pc2,BorderLayout.CENTER);
		//////////////////////////////////////////////////////
		JPanel pc3 = new JPanel(new GridLayout(4,1));
		JLabel et3 = new JLabel("Marca tu edad: ");
		JRadioButton jb1 = new JRadioButton("Menor de 20");
		JRadioButton jb2 = new JRadioButton("Menor de 20 y mayor de 35");
		JRadioButton jb3 = new JRadioButton("Mayor de 35");
		ButtonGroup gb1 = new ButtonGroup();
		gb1.add(jb1);
		gb1.add(jb2);
		gb1.add(jb3);
		pc3.add(et3);
		pc3.add(jb1);
		pc3.add(jb2);
		pc3.add(jb3);
		pc.add(pc3,BorderLayout.EAST);
		pc3.setBorder(
				new CompoundBorder(
				new TitledBorder("Borde compuesto"),
				new BevelBorder(BevelBorder.RAISED)));
		///////////////////////////////
		c.add(pn,BorderLayout.NORTH);	
		c.add(pc,BorderLayout.CENTER);	
		c.add(ps,BorderLayout.SOUTH);

		
		
		
		
		
		
		((JComponent) c).setBorder(new EmptyBorder(10,30,10,30));

		f.setSize(200,400);
		f.pack();
		f.setVisible(true);
		// Añado el control alcierredelaventana
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
