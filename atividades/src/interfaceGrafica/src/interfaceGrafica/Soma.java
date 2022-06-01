package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Soma extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Soma frame = new Soma();
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
	public Soma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora Soma");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel.setBounds(209, 11, 157, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número1:");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(79, 87, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Número2:");
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(79, 152, 75, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtNumero1 = new JTextField();
		txtNumero1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtNumero1.setColumns(10);
		txtNumero1.setBounds(189, 86, 86, 20);
		contentPane.add(txtNumero1);
		
		txtNumero2 = new JTextField();
		txtNumero2.setColumns(10);
		txtNumero2.setBounds(189, 151, 86, 20);
		contentPane.add(txtNumero2);
		
		JButton btnResultado = new JButton("Resultado:");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strNumero1=txtNumero1.getText();
				String strNumero2=txtNumero2.getText();
				int n1=Integer.parseInt(strNumero1);
				int n2=Integer.parseInt(strNumero2);
				int resultado=n1+n2;
				String strResultado=String.valueOf(resultado);
				txtResultado.setText(strResultado);
			}
		});
		btnResultado.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnResultado.setBounds(296, 117, 111, 23);
		contentPane.add(btnResultado);
		
		txtResultado = new JTextField();
		txtResultado.setColumns(10);
		txtResultado.setBounds(447, 120, 86, 20);
		contentPane.add(txtResultado);
	}

}
