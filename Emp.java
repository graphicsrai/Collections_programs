package collection;

import java.util.Objects;

public class Emp {
	private int id;
	private String Name;
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", Name=" + Name + "]";
	}
	
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
	
	public Emp(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	@Override
	public int hashCode() {
		return this.Name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Emp e=(Emp)obj;
		return this.Name.equals(e.getName());
	}
	
	
	
}
