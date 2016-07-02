
public class Five {
	public static int BinarySearchModified(String[] str, String s,int left, int right)
	{
		//System.out.println("left= "+left+ " right= "+right);
		if(left>=right)
			return -1;
		int mid= (left+right)/2;
		int first,last;
		if(str[mid].isEmpty())
		{
			first= mid-1;
			last=mid+1;
			while(first>=left && last<=right)
			{
				//System.out.println("first= "+first+ "last= "+last);
				if(!str[first].isEmpty())
				{
					mid=first;
					break;
				}
				if(!str[last].isEmpty())
				{
					mid=last;
					break;
				}
				first--;
				last++;
					
			}
			
		}
		//System.out.println("mid= "+mid);
		//System.out.println("midString= "+str[mid]);
		if(str[mid].equals(s))
			return mid;
		else if(s.compareTo(str[mid])<0)
			return BinarySearchModified(str,s,left,mid);
		else
			return BinarySearchModified(str,s,mid+1,right);
			
	}

	public static void main(String[] args)
	{
		String[] str= {"at","","","","ball","","","car","","","dad","",""};		
		int index=BinarySearchModified(str,"ball",0,str.length-1);
		if(index!=-1)
			System.out.println("The given string is present at index "+index);
		else
			System.out.println("The given string is not present");
	}

}
