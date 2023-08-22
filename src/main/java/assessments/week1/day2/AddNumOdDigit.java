package assessments.week1.day2;

public class AddNumOdDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=123;
		int sum=0;
		while(input!=0)
		{
		sum=sum+(input%10);
		input=input/10;
		
		}
		System.out.println(sum);

	}

}
