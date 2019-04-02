package Source;

public class Motocykl extends Pojazd {
	
	public Motocykl(String marka,int masa) {
		this.marka = marka;
		this.masa = masa;
	}

	@Override
	public String getMarka() {
		return marka;
	}

	@Override
	public int getMasaCalkowita() {
		return masa;
	}

}
