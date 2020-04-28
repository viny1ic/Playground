import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int i=0;i<n;i++)
        System.out.print("*");
      System.out.print("\n");
      for(int i=0;i<n-2;i++){
        System.out.print("*");
        for(int j=0;j<n-2;j++)
          System.out.print(" ");
        System.out.println("*");
      }
	   for(int i=0;i<n;i++)
          System.out.print("*");
	}
}