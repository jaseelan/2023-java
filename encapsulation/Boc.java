package encapsulation;

public class Boc {
	public static void main(String[] args) {
		Bank Boc = new Bank();
		Boc.setBank_id(1);
		Boc.setInterest_rate(12.8);
		Boc.setName("Bank of cylone");
		Boc.setType_of_bank("Goverment");
	System.out.println(Boc.getBank_id());
	System.out.println(Boc.getInterest_rate());
	System.out.println(Boc.getName());
	System.out.println(Boc.getType_of_bank());
		
	}
}
