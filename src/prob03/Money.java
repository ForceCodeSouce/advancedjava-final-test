package prob03;

public class Money {

	private int amount;

	public Money(int num) {
		// TODO Auto-generated constructor stub
		this.amount = num;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Object add(Money i) {
		// TODO Auto-generated method stub
		return new Money(i.getAmount() + this.amount);
	}

	public Object minus(Money i) {
		// TODO Auto-generated method stub
		return new Money(this.amount - i.getAmount());
	}

	public Object multiply(Money i) {
		// TODO Auto-generated method stub

		return new Money(i.getAmount() * this.amount);
	}

	public Object devide(Money i) {
		// TODO Auto-generated method stub
		System.out.println(i.getAmount());
		System.out.println(this.amount);
		return new Money(this.amount / i.getAmount());
	}

	@Override
	public boolean equals(Object i) {
		if (i instanceof Money) {
			return ((Money) i).getAmount() == this.amount;
		}
		return false;
	}

}