package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpMain {
	public static void main(String[] args) {
		List<Emp> l1=new ArrayList<Emp>();
		l1.add(new Emp(44,"Mohit"));
		l1.add(new Emp(22,"Iccha"));
		l1.add(new Emp(11,"Mohit"));
		
		Collections.sort(l1,new IdCoperetor());
		System.out.println(l1);
		
		Collections.sort(l1,new NameComperetor());
		System.out.println(l1);
	}
}
