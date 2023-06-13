package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student {
	int id;
	String name;

	public Student(int id, String name) {
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
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public boolean equals(Student obj) {
		
		return this.id == obj.getId();
	}

}

public class RemoveDuplicatesFromArrayListCustomeObj {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "Ram"));
		students.add(new Student(2, "Ram2"));
		students.add(new Student(3, "Ram3"));
		students.add(new Student(3, "Ram4"));
		students.add(new Student(4, "Ram5"));
		students.add(new Student(4, "Ram6"));

		for (int i = 0; i < students.size(); i++) {
			for (int j = i + 1; j < students.size(); j++) {
				if (students.get(i).equals(students.get(j))) {
					students.remove(i);
				}
			}
		}
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
