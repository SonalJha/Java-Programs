import java.util.Scanner;
public class Three {
	public static int FindRotationPoint(int A[],int left,int right)
	{
		if(left>right)
			return -1;
		int mid=(left+right)/2;
		if(A[mid]>A[mid+1])
			return mid;
		//if the left half is sorted search the right half
		if(A[left]<=A[mid])
			return FindRotationPoint(A,mid+1,right);
		else //else search the left half
			return FindRotationPoint(A,left,mid);
	}
	
	public static int BinarySearch(int[] A, int left,int right,int x)
	{
		int mid=(left+right)/2;
		if(x==A[mid])
			return mid;
		if(left>=right)
			return -1;
			if(A[mid]>x)
			return BinarySearch(A,left,mid,x);
		else
			return BinarySearch(A,mid+1,right,x);
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int size,i,j,index,x;
		size=in.nextInt();
		int[] A= new int[size];
		for(i=0;i<size;i++)
			A[i]=in.nextInt();
		x=in.nextInt();
			j=FindRotationPoint(A,0,size-1);
		//	System.out.println(j+" "+A[j]);
			// Now that we know the rotation point we can search for the element using binary search
			// in both the arrays
			index=BinarySearch(A,0,j,x);
			if(index==-1)
				index= BinarySearch(A,j+1,size-1,x);
			if(index!=-1)
			System.out.println("The element is found! It is at index = "+index);
			else
				System.out.println("The element is not found in the array");

	}

}
