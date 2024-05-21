import java.util.*;

public class SymmetricPair {

    public static void symmetricPair(int[][] arr) {
        // Write code here
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int a=arr[i][0];
            int b=arr[i][1];
            if(hm.containsKey(b)&&hm.get(b)==a){
                System.out.println(b+" "+a);
            }
            else{
                hm.put(a,b);
            }
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int arr[][] = new int[row][2];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < 2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        symmetricPair(arr);
    }
}