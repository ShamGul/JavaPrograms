import java.util.HashSet;

public class DeleteDuplicateElemFromArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,1,3,6,7,8,2,9,0,0};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
      for(int no:hs)
      {
    	  System.out.print("  "+no);
      }
	
	
	
	
	// wrong code 
		//OR for sorted array
/*	int a1[]= {1,1,2,2,3,4,5,5};

	int j=0;
	for(int i=0;i<a1.length;i++) {
		if(a1[i]!=a1[j]) {
			a1[j]=a1[i];
			j++;
			System.out.println(a1[j]);
		}
		}
		a1[j]=a1[a1.length-1];
		for(int i=0;i<j-1;i++) {
			System.out.print("  "+a1[i]);
		}
	*/}
}

