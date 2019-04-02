package Source;

public abstract class Pojazd implements Dane_ogolne,Dane_techniczne,Comparable<Pojazd> {
	protected String marka="";
	protected int masa=0;
	
	@Override
	public int compareTo(Pojazd arg) {
		return Integer.valueOf(this.getMasaCalkowita()).compareTo(Integer.valueOf(arg.getMasaCalkowita()));
		
	}
}
