package Structure;

public class LinearSearch {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5};
		int src=5;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==src)
			{
				System.out.println("element is at " + i +"th position");
			}
		}
	}

}
