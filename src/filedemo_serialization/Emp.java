package filedemo_serialization;

import java.io.Serializable;

public class Emp implements Serializable {
     
	int id;
	String name;
      int salary;
	
	static int count=10; // not serialized
	
	Emp()
	{
		id=1;
		name="Soham";
		salary=9000;
	}
	public Emp(int id,String name,int salary) {

		this.id=id;
		this.name=name;		
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
} 
