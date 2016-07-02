import java.util.ArrayList;
import java.util.Scanner;
class Node
{
	int data;
	Node left,right;
	public Node(int val)
	{
		data=val;
		left=right=null;
	}
	public void Display()
	{
		System.out.print(data+ " ");
	}
}

class BST
{
	private Node root;
	public BST()
	{
		root=null;
	}
	public void Insert(int val)
	{
		root=Insert(root,val);
	}
	public Node Insert(Node root,int val)
	{
		if(root==null)
		{
			Node newNode= new Node(val);
			root=newNode;
			return root;
		}
		if(root.data>val)
			root.left=Insert(root.left,val);
		else
			root.right=Insert(root.right,val);
		return root;
	}
	public int SearchAndPreOrderTraverse(int val)
	{
		ArrayList<Integer> countarray= new ArrayList<Integer>();
		 boolean flag= SearchAndPreOrderTraverse(root,val,countarray);
		 if(flag)
			 return countarray.size();
		 else
			 return -1;
	}
	public boolean SearchAndPreOrderTraverse(Node root,int val, ArrayList<Integer> countarray)
	{
		if(root==null)
			return false;
		//root.Display();
		boolean flag= SearchAndPreOrderTraverse(root.left,val,countarray);
		if(flag)
			return flag;
		if(root.data==val)
			return true;
		countarray.add(root.data);
		flag=SearchAndPreOrderTraverse(root.right,val,countarray);
		if(flag)
			return flag;
		return false;	
	}
	public void InOrderTraversal()
	{
		Display(root);
		System.out.println();
	}
	public void Display(Node root)
	{
		if(root!=null)
		{
			Display(root.left);
			root.Display();
			Display(root.right);
		}
	}
}
public class Eight {

	public static void main(String[] args)
	{
		BST obj= new BST();
		Scanner in= new Scanner(System.in);
		int size= in.nextInt();
		int i,item;
		for(i=0;i<size;i++)
			obj.Insert(in.nextInt());
		//obj.InOrderTraversal();
		item= in.nextInt();
		i=obj.SearchAndPreOrderTraverse(item);
		System.out.println("The rank of the element is "+i);
	}

}
