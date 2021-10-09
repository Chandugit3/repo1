package asignment3;

import java.util.*;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the password:");
        int length = sc.nextInt();
        System.out.println(password(length));
       
    }
  
    static char[] password(int len)
    {
        System.out.println("Generating random password... ");
        System.out.print("Your new password is : ");
       
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";
  
  
        String values = Capital_chars + Small_chars +numbers + symbols;
  
        
        Random r = new Random();
  
        char[] password = new char[len];
  
        for (int i = 0; i < len; i++)
        {
            
            password[i] =values.charAt(r.nextInt(values.length()));
  
        }
        return password;

	}

}
