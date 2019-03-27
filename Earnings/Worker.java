package zad2;

public class Worker implements Earnings{
	protected String name="";
	protected String surname="";
	double monthlyEarnings=2000;
	
	@Override
	public double getEarnings() {
		
		return monthlyEarnings;
	}

	@Override
	public void addEarnings(double percent) {
		
		monthlyEarnings = percent*getEarnings()+getEarnings();
	}
	
	
}
