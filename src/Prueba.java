import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;


public class Prueba extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba frame = new Prueba();
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
	public Prueba() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 350, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(128, 128, 128));
		textField.setFont(new Font("Droid", Font.PLAIN, 30));
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 3, 10, 20));
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Manejador man = new Manejador();
				man.cadenas();
			}
		});
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.setFont(new Font("Droid", Font.PLAIN, 25));
		btnNewButton.setBackground(new Color(30, 144, 255));
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setForeground(SystemColor.desktop);
		btnNewButton_1.setFont(new Font("Droid", Font.PLAIN, 25));
		btnNewButton_1.setBackground(new Color(30, 144, 255));
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setForeground(SystemColor.desktop);
		btnNewButton_2.setFont(new Font("Droid", Font.PLAIN, 25));
		btnNewButton_2.setBackground(new Color(30, 144, 255));
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBackground(new Color(30, 144, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_3.setForeground(SystemColor.desktop);
		//btnNewButton_3.setBackground(new Color(30, 144, 255));
		btnNewButton_3.setFont(new Font("Droid", Font.PLAIN, 25));
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setForeground(SystemColor.desktop);
		btnNewButton_4.setBackground(new Color(30, 144, 255));
		btnNewButton_4.setFont(new Font("Droid", Font.PLAIN, 25));
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setForeground(SystemColor.desktop);
		btnNewButton_5.setFont(new Font("Droid", Font.PLAIN, 25));
		btnNewButton_5.setBackground(new Color(30, 144, 255));
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.setForeground(SystemColor.desktop);
		btnNewButton_6.setFont(new Font("Droid", Font.PLAIN, 25));
		btnNewButton_6.setBackground(new Color(30, 144, 255));
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.setForeground(SystemColor.desktop);
		btnNewButton_7.setBackground(new Color(30, 144, 255));
		btnNewButton_7.setFont(new Font("Droid", Font.PLAIN, 25));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.setForeground(SystemColor.desktop);
		btnNewButton_8.setFont(new Font("Droid", Font.PLAIN, 25));
		btnNewButton_8.setBackground(new Color(30, 144, 255));
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton(".");
		btnNewButton_9.setForeground(SystemColor.desktop);
		btnNewButton_9.setFont(new Font("Droid", Font.PLAIN, 25));
		btnNewButton_9.setBackground(new Color(30, 144, 255));
		panel_2.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.setForeground(SystemColor.desktop);
		btnNewButton_10.setFont(new Font("Droid", Font.PLAIN, 25));
		btnNewButton_10.setBackground(new Color(30, 144, 255));
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.setForeground(SystemColor.desktop);
		btnNewButton_11.setFont(new Font("Droid", Font.PLAIN, 25));
		btnNewButton_11.setBackground(new Color(30, 144, 255));
		panel_2.add(btnNewButton_11);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_1.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new GridLayout(4, 2, 0, 20));
		
		JButton btnNewButton_12 = new JButton("/");
		btnNewButton_12.setForeground(SystemColor.desktop);
		btnNewButton_12.setFont(new Font("Droid", Font.PLAIN, 25));
		btnNewButton_12.setBackground(new Color(30, 144, 255));
		panel_3.add(btnNewButton_12);
		
		JButton btnNewButton_15 = new JButton("-");
		btnNewButton_15.setForeground(SystemColor.desktop);
		btnNewButton_15.setFont(new Font("Droid", Font.PLAIN, 25));
		btnNewButton_15.setBackground(new Color(30, 144, 255));
		panel_3.add(btnNewButton_15);
		
		JButton btnNewButton_14 = new JButton("+");
		btnNewButton_14.setForeground(SystemColor.desktop);
		btnNewButton_14.setBackground(new Color(30, 144, 255));
		btnNewButton_14.setFont(new Font("Droid", Font.PLAIN, 25));
		panel_3.add(btnNewButton_14);
		
		JButton btnNewButton_13 = new JButton("*");
		btnNewButton_13.setForeground(SystemColor.desktop);
		btnNewButton_13.setFont(new Font("Droid", Font.PLAIN, 25));
		btnNewButton_13.setBackground(new Color(30, 144, 255));
		panel_3.add(btnNewButton_13);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 0));
		panel_1.add(panel_4, BorderLayout.NORTH);
		panel_4.setLayout(new GridLayout(0, 4, 25, 0));
		
		JButton btnNewButton_16 = new JButton("");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana2 frame2 = new ventana2();
				frame2.setVisible(true);
			}
		});
		btnNewButton_16.setIcon(new ImageIcon("img\\ic_empty_document.png"));
		btnNewButton_16.setToolTipText("toolTipText N1\r\n");
		btnNewButton_16.setForeground(new Color(255, 255, 255));
		btnNewButton_16.setBackground(new Color(0, 0, 0));
		panel_4.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Archivo ar = new Archivo();
				ar.leerArchivo();
			}
		});
		btnNewButton_17.setIcon(new ImageIcon("img\\ic_folder.png"));
		btnNewButton_17.setBackground(new Color(0, 0, 0));
		btnNewButton_17.setForeground(new Color(255, 255, 255));
		panel_4.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Archivo ar = new Archivo();
				ar.escribirArchivo();
			}
		});
		btnNewButton_18.setIcon(new ImageIcon("img\\ic_download.png"));
		btnNewButton_18.setForeground(new Color(255, 255, 255));
		btnNewButton_18.setBackground(new Color(0, 0, 0));
		panel_4.add(btnNewButton_18);
		
		
		JButton btnNewButton_19 = new JButton("");
		btnNewButton_19.addActionListener(new ActionListener() {
			boolean encendido=true;
			public void actionPerformed(ActionEvent e) {
				if(encendido){
					textField.setText("0.0");
					encendido=false;
				}
				else{
					textField.setText("");
					encendido=true;
				}
			}
		});
		btnNewButton_19.setIcon(new ImageIcon("img\\ic_grid.png"));
		btnNewButton_19.setBackground(new Color(0, 0, 0));
		btnNewButton_19.setForeground(new Color(255, 255, 255));
		panel_4.add(btnNewButton_19);
	}

}
