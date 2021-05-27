import java.util.*;
public class Main{
    public static void main(String[] args){
        int arr[]=new int[10];
        int arr1[]=new int[10];
        Scanner sn=new Scanner(System.in);
        int k=sn.nextInt();
        for(int i=0;i<k;i++)
        {
        arr[i]=sn.nextInt();
        }
       
        for(int i=k-1;i>=0;i--)
        System.out.println(arr[i]);
    }
}
