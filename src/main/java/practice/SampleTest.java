package practice;

public class SampleTest {
	public static boolean isPrime(int num) {
		boolean output = false;

		if (num == 0) {
			output=false;
			return output;
		}
		else {

			// Declare an int Input and assign a value 13
			boolean flag = false;// Declare a boolean variable flag as false

			// Iterate from 2 to half of the input
			for (int i = 2; i < num / 2; i++) {// 2<3
				// Divide the input with each for loop variable and check the remainder
				if (num % i == 0) {

					flag = true;// Set the flag as true when there is no remainder
					output=flag;
					break; // break the iterator

				}
			}
			if (flag == false) {
				output=flag;
				
			}
						
			//return output;
		}
		return output;

	}
	
	public static void main(String[] args) {
        int inputNumber = 111; // You can replace this with any non-negative integer
        boolean result1 = isPrime(inputNumber);
        if(result1==true)
        {
        System.out.println("The factorial of " + inputNumber + " is non prime");
        }
        else 
        {
        	System.out.println("The factorial of " + inputNumber + " is prime");
        }
    }
}
