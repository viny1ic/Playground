import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int c=0;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++,c++){
          if(c%2==0) 
          System.out.print("*");
          else
            System.out.print("#");
        }
        System.out.print("\n");
      }
	}
}