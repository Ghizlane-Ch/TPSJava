package ma.education.tp4.singleton;

public class Terre {
	
	double distanceToSoleil;
	double surface;
	
	private static Terre instance;
	private Terre(double s,double dt) {
		this.distanceToSoleil=dt;
		this.surface=s;
	}
		
	public static Terre getInstance(double s,double dt) {
		if(instance==null) {
			instance=new Terre(s,dt);
		}return instance;
	
	};
}
