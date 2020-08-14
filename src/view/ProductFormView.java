package view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import app.RoutingDelegate;

public class ProductFormView {
	private JFrame window;
	private Container windowContainer;
	public FormViewDelegate delegate;
	public RoutingDelegate router;
	
	JTextField nameTextField, priceTextField;
	JTextArea descriptionTextArea;
	
	// MARK: Public

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
	
	// MARK: Private
	
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
		titleLabel = new JLabel("Novo produto");
		panel.add(titleLabel);
		windowContainer.add(panel);
	}
	
	private void createForm() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
        
        JLabel nameLabel, priceLabel, descriptionLabel;
        nameLabel = new JLabel("Nome");
        priceLabel = new JLabel("Preço em centavos");
        descriptionLabel = new JLabel("Descrição");
        
	    nameTextField = new JTextField(40);  
	    priceTextField = new JTextField(40);
	    descriptionTextArea = new JTextArea();
		         
	    panel.add(nameLabel);
	    panel.add(nameTextField);
	    panel.add(priceLabel);
	    panel.add(priceTextField);
	    panel.add(descriptionLabel);
	    panel.add(descriptionTextArea);
	    
	    panel.setVisible(true);
		
		windowContainer.add(panel);
	}
	
	private void createControlls() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setSize(300, 50);
		
		JButton saveAndContinueBtn = new JButton("Salvar e cadastrar novo");
		saveAndContinueBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delegate.addProductClicked(
						nameTextField.getText(),
						descriptionTextArea.getText(),
						Integer.valueOf(priceTextField.getText()) 
				);
				router.completedProductInformationForm(true);
			}
		});
		
		JButton saveAndFinishBtn = new JButton("Salvar e encerrar");
		saveAndFinishBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delegate.addProductClicked(
						nameTextField.getText(),
						descriptionTextArea.getText(),
						Integer.valueOf(priceTextField.getText()) 
				);
				delegate.saveSellerClicked();
				router.completedProductInformationForm(false);
			}
		});
		
		panel.add(saveAndContinueBtn);
		panel.add(saveAndFinishBtn);
		
		panel.setVisible(true);
		
		windowContainer.add(panel);
	}
}
