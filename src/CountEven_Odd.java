
public class CountEven_Odd {

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
	}

}
