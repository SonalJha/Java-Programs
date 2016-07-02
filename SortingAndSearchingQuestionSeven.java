import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

 class htwt implements Comparator<htwt>
{
	int height;
	int weight;
	public int compare(htwt o1, htwt o2) {
		// TODO Auto-generated method stub
		return o1.height-o2.height;
	}
}

public class Seven
{
	public static void FindLongestSubsequence(ArrayList<htwt> abc)
	{
		int i,j;
		int max=0, temp=0,end=0,tempend=0;
		for(i=0;i<abc.size();i++)
		{
			for(j=0;j<=i;j++)
			{
				if(abc.get(j).weight<abc.get(i).weight)
				{
					temp++;	
					tempend=i;
				}
			}
			if(temp>max)
			{
				max=temp;
				end=tempend;
				temp=0;
			}
			
		}
		System.out.println("The longest subsequence is "+(max+1));
		// Trying to print the subsequence as well
		for(i=0;i<=end;i++)
		{
			if(abc.get(i).weight<=abc.get(end).weight)
			{
				System.out.println(abc.get(i).height+" "+abc.get(i).weight);
			}
		}
		
	}
	public static void Sort(ArrayList<htwt> abc)
	{
		Collections.sort(abc, new htwt());
//		int i;
//		for(i=0;i<abc.size();i++)
//			System.out.println(abc.get(i).height+" "+abc.get(i).weight);
		FindLongestSubsequence(abc);

		
	}

	public static void main(String[] args)
	{
		ArrayList<htwt> abc= new ArrayList<htwt>();
		Scanner in= new Scanner(System.in);
		int i,count;
		count=in.nextInt();
		htwt input;
		for(i=0;i<count;i++)
		{
			input= new htwt();
			input.height=in.nextInt();
			input.weight=in.nextInt();
			abc.add(input);
		}
//		for(i=0;i<abc.size();i++)
//		System.out.println(abc.get(i).height+" "+abc.get(i).weight);
		Sort(abc);

	}

}
