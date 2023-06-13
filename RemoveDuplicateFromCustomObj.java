package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class imp implements Comparable<imp>
{
	int id;
	String name;
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + "]";
	}
	public imp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
		
	@Override
	public boolean equals(Object obj) {
		
		return this.id== obj.hashCode();
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
		return id;
	}
	
	
	@Override
	public int compareTo(imp o) {
		if(this.name.equals(o.getName()))
		{
			return 0;
		}
		else if(this.name.compareTo(o.getName())>0)
		{
			return 1;
		}
		return -1;
	}
	
}

public class RemoveDuplicateFromCustomObj {

	public static void main(String[] args) {
		List<imp> l1=new ArrayList<>();
		l1.add(new imp(11,"Mohit"));
		l1.add(new imp(11,"Mohit"));
		l1.add(new imp(22,"Iccha"));
		
		for(int i=0;i<l1.size();i++) {
			for(int j=i+1;j<l1.size();j++)
			{
				if(l1.get(i).equals(l1.get(j)))
				{
					l1.remove(j);
				}
			}
		}
		System.out.println(l1);
	}

}
