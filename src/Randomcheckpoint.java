import java.util.Random;

public class Randomcheckpoint {

	public Randomcheckpoint() {
		}public static void main(String[] args) {
			
			int r ;
			//1. Get a random whole number that is less than 1,000.
			Random random = new Random();
		 r=random.nextInt(1000);
		 
		 
		 System.out.println(r);
			//2. Get another random whole number that is less than 900.
		int E ;
		 
			
		 E=random.nextInt(999);
		 System.out.println(E);
			
			
			
			//3. Print:

		 int sum;
		 sum = r+E;
				 System.out.println(sum);
		 //a) What happens when you add the numbers , e.g. 99 + 64 = 163 
				 

				 int sum1;
				 sum1 = r-E;
						 System.out.println(sum1);
				 
			          //b) What happens when you subtract the numbers , e.g. 99 ­ 64 = 35 
		}

}
