

package Structure;

import java.util.Scanner;

class Customer {
	String Name;
	String MobileNo;
	double feedbackRating;
	Customer(){
		System.out.println("This is constructor");
	}
	Customer(String Name, String MobileNo, double feedbackRating){
		this.Name=Name;
		this.MobileNo=MobileNo;
		this.feedbackRating=feedbackRating;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public double getFeedbackRating() {
		return feedbackRating;
	}
	public void setFeedbackRating(double feedbackRating) {
		this.feedbackRating = feedbackRating;
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		Customer c[]=new Customer[a];
		for(int i=0;i<c.length;i++) {
			String n=s.next();
			String m=s.next();
			double r=s.nextDouble();
			c[i]=new Customer(n,m,r);
		}
		for(int i=0;i<c.length;i++) {
			System.out.printf("Customer "+(i+1)+" : "+c[i].getFeedbackRating()+" out of 5 \n");
			System.out.println("Customer "+(i+1)+" : "+c[i].getName());
			System.out.println("Customer "+(i+1)+" : "+c[i].getMobileNo());
		}
		
		
	}

}

	
		
