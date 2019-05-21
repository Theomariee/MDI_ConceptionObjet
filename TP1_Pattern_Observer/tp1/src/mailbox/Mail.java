package mailbox;

public class Mail {
	
	String subject;
	public String getSubject() {
		return subject;
	}
	public String getBody() {
		return body;
	}
	String body;
	public Mail(String subject, String body) {
		super();
		this.subject = subject;
		this.body = body;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Subject: " + this.subject + " Body: " + this.body;
	}

}
