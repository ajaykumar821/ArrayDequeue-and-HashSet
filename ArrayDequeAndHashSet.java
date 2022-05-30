package college;

import java.util.*;

public class ArrayDequeAndHashSet {

	public static void main(String[] args) {
		ArrayDeque<Integer> sc = new ArrayDeque<>();
		sc.add(1123);
		sc.add(1326);
		sc.add(6325);
		sc.add(9328);
		sc.addFirst(9000);
		sc.addLast(3);
		System.out.println(sc);
		
		
		
		
		System.out.println("\n ------Hash Set Start------ ");
		HashSet<Integer> sc1 = new HashSet<>(6,1);
		
		sc1.add(12);
		sc1.add(2324);
		sc1.add(342);
		sc1.add(3242);
		System.out.println(sc1);
		System.out.println(sc1.contains(3242));
	}

}
