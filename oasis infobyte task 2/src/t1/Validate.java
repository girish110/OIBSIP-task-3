package t1;


import java.util.Scanner;

public class Validate {

	
		String UserId="girish";
		int UserPin=123456;
		
		public String getUserId() {
			return UserId;
		}
		public void setUserId(String userId) {
			UserId = userId;
		}
		public int getUserPin() {
			return UserPin;
		}
		public void setUserPin(int userPin) {
			UserPin = userPin;
		}
		
		public void Validate()
		{
			 String InputUserId;
			 int InputUserPin;
			 boolean quit=false;
			
			Scanner s1=new Scanner(System.in);
			System.out.println("enter UserId: ");
			InputUserId=s1.next();
			System.out.println("enter UserPin: ");
			InputUserPin=s1.nextInt();
			
			
			
		}
		
	}

