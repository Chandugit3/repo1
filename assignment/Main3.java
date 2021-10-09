package assignment;
import java.util.*;


class BookStore
{
	String title;
	String price;
	int year;
	String authorName;
	
	public void set(String authorName,String title,String price,int year)
	{
		this.authorName=authorName;
		this.title=title;
		this.price=price;
		this.year=year;
	}
	public void get()
	{
		
		System.out.println(authorName);
		System.out.println(title);
		System.out.println(price);
		System.out.println(year);
		System.out.println();
	}
	
	
}
public class Main3
{

	public static void main(String[] args)
	{
		System.out.println();
		BookStore b=new BookStore();
		b.set("Daniel Defoe","Robinson Crusoe","$15.50",1719);
		b.get();
		b.set("Joseph Conrad","Heart of Darkness","$12.80", 1902);
		b.get();
		b.set("Pat Conroy","Beach Music","$9.50",1996);
		b.get();
		
		

	}

}
