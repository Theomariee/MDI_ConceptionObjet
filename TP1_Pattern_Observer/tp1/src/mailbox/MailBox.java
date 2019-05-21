package mailbox;

import java.util.ArrayList;
import java.util.List;

import obs.IObserver;
import obs.Subject;



public class MailBox extends Subject {

	private static MailBox instance = null;
	List<Mail> mail = new ArrayList<Mail>();
	private List<IObserver> observers;

	private MailBox(){
		this.observers = new ArrayList<IObserver>();
	}
	
	public static MailBox getInstance() {
		if (instance==null)
			instance = new MailBox();
		return instance;
	}
	
	public void addMail(Mail m ){
		this.mail.add(m);
		notifyObservers();
	}

	public Mail getLastMail() {
		return this.mail.get(mail.size()-1);
	}

	public Integer getNbreMail() {
		return mail.size();
	}
	
	public boolean isEmpty() {
		return mail.isEmpty();
	}

	public String read() {
		String res = "";
		
		for(Mail m : mail) {	
			res.concat("Subject:" + m.getSubject() + "\n");
			res.concat("Body: " + m.getBody() + "\n");
		}
		
		return res;
	}
	
	@Override
	public void attach(IObserver o) {
		this.observers.add(o);
	}

	@Override
	public void detach(IObserver o) {
		this.observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(IObserver o : observers) {
			o.update(this);
		}
	}
	
}
