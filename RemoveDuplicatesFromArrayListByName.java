package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student1 {
	private int id;
	private String name;
	
	public Student1(int id, String name) {
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
		return "Student1 [id=" + id + ", name=" + name + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	
}

public class RemoveDuplicatesFromArrayListByName {
	public static void main(String[] args) {
		List<Student1> students1 = new ArrayList<Student1>();
		students1.add(new Student1(1, "Ram"));
		students1.add(new Student1(7, "Ram2"));
		students1.add(new Student1(3, "Ram"));
		students1.add(new Student1(4, "Ram4"));
		students1.add(new Student1(5, "Ram"));
		students1.add(new Student1(6, "Ram6"));

		for (int i = 0; i < students1.size(); i++) {
			for (int j = i + 1; j < students1.size(); j++) {
				if(students1.get(i).equals(students1.get(j)))
				{
					students1.remove(j);
				}
			}
		}
		for (Student1 s : students1) {
			System.out.println(s);
		}
	}
}
