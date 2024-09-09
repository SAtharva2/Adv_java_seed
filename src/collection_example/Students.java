package collection_example;

public class Students implements Comparable{
      int rollno;
      String name;
      double marks;
      
      public Students()
      {
    	  rollno=20;
    	  name="Sagar";
    	  marks=85;
      }
      public Students(int rno,String nm,double m)
      {
    	  rollno=rno;
    	  name=nm;
    	  marks=m;
      }
      
      public String toString()
      {
    	  return rollno+" "+name+" "+marks;
      }
	@Override
	public int compareTo(Object o) {
		
		Students s=(Students)o;
		
		if(this.rollno>s.rollno)
		       return 1;
		else if(this.rollno<s.rollno)
			return -1;
		else
			return 0;
	}
     
}
