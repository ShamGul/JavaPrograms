
public class SortAnArrayWithoutInbuiltFunc {

	public static void main(String[] args) {
		int a[]= {2,8,6,9,4,5,7,3,1};
		int t;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Sorted array is ");
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(" "+a[i]);
		}
		}
	}


