package w1assignment;

public class IsPrime {

	public static void main(String[] args) {
		int m=0,flag=0;
		int n=4;
		m=n/2;
		
		if (n==0||n==1)
		{
			System.out.println("It's not a prime number"+n);
		}
		else 
		{
			for (int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println("Given number is not a prime"+n);
					flag=1;
					break;
				}
			}
			if(flag==0)
			{System.out.println("Given number is prime"+n);}
		}
	}

}
