package ma.eduction.tp6.annotations;

public class TestReflectionAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		Class c = CalculatriceMath.class;
		@SuppressWarnings("unchecked")
		Programmer programmer = (Programmer)
				c.getAnnotation(Programmer.class);
		System.out.println(programmer.id()+":"+programmer.name());

	
}

}
