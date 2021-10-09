package Structure;
import java.util.*;

class Node
{
	int data;
	Node next;
	
}
class LinkedList
{
	Node head;
	public void insert(int data)
	{
		Node node=new Node();
		node.data=data;
		
		if(head==null)
		{
			head=node;
			
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
		
	}
	public void display()
	{
		Node node=head;
		while(node.next!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println(node.data);
	}
}
public class LinkedDemo 
{

	public static void main(String[] args) 
	{
	
		LinkedList list=new LinkedList();
		list.insert(12);
		list.insert(45);
		list.insert(32);
		list.insert(51);
		list.insert(34);
		
		list.display();
	}

}
