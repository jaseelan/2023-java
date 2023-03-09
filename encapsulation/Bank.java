package encapsulation;

public class Bank {
	private int bank_id;
	private String name;
	private double interest_rate;
	private String type_of_bank;

	public int getBank_id() {
		return bank_id;
	}

	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInterest_rate() {
		return interest_rate;
	}

	public void setInterest_rate(double interest_rate) {
		this.interest_rate = interest_rate;
	}

	public String getType_of_bank() {
		return type_of_bank;
	}

	public void setType_of_bank(String type_of_bank) {
		this.type_of_bank = type_of_bank;
	}

}
