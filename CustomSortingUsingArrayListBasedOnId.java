package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Color implements Comparable<Color>
{
	private int id;
	private String name;
	
	
	public Color() {
		super();
		
	}

	public Color(int id, String name) {
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
	public int compareTo(Color o) {
		
		if(this.id==o.getId())
		{
			return 0;
		}
		else if (this.id>o.getId()) 
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	
	
}

public class CustomSortingUsingArrayListBasedOnId {

	public static void main(String[] args) {
		List<Color> list=new ArrayList<Color>();
		list.add(new Color(7, "Red"));
		list.add(new Color(3, "Blue"));
		list.add(new Color(1, "Green"));
		list.add(new Color(10, "Yellow"));
		list.add(new Color(2, "Brown"));
		list.add(new Color(8, "Pink"));
		list.add(new Color(8, "Black"));
		
		Collections.sort(list);
//		Set<Color> set=new TreeSet<Color>(list);

		for(Color c:list)
		{
			System.out.println(c);
//			if(c.getId()>7)
//			{
//				System.out.println(c);
//			}
		}
	}

}
