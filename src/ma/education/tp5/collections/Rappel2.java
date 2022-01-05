package ma.education.tp5.collections;

import java.util.Set;
import java.util.TreeSet;

public class Rappel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("trie with x");
			Set<Point> lx = new TreeSet<>((p1,p2)->(int) (p1.x-p2.x));
			lx.add(new Point(12.5,13));
			lx.add(new Point(14.4,15));
			lx.add(new Point(12.50,15));
			lx.add(new Point(11.50,15));
			lx.forEach(i-> System.out.println(i));
			
			System.out.println("trie with y");
			Set<Point> ly = new TreeSet<>((p1,p2)->(int) (p1.y-p2.y));
			ly.add(new Point(12.5,13));
			ly.add(new Point(14.4,15));
			ly.add(new Point(12.50,15));
			ly.add(new Point(11.50,15));
			ly.forEach(i-> System.out.println(i));
}}



