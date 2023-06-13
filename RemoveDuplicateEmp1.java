package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RemoveDuplicateEmp1 {
	private int id;
	private String Name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
	

	@Override
	public int hashCode() {
//		return id;
		return this.Name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
//		return this.id==obj.hashCode();
		RemoveDuplicateEmp1 e=(RemoveDuplicateEmp1)obj;
		return this.Name.equals(e.getName());
	}

	@Override
	public String toString() {
		return "RemoveDuplicateEmp1 [id=" + id + ", Name=" + Name + "]";
	}

	public RemoveDuplicateEmp1(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	public static void main(String[] args) {
		List<RemoveDuplicateEmp1> l1=new ArrayList<RemoveDuplicateEmp1>();
		l1.add(new RemoveDuplicateEmp1(13,"Mohit"));
		l1.add(new RemoveDuplicateEmp1(22,"Iccha"));
		l1.add(new RemoveDuplicateEmp1(11,"Mohit"));
		
		for(int i=0; i<l1.size();i++)
		{
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
