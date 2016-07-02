import java.util.Scanner;
public class Six {
	
	public static boolean Search(int x,int y, int[][] A, int item)
	{
		int i=0,j=0;
		while(i<=x && j<=y)
		{
			if(A[i][j]==item)
			{
				System.out.println("The item "+item+ " is found at row = "+(i+1)+" and column = "+(j+1));
				return true;
			}
			else if(A[i][j]<item)
			{
				i++;
				j++;
			}
			else
			{
				 return (SearchRow(A,i,x,j-1,item) ||SearchCol(A,j,y,i-1,item));
			}
		}
		return false;
	}

	private static boolean SearchRow(int[][] A, int first, int last,int col,int item) {
		while(first<=last)
		{
			if(A[first][col]==item)
			{
				System.out.println("The item "+item+ " is found at row = "+(first+1)+" and column = "+(col+1));
				return true;
			}
			else if(A[first][col]>item)
				return false;
			
			first++;
		}
		return false;
	}

	private static boolean SearchCol(int[][] A, int first, int last,int row,int item)
	{
		while(first<=last)
		{
			if(A[row][first]==item)
			{
				System.out.println("The item "+item+ " is found at row = "+(row+1)+" and column = "+(first+1));
				return true;
			}
			else if(A[row][first]>item)
				return false;
			first++;
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
		boolean flag=Search(M-1,N-1,A,item);
		if(!flag)
			System.out.println("The requested item wasn't found!");
	}

}
