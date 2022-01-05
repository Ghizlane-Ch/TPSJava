package ma.education.tp5.collections;

import java.util.HashSet;
import java.util.Set;

public class Rappel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Set<Laptop> l = new HashSet<>();
			l.add(new Laptop(12.000));
			l.add(new Laptop(13.6));
			l.add(new Laptop(12));
			l.add(new Laptop(15.4));
			l.add(new Laptop(13.600));
			l.add(new Laptop(13.60));
			l.forEach(i-> System.out.println(i));
			}
			}

