package mailbox;
import javax.swing.JLabel;

import obs.IObserver;
import obs.Subject;

public class CounterObserver extends JLabel implements IObserver {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int counter;
	
	public CounterObserver() {
		this.counter = 0;
	}
	
	private synchronized void incrementCounter() {
		counter++;
	}
	
	@Override
	public void update(Subject s) {
		incrementCounter();
		setText(counter + "");
	} 

}
