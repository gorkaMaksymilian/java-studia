package Source;

public class Samochod extends Pojazd {
	
	public Samochod(String marka,int masa) {
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
