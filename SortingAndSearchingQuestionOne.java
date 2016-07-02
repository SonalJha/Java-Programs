import java.util.Scanner;

public class One {
	public static void Merge(int[] A, int[] B, int sizeA, int sizeB)
	{
		int indexAB,indexA,indexB;
		indexA= sizeA-1;
		indexB= sizeB-1;
		indexAB= sizeA+sizeB-1;
		while(indexA>=0 && indexB>=0)
		{
			if(A[indexA]>B[indexB])
			{
				A[indexAB]=A[indexA];
				indexA--;
				indexAB--;
			}
			else
			{
				A[indexAB]=B[indexB];
				indexB--;
				indexAB--;
			}
		}
		// if there is anything left in B copy it to A
		while(indexB>=0)
		{
			A[indexAB]=B[indexB];
			indexB--;
			indexAB--;
		}
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int sizeA, sizeB;
		int i;
		sizeA=in.nextInt();
		sizeB=in.nextInt();
		int[] A= new int[sizeA+sizeB];
		int[] B= new int[sizeB];
		for(i=0;i<sizeA;i++)
			A[i]=in.nextInt();
		for(i=0;i<sizeB;i++)
			B[i]=in.nextInt();
		Merge(A,B,sizeA,sizeB);
		for(i=0;i<sizeA+sizeB;i++)
			System.out.print(A[i]+ " ");
	}

}
