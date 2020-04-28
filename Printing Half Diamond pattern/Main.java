import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int lim=1, space=n;
      for(int i=0;i<n;i++,lim+=2,space--){
        for(int k=1;k<space;k++)
          System.out.print(" ");
        for(int j=0;j<lim;j++)
          System.out.print("*");
      System.out.print("\n");
      }
	}
}
