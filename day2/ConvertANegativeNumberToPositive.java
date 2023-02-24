package week1.day2;

public class ConvertANegativeNumberToPositive {
public static void main(String args[]) {
	 int num = -40;
	 if(num<0) {
		 System.out.println("GIVEN NUMBER IS NEGATIVE");
		 }else {
			 System.out.println("GIVEN NUMBER IS POSITIVE");
		 }
	   num = num*-1;
	  System.out.println("GIVEN NUMBER CHANGED TO POSITIVE"+ ":"+ num);
}
}
