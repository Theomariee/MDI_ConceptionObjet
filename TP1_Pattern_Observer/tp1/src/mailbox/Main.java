package mailbox;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	private void init() {
		System.out.println("init");

		JFrame f = new JFrame();
		f.setTitle("Test de JFrame"); 
	    f.setSize(300,200); 
		
		JPanel p = new JPanel();
		
			
		f.add(p);
		
		CounterObserver counterObs = new CounterObserver();
		MailObserver mailObs = new MailObserver();
		
		MailBox.getInstance().attach(counterObs);
		MailBox.getInstance().attach(mailObs);
		
		p.add(counterObs);
		p.add(mailObs);

		f.setVisible(true);
		f.dispose();
		System.out.println("init");
		f.show();
		
		
		
	}
	private void runScenario() {
		
		MailBox.getInstance().addMail(new Mail("ESIR" + new Random().nextInt(), "tp fini"));
		System.out.println(MailBox.getInstance().getNbreMail());
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("init");
		Main m= new Main();
		m.init();
		while (true){
		Thread.sleep(3000);
		m.runScenario();
		}
	}
	

}
