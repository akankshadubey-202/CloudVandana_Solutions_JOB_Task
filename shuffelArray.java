import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;  
class ShuffleArray {
    public static void random(int[] arr,int n){
         Random r = new Random();
         //Start from the last index and swap it with the random index element
        for (int i = n-1; i > 0; i--) {
            int j = r.nextInt(i+1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        { arr[i]=sc.nextInt();
        }
       random(arr,n);
    }
}
