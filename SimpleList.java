
public class SimpleList
{
    private Node head = new Node(null,null);

    public void sortedInsert (String data)
    {
	    Node current = head.getNext();
	    Node newNode= new Node (data, null);
	    if(head.getNext()== null || head.getNext ().getData().compareTo(newNode.getData()) >= 0)
        {
		    newNode.setNext(head.getNext());
		    head.setNext (newNode);
		}
	    else
        {
		    while(current.getNext() != null && current.getNext() .getData().compareTo(newNode.getData())<0)
            {
		        current=current.getNext();
	        }
		    newNode.setNext (current.getNext()) ;
		    current. setNext (newNode);
	    }
	}
    public void pushBack(String data)
    {
        Node newNode = new Node (data, null);
        if(head.getNext() == null)
        {
	        head.setNext (newNode) ;
	    }
        else
        {
           for(Node temp = head; temp.getNext() != null; temp = temp.getNext())
           {
                if(temp.getNext() == null)
                {
	                temp.setNext(newNode);
	            }
	        }
        }
    }
    public String toString()
    {
	    StringBuilder newString = new StringBuilder();
	    for(Node temp= head.getNext(); temp != null; temp=temp.getNext())
        {
	        if(temp.getNext()== null)
            {
		        newString.append(temp.getData());
	        }
	        else
            {
		        newString.append(temp.getData() + " ");
	        }
	    }
	    return newString.toString();
    }
    public Node getHeadPtr()
    {
	    return this.head.getNext();
	}
}