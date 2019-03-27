package zajecia;

public abstract class Block implements Volume,Kind,Surface,Comparable<Block> {
	protected String kind="";
//	
//	@Override
//	public abstract double getVolume();
//	
	@Override
	public String getKind() {
		return kind;
	}
	
	@Override
	public int compareTo(Block arg) {
		return Double.valueOf(this.getSurface()).compareTo(Double.valueOf(arg.getSurface()));
		
	}

}
