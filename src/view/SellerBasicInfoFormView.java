package view;
import javax.swing.*;

import app.RoutingDelegate;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SellerBasicInfoFormView {

	private JFrame window;
	private Container windowContainer;
	public UIDelegate delegate;
	public RoutingDelegate router;
	
	JTextField nameTextField, emailTextField, phoneTextField;
	
	public void display() {
		createBase();
		createHeader();
		createForm();
		createControlls();
		window.validate();
	}
	
	private void createBase() {
		window = new JFrame();
		windowContainer = window.getContentPane();
		windowContainer.setLayout(new GridLayout(3, 1));
		window.setSize(300,500);
		window.setVisible(true);
	}
	
	private void createHeader() {
		JPanel panel = new JPanel();
		JLabel titleLabel;
		titleLabel = new JLabel("Informações Básicas");
		panel.add(titleLabel);
		windowContainer.add(panel);
	}
	
	private void createForm() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
        
        JLabel nameLabel, emailLabel, phoneLabel;
        nameLabel = new JLabel("Nome");
        emailLabel = new JLabel("e-mail");
        phoneLabel = new JLabel("phone");
        
	    nameTextField = new JTextField(40);  
	    emailTextField = new JTextField(40);
	    phoneTextField = new JTextField(20);
		         
	    panel.add(nameLabel);
	    panel.add(nameTextField);
	    panel.add(emailLabel);
	    panel.add(emailTextField);
	    panel.add(phoneLabel);
	    panel.add(phoneTextField);
	    
	    panel.setVisible(true);
		
		windowContainer.add(panel);
	}
	
	private void createControlls() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setSize(300, 50);
		
		JButton btn = new JButton("Continuar");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delegate.saveBasicInformationClicked(
						nameTextField.getText(),
						emailTextField.getText(),
						phoneTextField.getText()
				);
				router.completedBasicInformationForm();
			}
		});
		
		panel.add(btn);
		
		panel.setVisible(true);
		
		windowContainer.add(panel);
	}
}
