package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.AbstractListModel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtItem1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Formulário");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel.setBounds(242, 11, 96, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblItem = new JLabel("Item1 : ");
		lblItem.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblItem.setBounds(356, 151, 55, 21);
		contentPane.add(lblItem);
		
		txtItem1 = new JTextField();
		txtItem1.setBounds(432, 153, 92, 20);
		contentPane.add(txtItem1);
		txtItem1.setColumns(10);
		
		JComboBox<String> cmbProduto = new JComboBox();
		cmbProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NovoProduto = cmbProduto.getSelectedItem().toString();
				txtItem1.setText(NovoProduto);
			}
		});
		cmbProduto.setModel(new DefaultComboBoxModel(new String[] {"Teclado", "Mouse"}));
		cmbProduto.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		cmbProduto.setBounds(242, 70, 96, 22);
		contentPane.add(cmbProduto);
		
		JButton btnAdiconar = new JButton("Adicionar");
		btnAdiconar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ProdutoSelecionado = txtItem1.getText();
				cmbProduto.addItem(ProdutoSelecionado);
				txtItem1.setText("");
			}
		});
		btnAdiconar.setBounds(435, 108, 89, 23);
		contentPane.add(btnAdiconar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ProdutoSelecionado = cmbProduto.getSelectedItem().toString();
				cmbProduto.remove(ProdutoSelecionado);
			}
		});
		btnRemover.setBounds(435, 211, 89, 23);
		contentPane.add(btnRemover);
	}
}
