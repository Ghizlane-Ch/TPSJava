package ma.education.tp1.introduction;

public class Salle {
	
	public long id;
	public String nom;
	
	public Salle(){}
	public Salle(String nom) {
		this.nom=nom;
	}
	public Salle(long id,String nom) {
		this(nom);
		this.id=id;
	}
}
