import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Sam Thomas
 * Email: sathomas7@dmacc.edu
 */
public class QueueOrders {
	//the queue is declared
	private Queue<BuildOrder> queueOfOrders;
	
	
	/**
	 * Default Constructor
	 * Sets up the queue when the Queue orders object is created
	 */
	public QueueOrders() {
		queueOfOrders = new LinkedList<>();
	}
	
	
	/**
	 * takes in the BuildOrder object and adds it to the queue
	 * @param order
	 */
	public void addOrder(BuildOrder order) {
		queueOfOrders.add(order);
	}
	
	
	/**
	 * Removes the order at the head of the queue
	 */
	public void removeOrder() {
		queueOfOrders.remove();
	}
	
	/**
	 * Prints the contents of the order in the head of the queue
	 */
	public void PrintHeadOrder() {
		queueOfOrders.peek().printExtraItems();
		System.out.println();
		queueOfOrders.peek().printStackList();
	}
}
