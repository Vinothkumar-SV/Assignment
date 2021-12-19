package javapgm;

	public class BankInfo extends AxisBank {
		
		public void saving() {
			
			System.out.println("5%");
		}

		public void fixed() {
			
			System.out.println("7%");
		}
		
		public void deposit() {
			
			System.out.println("9%");
		}


	public static void main(String[] args) {
		
		BankInfo te =  new BankInfo();
		te.deposit();
		te.fixed();
		te.saving();
				
		
	}}
	
