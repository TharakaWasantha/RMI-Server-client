package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;

import com.code.value.User;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class client_login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					client_login window = new client_login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public client_login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 806, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 791, 369);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.white);
		
		JLabel lblUserName = new JLabel("Password :");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUserName.setForeground(Color.BLACK);
		lblUserName.setBounds(237, 149, 112, 28);
		panel.add(lblUserName);
		
		JLabel label_1 = new JLabel("User Name :");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(237, 104, 128, 28);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setBounds(366, 104, 197, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(366, 149, 197, 27);
		panel.add(passwordField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.black);
		panel_1.setBounds(0, 0, 791, 48);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 136, 26);
		panel_1.add(lblNewLabel);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		label_2.setIcon(new ImageIcon("C:\\Users\\Tharaka\\Desktop\\ClientPic\\icons8_Delete_25px.png"));
		label_2.setBounds(741, 0, 40, 51);
		panel_1.add(label_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(0, 342, 791, 27);
		panel.add(panel_3);
		
		JButton btnLogtin = new JButton("LOGIN");
		btnLogtin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogtin.setBounds(294, 255, 89, 38);
		panel.add(btnLogtin);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(406, 255, 134, 38);
		panel.add(btnNewButton);
		
		JLabel lblType = new JLabel("Type :");
		lblType.setForeground(Color.BLACK);
		lblType.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblType.setBounds(237, 199, 112, 28);
		panel.add(lblType);
		frame.setLocationRelativeTo(null);
		
		btnLogtin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				User user=new User();
				user.setUsername(textField.getText());
				user.setPassword(passwordField.getText());
				
				try {
					//String result=ServerRemotefounder.getRemote().login(user);
					//System.out.println(result);
					if(true) {
						//result.equalsIgnoreCase("Success")
					client_main cli=	new client_main();
					frame.setVisible(false);
					}
					else {
						//JOptionPane.showMessageDialog(null, result);
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Here", "Free User"   }));
		comboBox.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				
				
			}
		});
		comboBox.setBounds(366, 199, 197, 27);
		panel.add(comboBox);
		
		JLabel label2 = new JLabel("");
		label2.setIcon(new ImageIcon("C:\\Users\\Tharaka\\Desktop\\ClientPic\\bg3.jpg"));
		label2.setBounds(220, 50, 600, 300);
		panel.add(label2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Tharaka\\Desktop\\ClientPic\\logo-mini.png"));
		label.setBounds(0, 0, 250, 390);
		panel.add(label);
	}
}
