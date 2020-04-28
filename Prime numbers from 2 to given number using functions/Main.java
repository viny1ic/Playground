import java.util.Scanner;

class Main{
  public static void exp(int x){
    for(int i=0;i<x;i++){
      for(int j=2;j<=i;j++){
        if(j==i)
		   System.out.println(i);
        else if(i%j==0)
          break;
      }
    }
    }
  public static void main (String[] args){
    Scanner s=new Scanner(System.in);
	exp(s.nextInt());
  }
}