package Activities;

public class Activity2 {
	public static void main(String[] args) {
		int[] arr= {10,77,10,54,-11,10};
		System.out.println("IS the sum of 10's equal to 30?" +countTens(arr));
	}
	public static boolean countTens(int[] arr)
	{
		int sum=0;
		for(int num : arr)
		{
			if(num==10)
			{
				sum += num;
				System.out.println(sum);
			}
			if(sum>30)
			{
				break;
			}
		}
		return sum==30;
	}
      
}
