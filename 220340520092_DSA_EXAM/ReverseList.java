class ReverseList{

	static Node head;
	
	static class Node{
			int data;
			Node next;
			
			Node(int d){
			data=d;
			next = null;
		}
		
	}
	/*
	void insertAtBeginning(int d){
		Node newnode = new Node(d);
		Node n = head;
		if(n == null)
		{
			newnode.next=head;
			head = newnode;
			
		}
	}
	void insertAtEnd(int d){
			Node newnode = new Node(d);
			Node n = head;
			while(n.next != null)
			{
				n= n.next;
			}
			n.next = newnode;
			newnode.next=null;
	}
		*/
		
	void display(Node n)
	{
		while(n!=null)
		{
			System.out.println(n.data+ " ");
			n=n.next;
		}
	}
	void display2(Node n)
	{
		while(n!=null)
		{
			System.out.print(n.data+ " ");
			n=n.next;
		}
	}
	
	
	Node reverse(Node rev)
	{
		Node prev = null;
		Node n = rev;
		Node next = null;
		
		while(n!= null)
		{
			next = n.next;
			n.next = prev;
			prev=n;n=next;
		}
		rev = prev;
		return rev;
	}
	
	
	public static void main(String args[])
	{
		ReverseList list = new ReverseList();
		list.head = new Node(1);
		list.head.next= new Node(5);
		list.head.next.next= new Node(1);
		list.head.next.next.next= new Node(2);
		list.head.next.next.next.next= new Node(3);
		list.head.next.next.next.next.next= new Node(4);
		list.head.next.next.next.next.next.next= new Node(5);
	
		//System.out.println();
		list.display(head);
		head = list.reverse(head);
		list.display2(head);
	}
	
}