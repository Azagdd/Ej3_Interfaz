package formulario;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;
import persona.Persona;

public class Ej1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtDNI;
	private JTextField txtApell;
	private JTextField txtDia;
	private JTextField txtNombre;
	private JTextField txtMes;
	private JTextField txtAño;
	private JTextArea txtPersona;

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
		contentPane.setLayout(new MigLayout("", "[109.00][grow][][67.00,grow][][22.00,grow][-7.00][grow]", "[13.00][18.00][][][28.00][13.00][9.00][18.00][63.00,grow]"));
		
		JLabel lblTiulo = new JLabel("Introducir Personas");
		lblTiulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblTiulo, "cell 0 0");
		
		JLabel lbl1 = new JLabel("DNI:");
		contentPane.add(lbl1, "cell 0 2,alignx right");
		
		txtDNI = new JTextField();
		contentPane.add(txtDNI, "cell 1 2 4 1,growx");
		txtDNI.setColumns(10);
		
		JLabel lbl4 = new JLabel("Nombre:");
		contentPane.add(lbl4, "cell 5 2,alignx trailing");
		
		txtNombre = new JTextField();
		contentPane.add(txtNombre, "cell 6 2 2 1,growx");
		txtNombre.setColumns(10);
		
		JLabel lbl2 = new JLabel("Apellidos:");
		contentPane.add(lbl2, "cell 0 3,alignx trailing");
		
		txtApell = new JTextField();
		contentPane.add(txtApell, "cell 1 3 7 1,growx");
		txtApell.setColumns(10);
		
		JLabel lbl3 = new JLabel("Fecha Nacimiento:");
		contentPane.add(lbl3, "cell 0 4,alignx trailing");
		
		txtDia = new JTextField();
		contentPane.add(txtDia, "cell 1 4,growx");
		txtDia.setColumns(10);
		
		JLabel lbl6 = new JLabel("/");
		contentPane.add(lbl6, "cell 2 4,growx");
		
		txtMes = new JTextField();
		contentPane.add(txtMes, "cell 3 4,growx");
		txtMes.setColumns(10);
		
		JLabel lbl7 = new JLabel("/");
		contentPane.add(lbl7, "cell 4 4,growx");
		
		txtAño = new JTextField();
		contentPane.add(txtAño, "cell 5 4 2 1,growx");
		txtAño.setColumns(10);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datos();
			}
		});
		contentPane.add(btnInsertar, "cell 3 5");
		
		JLabel lbl5 = new JLabel("Persona:");
		contentPane.add(lbl5, "cell 0 7,alignx trailing");
		
		txtPersona = new JTextArea();
		contentPane.add(txtPersona, "cell 1 7 6 2,grow");
	}

	protected void datos() {
		String DNI = txtDNI.getText();
		String Nombre = txtNombre.getText();
		String Apellidos = txtApell.getText();
		int dia = Integer.parseInt(txtDia.getText());
		int mes = Integer.parseInt(txtDia.getText());
		int año = Integer.parseInt(txtDia.getText());
		
		Persona p1 = new Persona(Nombre, Apellidos, DNI, dia, mes, año);
		
		txtPersona.setText(p1.toString());
	}

}
