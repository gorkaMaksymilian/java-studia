package zajecia;

public abstract class Block implements Volume,Kind,Surface {
	protected String kind="";
	
	@Override
	public abstract double getVolume();
	
	@Override
	public String getKind() {
		return kind;
	}
	
	

}
