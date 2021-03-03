import java.util.Scanner;
class Numerology_number{
	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();

      int k=a;
      int sum1=0, sum2=0,sum3=0;
      int od=0;
      int ev=0;
      int rem = 0;
      int ins = 0;
      while(k>0)
      {
        rem = k%10;

        if(rem%2==0)
        {
        	ev+=1;
        }
        else
        {
        	od+=1;
        }
         sum1=rem+sum1;
        k=k/10;

      }
      System.out.println("Sum of digits");
      System.out.println(sum1);
      rem = 0;
      while(sum1>0)
      {
       rem = sum1%10;
       sum2 = sum2+rem;
       sum1=sum1/10;
      }
      if(sum2>9)
      {
      	while(sum2>0)
      	{
      		 rem = sum2%10;
             sum3 = sum3+rem;
             sum2=sum2/10;
      	}
      	ins = 1;
      }

      System.out.println("Numerology number");
      if(ins==0){
         System.out.println(sum2);
      }
      else
      {
      	    System.out.println(sum3);
      }
      System.out.println("Number of odd numbers");
      System.out.println(od);
      System.out.println("Number of even numbers");
      System.out.println(ev);
	}
}