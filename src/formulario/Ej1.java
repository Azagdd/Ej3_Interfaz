package formulario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Ej1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej1 frame = new Ej1();
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
	public Ej1() {
		setTitle("Personas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[109.00][][][grow][67.00][][][38.00][]", "[13.00][18.00][][][28.00][13.00][9.00][18.00][63.00]"));
		
		JLabel lblNewLabel_1 = new JLabel("Introducir Personas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1, "cell 0 0");
		
		JLabel lblNewLabel = new JLabel("DNI:");
		contentPane.add(lblNewLabel, "cell 0 2,alignx right");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 1 2 6 1,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre:");
		contentPane.add(lblNewLabel_4, "cell 7 2,alignx trailing");
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "cell 8 2,growx");
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos:");
		contentPane.add(lblNewLabel_2, "cell 0 3,alignx trailing");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 1 3 8 1,growx");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha Nacimiento:");
		contentPane.add(lblNewLabel_3, "cell 0 4,alignx trailing");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 1 4,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("/");
		contentPane.add(lblNewLabel_6, "cell 2 4");
		
		textField_4 = new JTextField();
		contentPane.add(textField_4, "cell 4 4,growx");
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("/");
		contentPane.add(lblNewLabel_7, "cell 5 4");
		
		textField_5 = new JTextField();
		contentPane.add(textField_5, "cell 7 4,growx");
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton, "cell 4 5");
		
		JLabel lblNewLabel_5 = new JLabel("Persona:");
		contentPane.add(lblNewLabel_5, "cell 0 7,alignx trailing");
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, "cell 1 7 8 2,grow");
	}

}
