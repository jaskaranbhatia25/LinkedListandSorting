public class Node
{
	private String data;
	private Node next;
	public Node()
    {
		this.data= null;
		this.next= null;
	}
	public Node (String data, Node next)
    {                          
		this.data = data;
		this.next= next;
	}
	public void setNext (Node next)
    {                                  
		this.next= next;
	}
	public Node getNext()
    {
		return this.next;
	}
	public String getData()
    {
		return this.data;
	}
}