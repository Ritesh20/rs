import java.util.*;
import java.lang.Math;
class JumpSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,12,15,23,26,30,41,52,62,78,89,91,99};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key:");
        int key=sc.nextInt();
        sc.close();
        int index=jumpSearch(arr,key);
        if (index==-1){
          System.out.print("Element not found.");
        }
        else{
          System.out.print("Element found at index "+index);
        }
    }
    static int jumpSearch(int[] arr, int key){
      int block = (int)Math.floor(Math.sqrt(arr.length));
      int end = block;
      int start = 0;
      while (arr[end]<key && end<=arr.length) {
        start=end;
        end=start+block;
        if (end>arr.length) {
            end=arr.length;
            break;
        }
      }
      return linearSearch(arr,key,start,end);
    }
    static int linearSearch(int[] arr, int key, int start, int end){
      for(int i=start;i<=end;i++){
        if (arr[i] == key) return i;
      }
      return -1;
    }
}