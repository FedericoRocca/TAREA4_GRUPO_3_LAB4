package Paneles;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Clases.Peliculas;
import Clases.Categorias;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;
import java.util.TreeSet;

//public class ListarPeliculas extends JPanel {
//
//	private static final long serialVersionUID = 1L;
//	private JList  list;
//	private DefaultListModel<Peliculas> dlModel;
//	
//	public ListarPeliculas() {
//		setLayout(null);
//		
//		list = new JList();
//		list.setBounds(111, 13, 327, 251);
//		dlModel = new DefaultListModel<Peliculas>();
//		list.setModel(dlModel);
//		add(list);
//		
//		JLabel lblNewLabel = new JLabel("Pel\u00EDculas");
//		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
//		lblNewLabel.setBounds(12, 119, 87, 16);
//		add(lblNewLabel);
//		
//	}
//
//	
//	public void ordenarPeliculas() {
//		
//	}
//}
public class ListarPeliculas extends JPanel {

	private JList<Peliculas> list;
	private TreeSet<Peliculas> peliculasSet;
	private DefaultListModel<Peliculas> listModel;
	private static TreeSet<Peliculas> peliculas;

	public ListarPeliculas() {
		setLayout(null);

		JLabel lblPeliculas = new JLabel("Pel\u00EDculas");
		lblPeliculas.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblPeliculas.setBounds(25, 124, 95, 44);
		add(lblPeliculas);

		list = new JList<Peliculas>();
		list.setBounds(112, 13, 323, 280);
		add(list);
	}

	public void setDefaultListModel(DefaultListModel<Peliculas> listModelRecibido) {
		this.listModel = listModelRecibido;
		list.setModel(this.listModel);
	}

	public void GetTreeSet(TreeSet<Peliculas> p) {
		this.peliculasSet = p;
		TreesetTolistmodel();
	}

	private void TreesetTolistmodel() {
		listModel = new DefaultListModel<Peliculas>();
		if (peliculasSet != null) {
			for (Peliculas elem : peliculasSet) {
				this.listModel.addElement(elem);
			}
		}
		list.setModel(listModel);
	}

}
