package Structure;


class Stack
{
	int[] stack=new int[3];int top=0;
	public void push(int data)
	{
		stack[top]=data;
		top++;
		
	}
	public int pop()
	{
		int data;
		top--;
	    data=stack[top];
	    stack[top]=0;
	    return data;
	}
	public int peek()
	{
		int data;
		data=stack[top-1];
		return data;
	}
	public void show()
	{
		for(int i:stack)
		{
			System.out.print(i+" ");
		}
	}
	
	
}
public class StackDemo 
{
	public static void main(String[] args)
	{
	   Stack s=new Stack();
	   s.push(21);
	   s.push(25);
	   s.push(65);
	
	   s.show();
	   System.out.println();
	   System.out.println(s.pop());
	   System.out.println(s.peek());

	}

}
