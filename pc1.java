

interface Addition 
{
	public abstract void add(int a,int b);
}
class AdditionImpl implements Addition
{
	public void add(int f,int g)
	{
		int result=f+g;
		System.out.println(result);
	}
}

public class pc1 {

	public static void main(String[] args) {
	
		Addition a=new AdditionImpl();
		a.add(4,5);
	}

}
