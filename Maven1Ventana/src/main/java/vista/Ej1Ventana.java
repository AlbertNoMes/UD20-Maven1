package vista;

/**
 * Albert Notario Mestres
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Ej1Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void vista() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej1Ventana frame = new Ej1Ventana();
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
	public Ej1Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Introduce el tamaño de la fuente:");
		lblNewLabel.setBounds(10, 11, 168, 14);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(215, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		final JLabel etiqueta = new JLabel("Hello world");
		etiqueta.setBounds(10, 84, 414, 166);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // CENTRA EL TEXTO EN LA ETIQUETA
		contentPane.add(etiqueta);

		JButton btnNewButton = new JButton("Aplicar");
		btnNewButton.setBounds(215, 50, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int fontSize = Integer.valueOf(textField.getText()); // DAMOS EL VALOR DEL TAMAÑO DEL TEXTO
					etiqueta.setFont(new Font("Tahoma", Font.PLAIN, fontSize)); // CAMBIAMOS EL fontSize DE etiqueta
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		});
		contentPane.add(btnNewButton);

	}

}
