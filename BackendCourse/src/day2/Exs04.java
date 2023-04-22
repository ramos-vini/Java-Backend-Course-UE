package day2;

public class Exs04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double loan = 70000.00;
		
		double anualRate = 0.2;
		double monthlyRate = anualRate/12;
		
		int years = 5;
		int months = years*12;
		
		
		loan = loan * (1 + monthlyRate);
		double monthlyPay = loan / months;
		
		int counter = 1;
		for (int i = months; i >= 1; i--) {
			System.out.println(counter+". Month: "+monthlyPay);
			
			loan = (loan - monthlyPay) * (1 + monthlyRate);
			
			months--;
			
			monthlyPay = loan / months;
			
			counter++;
			
			System.out.println("Remainder: "+loan+"\n");
		}
	}

}
