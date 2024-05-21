import java.util.*;

public class MostFrequentElement {

 public static int mostFrequentElement(int[] arr) {

   // Write code here
   if(arr.length==0){
    return -1;
   }
   HashMap<Integer,Integer>hm=new HashMap<>();
   for(int i=0;i<arr.length;i++){
    int element=arr[i];
    if(hm.containsKey(element)){
        int frequency=hm.get(element);
        hm.put(element,frequency+1);
    }
    else{
        hm.put(element,1);
    }
   }
   int max=0;
   int frequentelement=-1;
   for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
        if(entry.getValue()>max){
            max=entry.getValue();
            frequentelement=entry.getKey();
        }
   }
   
   return frequentelement;
 }


 public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(mostFrequentElement(arr));
 }
}