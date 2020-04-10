import java.util.Scanner;


public class Use {
	
	//this approach for taking input is not good so we will make beter take input function
	
	
	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot,int parent ,boolean isleft)
	{
		
		Scanner sc = new Scanner(System.in);
		
		if(isRoot)
		{
			System.out.println("Enter the root Data");
			
		}
		else
		{
			if(isleft)
			{
				System.out.println("Enter the left of" + parent);
			}
			else
			{
				System.out.println("Enter the right of" + parent);
			}
		}
		
		
		
		int rootData = sc.nextInt();
		
		if(rootData == -1)
		{
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		
		BinaryTreeNode<Integer> left = takeInputBetter(false,rootData,true);
		
		BinaryTreeNode<Integer> right = takeInputBetter(false,rootData,false);
		
		
		root.left =left;
		root.right = right;
		
		return root;
	}
	
	//Now we will make a function to take input
	
	public static BinaryTreeNode<Integer> takeInput()
	{
		System.out.println("Enter the root Data");
		Scanner sc = new Scanner(System.in);
		
		
		int rootData = sc.nextInt();
		
		if(rootData == -1)
		{
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		
		BinaryTreeNode<Integer> left = takeInput();
		
		BinaryTreeNode<Integer> right = takeInput();
		
		
		root.left =left;
		root.right = right;
		
		return root;
	}
	
	
	//now we will make a function for better print
	
	public static void printBetter(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		
		System.out.print(root.data + ":");
		
		if(root.left != null)
		{
			System.out.print("L" + root.left.data);
		}
		if(root.right != null)
		{
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		
		printBetter(root.left);
		printBetter(root.right);
	}
	
	//another
	
	public static void print(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		
		System.out.println(root.data);
		
		print(root.left);
		print(root.right);
	}

	public static void main(String[] args) {
		
		BinaryTreeNode<Integer> root = takeInputBetter(true,0,true);
		
		
		printBetter(root);
		
		
		

	}

}
