package week1.day2;

public class ArmstrongNum {

	public static void main(String[] args) {
		int no = 153;
		int value = no;
		int sum = 0;
		while(no!=0) {
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		 System.out.println(sum);
		 if(sum==value)
		 {
			 System.out.println("armstrong number");
			 
			}
		 else {
			 System.out.println("Not an armstrong number");
		 }
		
	}

}
