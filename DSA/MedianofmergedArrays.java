import java.util.Scanner;

public class MedianofmergedArrays{
    public static int median(int[] arr1, int[] arr2 , int n){

        // Write code here
        int m=2*n;
        int[] arr=new int[m];
        int i=0;
        int j=0;int k=0;
        while(i<n&&j<n){
            if(arr[i]<=arr[j]){
                arr[k]=arr[i];
                i++;
                k++;
            }
            else{
                arr[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<n){
            arr[k]=arr[i];
            k++;
        }
        while(j<n){
            arr[k]=arr[j];
            k++;
        }
        float median=0;
        if (m%2==0){

        }
        else{

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < n ; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println(median(arr1, arr2, n));
    }
}