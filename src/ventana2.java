import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


@SuppressWarnings("serial")
public class ventana2 extends JFrame {
	private JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	@SuppressWarnings("rawtypes")
	public JComboBox comboBox;
	public JLabel lblDatoq;
	public JLabel lblNewLabel;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana2 frame = new ventana2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ventana2() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 234, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		lblDatoq = new JLabel("dato 1");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDatoq, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDatoq, 10, SpringLayout.WEST, contentPane);
		contentPane.add(lblDatoq);
		
		comboBox = new JComboBox<Object>();
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox, 43, SpringLayout.EAST, lblDatoq);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(comboBox.getSelectedIndex()==0){
					textField.setText("corona");
					textField_1.setText("20.5");
					textField_2.setText("355 ml");
				}
				else if(comboBox.getSelectedIndex()==1){
					textField.setText("estrella");
					textField_1.setText("17");
					textField_2.setText("250 ml");
				}
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox, 0, SpringLayout.NORTH, lblDatoq);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, comboBox, 33, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, comboBox, -67, SpringLayout.EAST, contentPane);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		contentPane.add(comboBox);
		
		lblNewLabel = new JLabel("dato 2");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 28, SpringLayout.SOUTH, lblDatoq);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblDatoq);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, -122, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, -68, SpringLayout.EAST, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, -12, SpringLayout.NORTH, textField_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_1, 159, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, lblDatoq);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_1, -68, SpringLayout.EAST, contentPane);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField_2, 11, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField_2, -67, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_1, -13, SpringLayout.NORTH, textField_2);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField_2, 200, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField_2, -23, SpringLayout.SOUTH, contentPane);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField.setText("corona");
		textField_1.setText("20.5");
		textField_2.setText("355 ml");
		
		JComboBox comboBox_1 = new JComboBox();
		sl_contentPane.putConstraint(SpringLayout.NORTH, comboBox_1, 21, SpringLayout.SOUTH, comboBox);
		sl_contentPane.putConstraint(SpringLayout.WEST, comboBox_1, 48, SpringLayout.EAST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, comboBox_1, 12, SpringLayout.EAST, comboBox);
		contentPane.add(comboBox_1);
	}
}
