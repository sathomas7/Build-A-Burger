import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * @author Sam Thomas
 * Email: sathomas7@dmacc.edu
 * 
 * This jframe allows you to order food and add it to the queue
 */
public class OrderFood extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderFood frame = new OrderFood();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * In this frame you can click on the buttons to order food and add the order to the queue
	 */
	public OrderFood() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 871, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Declaring the objects that the program uses
		BuildOrder order = new BuildOrder();
		QueueOrders orderQueue = new QueueOrders();
		
		//This button takes you back to the main menu. and would have had a object passed back through it if i figured out how to do that
		JButton btnFinishOrder = new JButton("Finish Order");
		btnFinishOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				BurgerRestaurantApp.main(null);
			}
		});
		btnFinishOrder.setBounds(602, 214, 116, 23);
		contentPane.add(btnFinishOrder);
		
		//adds item to the Burger stack
		JButton btnNewButton = new JButton("Burger 1/4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(1);
			}
		});
		btnNewButton.setBounds(19, 44, 102, 23);
		contentPane.add(btnNewButton);
		
		//adds item to the Burger stack
		JButton btnNewButton_1 = new JButton("Burger 1/3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(2);
			}
		});
		btnNewButton_1.setBounds(19, 78, 102, 23);
		contentPane.add(btnNewButton_1);
		
		//adds item to the Burger stack
		JButton btnNewButton_2 = new JButton("Burger 1/2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(3);
			}
		});
		btnNewButton_2.setBounds(19, 112, 102, 23);
		contentPane.add(btnNewButton_2);
		
		//adds item to the Burger stack
		JButton btnNewButton_3 = new JButton("Vegan 1/4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(4);
			}
		});
		btnNewButton_3.setBounds(19, 146, 102, 23);
		contentPane.add(btnNewButton_3);
		
		//Adds item to the array of extra items
		JButton btnNewButton_4 = new JButton("Fries Small");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addExtraItems("Fries Small");
			}
		});
		btnNewButton_4.setBounds(476, 44, 116, 23);
		contentPane.add(btnNewButton_4);
		
		//Adds item to the array of extra items
		JButton btnFriesMed = new JButton("Fries Med");
		btnFriesMed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addExtraItems("Fries Med");
			}
		});
		btnFriesMed.setBounds(476, 78, 116, 23);
		contentPane.add(btnFriesMed);
		
		//Adds item to the array of extra items
		JButton btnFriesLarge = new JButton("Fries Large");
		btnFriesLarge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addExtraItems("Fries Large");
			}
		});
		btnFriesLarge.setBounds(476, 112, 116, 23);
		contentPane.add(btnFriesLarge);
		
		//Adds item to the array of extra items
		JButton btnDrinkSmall = new JButton("Drink Small");
		btnDrinkSmall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addExtraItems("Drink Small");
			}
		});
		btnDrinkSmall.setBounds(602, 44, 116, 23);
		contentPane.add(btnDrinkSmall);
		
		//Adds item to the array of extra items
		JButton btnDrinkMed = new JButton("Drink Med");
		btnDrinkMed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addExtraItems("Drink Med");
			}
		});
		btnDrinkMed.setBounds(602, 78, 116, 23);
		contentPane.add(btnDrinkMed);
		
		//Adds item to the array of extra items
		JButton btnDrinkLarge = new JButton("Drink Large");
		btnDrinkLarge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addExtraItems("Drink Large");
			}
		});
		btnDrinkLarge.setBounds(602, 112, 116, 23);
		contentPane.add(btnDrinkLarge);
		
		//Adds item to the array of extra items
		JButton btnNewButton_5 = new JButton("Shake Small");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addExtraItems("Shake Small");
			}
		});
		btnNewButton_5.setBounds(730, 44, 114, 23);
		contentPane.add(btnNewButton_5);
		
		//Adds item to the array of extra items
		JButton btnShakeMed = new JButton("Shake Med");
		btnShakeMed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addExtraItems("Shake Med");
			}
		});
		btnShakeMed.setBounds(728, 78, 116, 23);
		contentPane.add(btnShakeMed);
		
		//Adds item to the array of extra items
		JButton btnShakeLarge = new JButton("Shake Large");
		btnShakeLarge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addExtraItems("Shake Large");
			}
		});
		btnShakeLarge.setBounds(728, 112, 116, 23);
		contentPane.add(btnShakeLarge);
		
		//adds item to the Burger stack
		JButton btnNewButton_6 = new JButton("Vegan 1/3");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(5);
			}
		});
		btnNewButton_6.setBounds(19, 180, 102, 23);
		contentPane.add(btnNewButton_6);
		
		//adds item to the Burger stack
		JButton btnNewButton_7 = new JButton("Vegan 1/2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(6);
			}
		});
		btnNewButton_7.setBounds(19, 214, 102, 23);
		contentPane.add(btnNewButton_7);
		
		//Label for instructions
		JLabel label = new JLabel("Select the desired ingredients:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(131, 11, 209, 14);
		contentPane.add(label);
		
		JButton btnBacon = new JButton("Bacon");
		btnBacon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(7);
			}
		});
		btnBacon.setBounds(131, 44, 99, 23);
		contentPane.add(btnBacon);
		
		//adds item to the Burger stack
		JButton button_1 = new JButton("Cheese");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(10);
			}
		});
		button_1.setBounds(240, 44, 100, 23);
		contentPane.add(button_1);
		
		//adds item to the Burger stack
		JButton button_2 = new JButton("Lettuce");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(8);
			}
		});
		button_2.setBounds(131, 78, 99, 23);
		contentPane.add(button_2);
		
		//adds item to the Burger stack
		JButton button_3 = new JButton("Tomatoes");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(9);
			}
		});
		button_3.setBounds(131, 112, 99, 23);
		contentPane.add(button_3);
		
		//adds item to the Burger stack
		JButton button_4 = new JButton("Onions");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(11);
			}
		});
		button_4.setBounds(240, 78, 100, 23);
		contentPane.add(button_4);
		
		//adds item to the Burger stack
		JButton button_5 = new JButton("Jalapenos");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(12);
			}
		});
		button_5.setBounds(240, 112, 100, 23);
		contentPane.add(button_5);
		
		//Label for the sauces section of the build a burger
		JLabel label_1 = new JLabel("Sauces:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(350, 11, 94, 14);
		contentPane.add(label_1);
		
		//adds item to the Burger stack
		JButton button_6 = new JButton("Ketchup");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(16);
			}
		});
		button_6.setBounds(347, 44, 97, 23);
		contentPane.add(button_6);
		
		//adds item to the Burger stack
		JButton button_7 = new JButton("Mustard");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(17);
			}
		});
		button_7.setBounds(347, 78, 97, 23);
		contentPane.add(button_7);
		
		//adds item to the Burger stack
		JButton button_8 = new JButton("Mayo");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(18);
			}
		});
		button_8.setBounds(347, 112, 97, 23);
		contentPane.add(button_8);
		
		//adds item to the Burger stack
		JButton button_9 = new JButton("BBQ");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(19);
			}
		});
		button_9.setBounds(347, 146, 97, 23);
		contentPane.add(button_9);
		
		//adds item to the Burger stack
		JButton button_10 = new JButton("Sriracha");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(20);
			}
		});
		button_10.setBounds(347, 180, 97, 23);
		contentPane.add(button_10);
		
		//adds item to the Burger stack
		JButton button_11 = new JButton("Hot Sauce");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(21);
			}
		});
		button_11.setBounds(347, 214, 97, 23);
		contentPane.add(button_11);
		
		//adds item to the Burger stack
		JButton button_12 = new JButton("Caramel onions");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(15);
			}
		});
		button_12.setBounds(131, 214, 209, 23);
		contentPane.add(button_12);
		
		//adds item to the Burger stack
		JButton button_13 = new JButton("Green Onions");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(14);
			}
		});
		button_13.setBounds(131, 180, 209, 23);
		contentPane.add(button_13);
		
		//adds item to the Burger stack
		JButton button_14 = new JButton("Grilled Mushrooms");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(13);
			}
		});
		button_14.setBounds(131, 146, 209, 23);
		contentPane.add(button_14);
		
		//Adds the bun to the top of the burger to finish if off
		JButton button_15 = new JButton("Finish Burger");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order.addIngredientString(22);
			}
		});
		button_15.setBounds(131, 248, 209, 23);
		contentPane.add(button_15);
		
		//Label for the drinks, shakes and fries section
		JLabel lblAddional = new JLabel("Additional Items:");
		lblAddional.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddional.setBounds(503, 11, 299, 14);
		contentPane.add(lblAddional);
		
		//Label for the Burger section
		JLabel lblBurgers = new JLabel("Burgers:");
		lblBurgers.setHorizontalAlignment(SwingConstants.CENTER);
		lblBurgers.setBounds(19, 11, 102, 14);
		contentPane.add(lblBurgers);
		
		//This button adds the order object to the queue and displays it
		JButton btnPrintQueue = new JButton("Print Order");
		btnPrintQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderQueue.addOrder(order);
				orderQueue.PrintHeadOrder();
			}
		});
		btnPrintQueue.setBounds(602, 180, 116, 23);
		contentPane.add(btnPrintQueue);
	}

}
