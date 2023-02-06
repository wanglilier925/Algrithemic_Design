
/*
 * Lili Wang
 * 2022 spring 
 * csce 146
 */
public class LLQueue<T> implements QueueI<T>
{
	private class ListNode{
		T data;
		ListNode link;
	
	public ListNode(T aData, ListNode aLink)
	{
		data = aData;
		link = aLink;
	}
	}
	
	private ListNode head;
	private ListNode tail;
	private int size;
	
	public LLQueue()
	{
		head=tail=null;
	}
	
	
	// class:Enqueue: This method returns nothing and takes in some generic
	//       data that is added to the end of the queue.
	public void enqueue(T aData)
	{
		ListNode newNode = new ListNode(aData, null);
				
			if(head==null)
			{
				head = tail = newNode;
				this.size=1;
				return;
			}
			tail.link = newNode;
			tail = tail.link;
			this.size++;
				
	}
	
	//Dequeue: This method removes and returns the first element’s data of 
	//the queue as long as the head is not null.
	public T dequeue()
	{
		if(head == null)
			return null;
		T ret = head.data;
		head = head.link;
		this.size--;
		return ret;
	}
	//Peek: Returns the first element’s data but doesn’t remove the element.
	
	public T peek()
	{
		if(head == null)
			return null;
		return head.data;
	}
	//Print: Prints out the entire queue.
	public void print()

	{
		for(ListNode temp = head; temp!= null; temp = temp.link)
		System.out.println(temp.data);
	}
	public int size(){
        return this.size;
    }
}
