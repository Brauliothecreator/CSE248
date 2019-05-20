package composites_2;

public abstract class Duck {

	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setquackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void performQuack() {
		quackBehavior.quackBehavior();
		
	}
	public void performFly() {
		flyBehavior.fly();
	}
}
