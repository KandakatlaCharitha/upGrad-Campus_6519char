import java.util.*;

public class CommonElement {

    public static void printElementInAllRows(int mat[][]) {

        // Write code here
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                int element=mat[i][j];
                if(hm.containsKey(element)){
                    int val=hm.get(element);
                    if(val==i+1){
                        continue;
                    }
                    else{
                        hm.put(element,val+1);
                    }
                }
                else{
                    hm.put(element,1);
                }
            }
        }
        for(int i:hm.keySet()){
            if(hm.get(i)==mat.length){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int matrix[][] = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        printElementInAllRows(matrix);
    }
}