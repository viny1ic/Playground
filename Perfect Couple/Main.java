import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
      int q=s.nextInt();
      for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
          if(i==j)
            continue;
          if(arr[i]+arr[j]==q)
            System.out.println(arr[i]+", "+arr[j]);
        }
      }
    }
}