package filedemo_serialization;

public class Manager extends Emp{

int bonus;
	
	public Manager() {
		
		super();
	
	}
	public Manager(int id,String name,int salary,int bonus) 
	{
		super(id,name,salary);
		this.bonus=bonus;
	}
	@Override
	public String toString() {
		return "manager [bonus=" + bonus + "]"+super.toString();
	}
	
}
