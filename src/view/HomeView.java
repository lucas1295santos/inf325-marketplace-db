package view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.RoutingDelegate;

public class HomeView {

	private JFrame window;
	private Container windowContainer;
	public RoutingDelegate router;

	// MARK: - Public
	
	public void display() {
		createBase();
		createHeader();
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
		windowContainer.setLayout(new GridLayout(2, 1));
		window.setSize(300,500);
		window.setVisible(true);
	}
	
	private void createHeader() {
		JPanel panel = new JPanel();
		JLabel titleLabel;
		titleLabel = new JLabel("Painel de gerenciamento do Marketplace");
		panel.add(titleLabel);
		windowContainer.add(panel);
	}
	
	private void createControlls() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setSize(300, 50);
		
		JButton registerSellerBtn = new JButton("Registrar loja");
		registerSellerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				router.presentRegisterSellerForm();
			}
		});
		
		JButton viewSellersBtn = new JButton("Ver lojas");
		viewSellersBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				router.presentListSellers();
			}
		});
		
		panel.add(registerSellerBtn);
		panel.add(viewSellersBtn);
		
		panel.setVisible(true);
		
		windowContainer.add(panel);
	}

}
