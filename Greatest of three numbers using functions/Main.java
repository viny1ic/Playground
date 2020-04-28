import java.util.Scanner;
class Main{
  public static int g(int a,int b,int c){
    if(a>b){
      if(a>c)
        return a;
      else
        return c;
      }
    else{
      if(b>c)
        return b;
      else
        return c;
    }
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      System.out.print(g(s.nextInt(),s.nextInt(),s.nextInt()));
	}
}