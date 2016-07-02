import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.LinkedList;

class ComparatorModified implements Comparator<String>
{
	public String SortChar(String s)
	{
		char[] content= s.toCharArray();
		Arrays.sort(content);
		return new String(content);	
	}

	public int compare(String s1, String s2)
	{
		return SortChar(s1).compareTo(SortChar(s2));
	}
	
}


public class Two 
{
	public static String SortChar(String s)
	{
		char[] content= s.toCharArray();
		Arrays.sort(content);
		return new String(content);	
	}
	public static void sort(String[] str)
	{
		Hashtable<String, LinkedList<String>> hash= new Hashtable<String,LinkedList<String>>();
		for(String s:str)
		{
			String key= SortChar(s);
			if(!hash.containsKey(key))
			{
				hash.put(key, new LinkedList<String>());
			}
			LinkedList<String> content= hash.get(key);
			content.add(s);
		}
		int index=0;
		for(String key:hash.keySet())
		{
			LinkedList<String> content= hash.get(key);
			for(String s:content)
			{
				str[index++]=s;
			}
		}
	}

	public static void main(String[] args)
	{
		//using method 1
		int i;
		String[] str=  {"acer","ot", "bca","race", "cba","care","abc","to"};
		Arrays.sort(str,new ComparatorModified());
		for(i=0;i<str.length;i++)
		System.out.print(str[i]+" ");
		System.out.println();
		
		//using method 2
		String[] str2=  {"acer","ot", "bca","race", "cba","care","abc","to"};
		sort(str2);
		for(i=0;i<str2.length;i++)
		System.out.print(str2[i]+" ");

	}

}
