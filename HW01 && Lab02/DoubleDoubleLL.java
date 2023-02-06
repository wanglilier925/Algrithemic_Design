/*
 * Lili Wang
 * 2022.2.1
 */
public class DoubleDoubleLL {
/*
	Create Doubly Linked List Node. (10pts)
	An internal class must be used to represent a Node in the linked list.
	This node must contain both data and two links.	
*/	
	// 双向链表“节点”对应的结构体
	private class ListNode
	{
		private double data;
		private ListNode next; // next node
		private ListNode prev;  // previous node
		
		// constructor
		public ListNode(double aData, ListNode aPrev, ListNode aNext)
		{
			data = aData;
			next = aNext;
			prev = aPrev;
			
		}
	}
	
	private ListNode head;//first element
	private ListNode current;// current node of interest
	private ListNode previous;//one node behind current
	
	
	public DoubleDoubleLL()
	{
		head=current=previous=null;
	}
	
	//Create methods gotoNext, gotoPrev, reset, gotoEnd, and hasMore. (10pts)
	//The method “gotoNext” must move the current reference forward
	//by one node. If the current reference is null, then the method does nothing.
	public void gotoNext()
	{
		if(current != null)
		{
			//previous = current;
		    current = current.next;
		   // current.prev = previous;
		}
		
		else return;
	}
		
	//The method “gotoPrev” must move the current reference backwards by one node.
	//If the current reference is null, then the method does nothing.
	
	public void gotoPrev()
	{
		if(current != null)
		{
			// current =previous;
		    current= current.prev;
		}
		if(current == null)
			return;
	}
	
	//The method “reset”, must move the current reference to the
	//head reference.
	
	public void reset()
	{
		current = head;
		previous =null;
	}
//The method “gotoEnd”, must move the current reference to the 
	//last node in the list.
	public void gotoEnd()
	{
		ListNode temp =head;
		while(temp!= null && temp.next != null)
		{temp = temp.next;}
		current = temp;
	}
	
//The method “hasMore”, must return true if the current reference 
	//is not null or false if it is.
	public boolean hasMore()
	{
		return current !=null;
	}
	
	//The method “getCurrent” must return the data at the current reference.
	//If the current reference is null, then it must return null.
		
	 public double getCurrent()
	 {
		 if(current == null)
			 return 0.0;
		 return current.data;
	 }
	 
	//The method “setCurrent” must modify the data at the current reference given new data. 
		//If the current reference is null, then it must do nothing.
	 public void setCurrent(double aData)
	 {
		 if(current == null)
			 return;
		 else current.data= aData;
	 }
	
	// The method “add”, must create a new node with data provided via a parameter and 
	 //add it to the end of the list. If the head reference is null, then it adds the new 
	 //node to the start of the list.
	
	public void add(double aData)
	{
		ListNode newNode = new ListNode(aData, null, null);
		if (head == null)
		{
			head = current = newNode;
			return;
		}
		
		ListNode temp = head;
		while(temp.next != null && temp!=null)
			temp=temp.next;
			temp.next = newNode;
			newNode.prev=temp;
		
				
	}
	// The method “addAfterCurrent”, must create a new node with the data provided via a 
	//parameter and add it after the current reference.
	//If the current reference is null, 
	//then do not add the data to the list. See images below for the concept.
	// All methods must have the public scope and their identifiers must match exactly what 
	//is defined above.
	public void addAfterCurrent(double aData)
	{
		if (current == null)
		{
			return;
		}
		ListNode newNode = new ListNode(aData, current.next, current.prev);
		current.next.prev=newNode;
		current.next = newNode;
		
	}
	
	
	//The method “remove”, must search for data provided via a parameter, and remove the node
	//if it is found.
	
	
	public void remove(double aData)
	{
		ListNode temp =head;
		
		while(temp!=null)
		{
	if(temp.data == aData)
	{
		temp.prev.next = temp.next;
	
	if(temp.next != null)
	{
		temp.next.prev = temp.prev;
	}
	break;
		}
	temp =temp.next;
}
	
	}
	
	//The method “removeCurrent”, must remove the node that is at the current reference. 
	//If the current reference is null, then this method does nothing. See images below for 
	//the concept.
	public void removeCurrent()
	{
		if(current == null)
		{
			return;
		}
		
		if(current.next != null)
		{
			current.next.prev =current.prev;
			current = current.next;
		}
		
		else if(current != null && previous == null)
		{
			head = head.next;
			current = head;
		}
	}
	
	
	//This method must print all the data in the linked list to the console.
	
	public void print()
	{
		ListNode temp = head;
		while(temp!= null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	//Create the method contains.
	//This method returns true only if data provided via a parameter is contained 
	//in the list, and otherwise it returns false.
	
	
	public boolean contains(double aData)
	{
		for(ListNode temp = head; temp != null; temp = temp.next)
		
			if(temp.data == aData)
			return true;
			return false;
		
	}
	
	
}
