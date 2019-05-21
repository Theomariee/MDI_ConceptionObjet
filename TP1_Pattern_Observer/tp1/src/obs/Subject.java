package obs;

public abstract class Subject {
		
	public abstract void attach(IObserver o);
	
	public abstract void detach(IObserver o);
	
	public abstract void notifyObservers();
	
}
