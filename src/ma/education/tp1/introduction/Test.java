package ma.education.tp1.introduction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Salle s2=new Salle("salle informatique");
		Salle s3=new Salle(2,"salle des cours");
		Laboratoire s4=new Laboratoire(3,"fsdfs","sdfsfs");
		SalleCours s5=new SalleCours(22,"sfsfsf",4);
		
		System.out.println(s2.nom);
		System.out.println(s3.id+" "+s3.nom);
		System.out.println(s4.nom+s4.id+s4.type);
		System.out.println(s5.nom+s5.id+s5.Nbrp);
		
		
		
	}

}
