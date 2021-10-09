package Structure;

class Queue
{
	int queue[]=new int[5];
	int size,front,rear;
	public void enQueue(int data)
	{
		queue[rear]=data;
		rear=rear+1;
		size=size+1;
	}
	public void show()
	{
		System.out.print("Elements  : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(queue[i]+" ");
		}
	}	
}

public class QueueDemo
{
	public static void main(String[] args) 
	{
		Queue q=new Queue();
		q.enQueue(5);
		q.enQueue(7);
		q.enQueue(9);
		q.enQueue(4);
		q.show();
	
	}

}
