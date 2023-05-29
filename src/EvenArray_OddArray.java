
public class EvenArray_OddArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int counteven=0;
		int countodd=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0)
			counteven++;
		else
			countodd++;
	}
	System.out.println("Even count "+counteven);
	System.out.println("Odd count "+countodd);
	
	int Odd_Arr[]=new int[countodd];
	int Even_Arr[]=new int[counteven];
	int Odd_Index=0;
	int Even_Index=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0)
		{	
			Even_Arr[Even_Index]=a[i];
	        Even_Index++;
	        }
		else {
			Odd_Arr[Odd_Index]=a[i];
			Odd_Index++;
		}
	}
	System.out.println("Even Array");
	for(int i=0;i<Even_Arr.length;i++) {
		System.out.print("  "+Even_Arr[i]);
	}
	System.out.println("  ");
	System.out.println("Odd Array");
	for(int i=0;i<Odd_Arr.length;i++) {
		System.out.print("  "+Odd_Arr[i]);
	}
	}
}