
/*
 * Lili wang
 * cdce146 
 * HW 05
 * 2022.3
 */
public class LinkedBST<T extends Comparable<T>>
{
	private class Node
	{
		Shape data;
		Node leftChild;
		Node rightChild;
		public Node(Shape aData)
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
	
	public void add(Shape aData)
	{
		if(root == null)
			root = new Node(aData);
		else
			add(root, aData);
	}
	private Node add(Node aNode, Shape aData)
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
	public boolean search(Shape aData)
	{
		return search(root, aData);
	}
	private boolean search(Node aNode, Shape aData)
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
	public void remove(Shape aData)
	{
		root = remove(root, aData);
	}
	private Node remove(Node aNode, Shape aData)
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
	// find Max
	 public double findMaxInTree()
	 {
	        Node temp = root;
	        while(temp.rightChild != null)
	            temp = temp.rightChild;
	        return temp.data.getArea();
	    }
	 
	 // delete greater than
	 public void deleteAreaGreaterThan(double aArea)
	 {
	        Node temp = root;
	        while(temp != null){
	            if(temp.data.getArea() > aArea)
	            {
	                remove(temp.data);
	                temp = root;
	            }
	            else
	                temp = temp.rightChild;
	        }

	    }
}
