package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Color1{
	private int id;
	private String name;
	
	public Color1(int id, String name) {
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
	public String toString() {
		return "Color [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Color1 other = (Color1) obj;
		return id == other.id;
	}
	
	
}

class SortingBasedOnId implements Comparator<Color1>
{

	@Override
	public int compare(Color1 o1, Color1 o2) {
		
		if(o1.getId()==o2.getId())
		{
			return 0;
		}
		else if (o1.getId()>o2.getId()) {
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
public class SortingUsingComparater {

	public static void main(String[] args) {
		List<Color1> list=new ArrayList<Color1>();
		list.add(new Color1(1, "Red"));
		list.add(new Color1(6, "Blue"));
		list.add(new Color1(2, "Yellow"));
		list.add(new Color1(8, "Green"));
		list.add(new Color1(3, "Orange"));
		list.add(new Color1(5, "White"));
		list.add(new Color1(1, "Black"));
		
		Collections.sort(list,new  SortingBasedOnId());
		for (int i = 0; i < list.size(); i++)
		{
			for (int j = i+1; j < list.size(); j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					list.remove(i);
				}
			}
		}
		
		for(Color1 c:list)
		{
			System.out.println(c);
		}
	}

}
