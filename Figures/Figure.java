package Figures;

public abstract class Figure {
	private String name="";
	
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract void rescale(double scale);
	
	protected void setKind(String name) {
		this.name = name;
	}
	
	public String getKind() {
		return name;
	}
	
	
}
