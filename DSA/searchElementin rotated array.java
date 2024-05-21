import java.util.Scanner;

public class searchElementinrotatedarray{

    public static int search(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<=arr[high]){   
                if(target>=arr[mid]&&target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else{
                if(target<=arr[mid]&&target>=arr[low]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target=sc.nextInt();
        int ans=search(arr,target);
        if(ans==-1){
            System.out.println("no element found");
        }
        else{
            System.out.println(ans);
        }
     }
}