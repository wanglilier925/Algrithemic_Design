/*
 * Lili Wang
 */

//Create an interface and name it exactly StackI with the following parts.
public interface StackI<T> {
	// push
	public void push(T aData);
	// pop
	public T pop();
	//peek
	public T peek();
	//print
	public void print();
	
	// size
	public int size();
	
	

}
