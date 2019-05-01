import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

/**
 * @author Sam Thomas
 * Email: sathomas7@dmacc.edu
 * 
 * This jframe is the main menu for my program
 */
public class BurgerRestaurantApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BurgerRestaurantApp window = new BurgerRestaurantApp();
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
	public BurgerRestaurantApp() {
		initialize();
	}
	
	
	/*
	 *My attempt at passing the order object back to the main screen
	public BurgerRestaurantApp(BuildOrder order) {
		initialize();
	}
	*/

	/**
	 * Initialize the contents of the frame.
	 * 
	 * The content is a some what out of order due to dragging and dropping elements to differnt locations
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//This button takes you to the OrderFood jframe
		JButton btnNewOrder = new JButton("New Order");
		btnNewOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				OrderFood newOrder = new OrderFood();
				newOrder.setVisible(true);
			}
		});
		btnNewOrder.setBounds(131, 91, 163, 33);
		frame.getContentPane().add(btnNewOrder);
		
		//This would take you to a page to view orders if i had time to figure out how to properly pass objects between jframes
		JButton btnNewButton = new JButton("View Order Queue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(131, 136, 163, 33);
		frame.getContentPane().add(btnNewButton);
		
		//This button would have taken you to a jframe that showed the orders sorted by price
		JButton btnViewTodaysOrders = new JButton("View Today's Orders");
		btnViewTodaysOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnViewTodaysOrders.setBounds(131, 180, 163, 33);
		frame.getContentPane().add(btnViewTodaysOrders);
		
		//This is just a label for the Buttons
		JLabel lblWelcomeToBurger = new JLabel("Welcome to Build A Burger");
		lblWelcomeToBurger.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToBurger.setBounds(131, 52, 163, 14);
		frame.getContentPane().add(lblWelcomeToBurger);
	}
}
