package source;

public abstract class Pojazd implements DaneOgolne, DaneTechniczne,Comparable<Pojazd> {

	int masa = 0;
	String marka = "";
	
	
	@Override
	public int getMasa() {
		return masa;
	}

	@Override
	public String getMarka() {
		return marka;
	}
	
	@Override
	public int compareTo(Pojazd p) {
		return Integer.valueOf(this.getMasa()).compareTo(Integer.valueOf(p.getMasa()));
	}

}
