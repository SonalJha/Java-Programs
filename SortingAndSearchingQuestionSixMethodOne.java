import java.util.Scanner;

public class SixMethod1 {
	public static boolean Search(int[][] A, int item)
	{
		int i,j;
		i=0;
		j=A[0].length-1;
		while(i<A.length-1 && j>=0)
		{
			if(A[i][j]==item)
			{
				System.out.println("The element is found at row = "+(i+1)+" and column = "+(j+1));
				return true;
			}
			else if(A[i][j]>item)
			{
				j--;
			}
			else
				i++;
		}
		return false;
	}

	public static void main(String[] args)
	{
		int M,N,item;
		int i,j;
		Scanner in = new Scanner(System.in);
		M=in.nextInt();
		N=in.nextInt();
		int[][] A= new int[M][N];
		for(i=0;i<M;i++)
			for(j=0;j<N;j++)
				A[i][j]=in.nextInt();
		item=in.nextInt();
		boolean flag=Search(A,item);
		if(!flag)
			System.out.println("The requested item wasn't found!");

	}

}
