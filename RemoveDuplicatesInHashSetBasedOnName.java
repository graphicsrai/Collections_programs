package collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Emp3
{
	private int id;
	private String name;
	public Emp3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp3 [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp3 other = (Emp3) obj;
		return  this.name.equals(other.name);
	}
	
	
}
public class RemoveDuplicatesInHashSetBasedOnName {

	public static void main(String[] args) {
		Set<Emp3>set=new HashSet<Emp3>();
		set.add(new Emp3(1, "Ram"));
		set.add(new Emp3(2, "Ram"));
		set.add(new Emp3(3, "Shyam"));
		set.add(new Emp3(4, "Radhe"));
		set.add(new Emp3(5, "Radhe"));
		set.add(new Emp3(6, "Krishana"));
		
		
		for(Emp3 e: set)
		{
			System.out.println(e);
		}
	}

}
