
public class ShiftAllZeroesToEnd {

	public static void main(String[] args) {
		int a[]= {0,1,4,0,8,9,0,5,0,0,6};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[count++]=a[i];
			}
		}
		while(count<a.length) {			
			a[count++]=0;			
		}
		 System.out.println("Elements of array after moving all the zeros to the end of array: ");
	      for (int i = 0; i < a.length; i++)
	      System.out.print(a[i] + " ");
		
	}

}
