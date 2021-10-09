package package5;

import java.util.Scanner;



class Car
{
	private String licenceNumber;
	private String model;
	private double currentMileage;
	private int engineSize;
	
	public String getLicenceNumber() {
		return licenceNumber;
	}
	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getCurrentMileage() {
		return currentMileage;
	}
	public void setCurrentMileage(double currentMileage) {
		this.currentMileage = currentMileage;
	}
	public int getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
}

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int size=sc.nextInt();
		Car[] c=new Car[size];

		
		
		instantiateAll(c);
		setAll(c);
		sortCarList(c);
	
	}
	public static  void instantiateAll(Car[] c)
	{
		for(int i=0;i<c.length;i++)
		{
			c[i]=new Car();
		}
	}
	
	public static void setAll(Car[] c)
	{
		Scanner sc=new Scanner(System.in);
		String licenceNumber;
		String model;
		int currentMileage;
		int engineSize;
		for(int i=0;i<c.length;i++)
		{
			licenceNumber=sc.next();
			model=sc.next();
			currentMileage=sc.nextInt();
			engineSize=sc.nextInt();
			c[i].setLicenceNumber(licenceNumber);
			c[i].setModel(model);
			c[i].setCurrentMileage(currentMileage);
			c[i].setEngineSize(engineSize);
			
		}
		
	}
	public static void sortCarList(Car c[])
	{
		Car temp=new Car();
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length-1-i;j++)
			{
				if(c[j].getModel().compareTo(c[j+1].getModel())>0)
				{
					temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println("Model name:"+c[i].getModel()+"\n"+
					"Licence number:"+c[i].getLicenceNumber()+"\n"+
			           "current milege:"+c[i].getCurrentMileage()+"\n"+
			           "engine size:"+c[i].getEngineSize()+"\n \n"
					);
			
		}
		
	}
	

}
