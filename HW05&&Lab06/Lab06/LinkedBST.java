
/*
 * Lili wang
 * cdce146
 * 2022.3
 */
public class LinkedBST<T extends Comparable<T>>
{
	private class Node
	{
		T data;
		Node leftChild;
		Node rightChild;
		public Node(T aData)
		{
			data = aData;
			leftChild = rightChild = null;
			
		}
	}
	
	private Node root; //head
	public LinkedBST()
	{
		root = null;
	}
	
	public void add(T aData)
	{
		if(root == null)
			root = new Node(aData);
		else
			add(root, aData);
	}
	private Node add(Node aNode, T aData)
	{
		if(aNode == null)
			aNode = new Node(aData);
		else if(aData.compareTo(aNode.data) < 0) // go left
			aNode.leftChild = add(aNode.leftChild, aData);
		else if(aData.compareTo(aNode.data) > 0) // go right
			aNode.rightChild = add(aNode.rightChild, aData);
		return aNode;
	}
	
	// print pre order
	public void printPreorder()
	{
		printPreorder(root);
	}
	private void printPreorder(Node aNode)
	{
		if(aNode == null)
			return;
		System.out.println(aNode.data); // process
		printPreorder(aNode.leftChild); // left
		printPreorder(aNode.rightChild); 
	}
	
	// print in order
	public void printInorder()
	{
		printInorder(root);
	}
	private void printInorder(Node aNode)
	{
		if(aNode == null)
			return;
		
		printInorder(aNode.leftChild); // left
		System.out.println(aNode.data); // process
		printInorder(aNode.rightChild); // right
	}
	
	// print post order
	public void printPostorder()
	{
		printPostorder(root);
	}
	private void printPostorder(Node aNode)
	{
		if(aNode == null)
			return;
		
		printPostorder(aNode.leftChild); // left
		
		printPostorder(aNode.rightChild); // right
		
		System.out.println(aNode.data); // process
	}
	
	// search data
	public boolean search(T aData)
	{
		return search(root, aData);
	}
	private boolean search(Node aNode, T aData)
	{
		if(aNode == null)
			return false;
		else if(aData.compareTo(aNode.data) < 0) // go left
			return search(aNode.leftChild, aData);
		else if(aData.compareTo(aNode.data) > 0)
			return search(aNode.rightChild, aData); // go right
		else return true;	
	}
	// remove data
	public void remove(T aData)
	{
		root = remove(root, aData);
	}
	private Node remove(Node aNode, T aData)
	{
		// find the node
		if(aNode == null )
			return null;
		else if(aData.compareTo(aNode.data) <0)
			aNode.leftChild = remove(aNode.leftChild, aData);
		else if(aData.compareTo(aNode.data) >0)
			aNode.rightChild = remove(aNode.rightChild, aData);
		else // found it !
		{
			if(aNode.rightChild == null)
				return aNode.leftChild;
			else if(aNode.leftChild == null)  // one children
				return aNode.rightChild;
			// to do find smallest
			Node temp = findMinInTree(aNode.rightChild);
			aNode.data = temp.data;
			aNode.rightChild = remove(aNode.rightChild, temp.data);
			
		}
		return aNode;
	}
	private Node findMinInTree(Node aNode)
	{
		if(aNode == null)
			return null;
		else if(aNode.leftChild == null)
			return aNode;
		else
			return findMinInTree(aNode.leftChild);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
