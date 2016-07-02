import java.util.Scanner;

public class MazeRabbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		String s;
		Scanner in = new Scanner(System.in);
		s= in.nextLine();
		n= Integer.parseInt(s);
		//n= in.nextInt();
		char[][] A = new char[n][n];
		int[][] B= new int[n][n];
		for(i=0;i<n;i++){
			s= in.nextLine();
			//System.out.println(s+" i= "+i);
			A[i]= s.toCharArray();
		}
		int output= findPath(A,B,n,0,0);
		if(output==-1)
			System.out.println("Invalid");
		else
		System.out.println(output);
	}

	/**
	 * Using recursion and dynamic programming
	 * @param A
	 * @param B
	 * @param n
	 * @param i
	 * @param j
	 * @return
	 */
	private static int findPath(char[][] A,int[][] B, int n, int i, int j) {
		// TODO Auto-generated method stub
		if(i==n ||j==n)
			return 0;
		if(A[i][j]!='-'&& A[i][j]!='#'&& A[i][j]!='$')
		{
			B[i][j]=-1;
			return -1;
		}
		if(A[i][j]=='#')
		{
			B[i][j]=0;
			return 0;
		}
		if(i==n-1 && j==n-1)
		{
			B[i][j]=1;
			return 1;
		}
		
		if(B[i][j]!=0)
			return B[i][j];
		
		int subProblem1= findPath(A,B,n,i,j+1);
		int subProblem2= findPath(A,B,n,i+1,j);
		if(subProblem1==-1 || subProblem2==-1)
		{
			B[i][j]=-1;
			return -1;
		}
		
		B[i][j]=subProblem1+subProblem2;
		return B[i][j];
	}
	

}
