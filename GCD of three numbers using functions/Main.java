import java.util.Scanner;
class Main{
  public static int g(int a,int b,int c){
    if(a<b){
      if(a<c)
        return a;
      else
        return c;
      }
    else{
      if(b<c)
        return b;
      else
        return c;
    }
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int a = s.nextInt(), b=s.nextInt(), c = s.nextInt();
      int min=(g(a,b,c));
      System.out.print(min);
      for(;min>=1;min--){
        //if(min%a==0 && min%b==0 && min%c==0)
        //  System.out.print(min);
      }
	}
}