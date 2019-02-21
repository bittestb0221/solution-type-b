package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	private int result;
	
	public Money(int amount) {
		this.amount=amount;
	}

	public Money add(Money money) {
		result=this.amount+money.amount;
		return this;
	}

	public Money minus(Money money) {
		result=this.amount-money.amount;
		return this;
	}

	public Money multiply(Money money) {
		result=this.amount*money.amount;
		return this;
	}

	public Money devide(Money money) {
		try {
			result=this.amount/money.amount;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.result)
			return false;
		return true;
	}
	
	
}