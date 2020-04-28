import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] arr;
    arr=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=s.nextInt();
    int max=0,maxind=0;
    for(int i=0;i<n;i++)
      if(arr[i]>max){
        max=arr[i];
        maxind=i;
      }
    System.out.print(maxind);
  }
}