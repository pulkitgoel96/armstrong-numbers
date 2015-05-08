//Program to find if a no. is ARMSTRONG or not....

import java.util.Scanner;

class armstrong
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int num, temp, r, sum = 0;
    System.out.println("Enter a number : ");
    num = in.nextInt();
    temp = num;
    while(temp > 0)
    {
      r = temp % 10;
      sum += Math.pow(r,3);
      temp = temp/10;
    }
    if(sum == num)
    {
      System.out.println("\n\n" + num + " is an ARMSTRONG number");
    }
    else
    {
      System.out.println("\n\n" + num + " is NOT an ARMSTRONG number");
    }
  }
}
