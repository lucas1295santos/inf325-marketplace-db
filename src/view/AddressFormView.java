package view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import app.RoutingDelegate;

public class AddressFormView {
	private JFrame window;
	private Container windowContainer;
	public FormViewDelegate delegate;
	public RoutingDelegate router;
	
	JTextField zipCodeTextField, countryTextField, stateTextField;
	JTextField cityTextField, neighborhoodTextField, streetTextField, numberTextField;
	
	// MARK: - Public
	
	public void display() {
		createBase();
		createHeader();
		createForm();
		createControlls();
		window.validate();
	}
	
	public void close() {
		window.dispose();
	}
	
	// MARK: - Private
	
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
		titleLabel = new JLabel("Endereço");
		panel.add(titleLabel);
		windowContainer.add(panel);
	}
	
	private void createForm() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(7,2));
        
        JLabel l1, l2, l3, l4, l5, l6, l7;
        l1 = new JLabel("Cep");
        l2 = new JLabel("País");
        l3 = new JLabel("Estado");
        l4 = new JLabel("Cidade");
        l5 = new JLabel("Bairro");
        l6 = new JLabel("Rua");
        l7 = new JLabel("Número");
    	
    	zipCodeTextField = new JTextField(40);  
    	countryTextField = new JTextField(40);
    	stateTextField = new JTextField(20);
    	cityTextField = new JTextField(20);
    	neighborhoodTextField = new JTextField(20);
    	streetTextField = new JTextField(20);
    	numberTextField = new JTextField(20);

	    panel.add(l1);
	    panel.add(zipCodeTextField);
	    panel.add(l2);
	    panel.add(countryTextField);
	    panel.add(l3);
	    panel.add(stateTextField);
	    panel.add(l4);
	    panel.add(cityTextField);
	    panel.add(l5);
	    panel.add(neighborhoodTextField);
	    panel.add(l6);
	    panel.add(streetTextField);
	    panel.add(l7);
	    panel.add(numberTextField);
	    
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
				delegate.saveAddressClicked(
						zipCodeTextField.getText(),
						countryTextField.getText(),
						stateTextField.getText(),
						cityTextField.getText(),
						neighborhoodTextField.getText(),
						streetTextField.getText(),
						numberTextField.getText()
				);
				router.completedAddressForm();
			}
		});
		
		panel.add(btn);
		
		panel.setVisible(true);
		
		windowContainer.add(panel);
	}
}
