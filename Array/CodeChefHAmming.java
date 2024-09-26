import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=1;j<=t;j++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n-1;i++){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i++;
            }
            if(n%2!=0){
                System.out.println(n-1);
            }else{
                System.out.println(n);
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
	}
}
