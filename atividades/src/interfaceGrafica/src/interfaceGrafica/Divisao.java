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

public class Divisao extends JFrame {

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
					Divisao frame = new Divisao();
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
	public Divisao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora Divisão");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel.setBounds(127, 11, 157, 14);
		contentPane.add(lblNewLabel);
		
		txtNumero1 = new JTextField();
		txtNumero1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtNumero1.setBounds(127, 66, 86, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(127, 125, 86, 20);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Número1:");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(42, 69, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Número2:");
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(42, 126, 75, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(340, 94, 86, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnResultado = new JButton("Resultado:");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strNumero1=txtNumero1.getText();
				String strNumero2=txtNumero2.getText();
				int n1=Integer.parseInt(strNumero1);
				int n2=Integer.parseInt(strNumero2);
				int resultado=n1/n2;
				String strResultado=String.valueOf(resultado);
				txtResultado.setText(strResultado);
				}
		});
		btnResultado.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnResultado.setBounds(219, 91, 111, 23);
		contentPane.add(btnResultado);
	}
}
