package mailbox;

import javax.swing.JLabel;

import obs.IObserver;
import obs.Subject;

public class MailObserver extends JLabel implements IObserver {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	public MailObserver() {
	}
	
	private synchronized void updateContent() {
		setText(MailBox.getInstance().getLastMail().toString());
	}
	
	@Override
	public void update(Subject s) {
		updateContent();
	} 
}
