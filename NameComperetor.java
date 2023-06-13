package collection;

import java.util.Comparator;

public class NameComperetor implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {
		
		return e1.getName().compareTo(e2.getName());
	}
	
}
