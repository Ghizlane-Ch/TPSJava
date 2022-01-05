package ma.education.tp1.introduction;

public class SalleCours extends Salle{
	
	int Nbrp; 
	
	public SalleCours(long id, String nom, int nbPlaces) {
		super(id, nom);
		this.Nbrp = nbPlaces;
		}
	
	
}
