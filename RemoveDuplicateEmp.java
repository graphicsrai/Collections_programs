package collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateEmp {
	public static void main(String[] args) {
		List<Emp> l1=new ArrayList<Emp>();
		l1.add(new Emp(14,"Mohit"));
		l1.add(new Emp(22,"Iccha"));
		l1.add(new Emp(11,"Mohit"));
		
		for(int i=0;i<l1.size();i++)
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
