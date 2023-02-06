/* Lili Wang*/
public class LLStack<T> implements StackI<T>{
	// construct  a data and a linkNode
	private class ListNode
	{
		T data;
		ListNode link;
		
		// construct
		public ListNode(T aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	
	private ListNode head;
	private int size;
	public LLStack()
	{
		head = null;
		this.size = 0;
	}
	
	// push
	public void push(T aData)
	{
		ListNode newNode = new ListNode(aData, head);	
		  head = newNode;
		  this.size++;
		 
		
	}
	 // pop 
	public T pop()
	{
		if(head == null)
			return null;
		T ret = head.data;
		head = head.link;
		this.size--;
		return ret;
		
	}
	
	// peek
	public T peek()
	{
		if(head == null)
			return null;
		return head.data;
	}
	
	// print
	public void print()
	{
		for(ListNode temp = head; temp!=null; temp=temp.link)
			System.out.println(temp.data);
	}
	
	// return size
	
	public int size()
	{
		return this.size;
	}
	
	
	

}
