package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Subtraçao extends JFrame {

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
					Subtraçao frame = new Subtraçao();
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
	public Subtraçao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalculadoraSubtrao = new JLabel("Calculadora Subtração");
		lblCalculadoraSubtrao.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculadoraSubtrao.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblCalculadoraSubtrao.setBounds(186, 11, 190, 26);
		contentPane.add(lblCalculadoraSubtrao);
		
		JLabel lblNewLabel_1 = new JLabel("Número 1:");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(44, 72, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Número 2:");
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(44, 141, 75, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtNumero1 = new JTextField();
		txtNumero1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtNumero1.setColumns(10);
		txtNumero1.setBounds(135, 71, 86, 20);
		contentPane.add(txtNumero1);
		
		txtNumero2 = new JTextField();
		txtNumero2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtNumero2.setColumns(10);
		txtNumero2.setBounds(135, 138, 86, 20);
		contentPane.add(txtNumero2);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		txtResultado.setColumns(10);
		txtResultado.setBounds(437, 110, 86, 20);
		contentPane.add(txtResultado);
		
		JButton btnResultado = new JButton("Resultado:");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strNumero1=txtNumero1.getText();
				String strNumero2=txtNumero2.getText();
				int n1=Integer.parseInt(strNumero1);
				int n2=Integer.parseInt(strNumero2);
				int resultado=n1-n2;
				String strResultado=String.valueOf(resultado);
				txtResultado.setText(strResultado);
			}
		});
		btnResultado.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnResultado.setBounds(286, 111, 111, 23);
		contentPane.add(btnResultado);
	}

}
