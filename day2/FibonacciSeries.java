package week1.day2;

public class FibonacciSeries {
	   int range = 8;
	public static void main(String[] args) {
		int firstNum=0;
		int secNum=1;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i=0;i<6;i++) {
	    int thirdNum = firstNum +secNum ;
		System.out.println(thirdNum);
		firstNum =secNum;
		secNum = thirdNum;	
			
		}
		
	}

}
