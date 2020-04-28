import java.util.Scanner;

class Main{
  public static int exp(int x, int y){
    int prod=1;
    for(int i=0;i<y;i++)
       prod*=x;
    return prod;
    }
  public static void main (String[] args){
    Scanner s=new Scanner(System.in);
	int x=exp(s.nextInt(),s.nextInt());
      System.out.print(x);
  }
}
