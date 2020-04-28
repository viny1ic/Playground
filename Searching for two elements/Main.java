import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int[] arr;
      arr=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
      int a=s.nextInt();
      int b=s.nextInt();
      for(int i=0;i<n;i++)
		if(arr[i]==a)
          System.out.println(i);
      for(int i=0;i<n;i++){
		if(arr[i]==b){
          System.out.println(i);
          break;
        }
        else if(i==n-1)
          System.out.println(-1);
      }
        // Type your code here
    }
}