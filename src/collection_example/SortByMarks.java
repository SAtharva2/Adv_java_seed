package collection_example;

import java.util.Comparator;

public class SortByMarks implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Students s1=(Students)o1;
		Students s2=(Students)o2;
		
		if(s1.marks>s2.marks)
			return 1;
		else if(s1.marks<s2.marks)
			return -1;
		else
		   return 0;
	}
    
}
