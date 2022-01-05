package ma.education.tp.abstarctkeyword;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FormeGeometrique f1 =new FormeGeometrique();//les classes abstraites ne peuvent pas etre instanciable
		//FormeGeometrique f2 = new FormeGeoTypeA();//les classes abstraites ne peuvent pas etre instanciable
		FormeGeometrique f3 = new Triangle();
		FormeGeometrique f4 = new FormeGeometrique() {
			
		@Override 
		// Classe fille Annonyme
		
		public double calculerSurface() {
			
					return 22;
		}
		};

	}

}
