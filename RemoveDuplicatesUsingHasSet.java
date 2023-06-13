package collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Emp2
{
	private int id;
	private String name;
	
	public Emp2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		
		Emp2 other = (Emp2) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Emp2 [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}

public class RemoveDuplicatesUsingHasSet {
	
	public static void main(String[] args) {
		Set<Emp2> set =new HashSet<Emp2>();
		set.add(new Emp2(1,"Mahesh"));
		set.add(new Emp2(2,"Nazma"));
		set.add(new Emp2(3,"Darshan"));
		set.add(new Emp2(3,"Laxmi"));
		set.add(new Emp2(3,"Rahul"));
		
		for(Emp2 e:set)
		{
			System.out.println(e);
		}

	}

}
