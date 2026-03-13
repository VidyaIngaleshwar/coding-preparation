import java.util.Scanner;

class SecondLargest{
    public static void main(String args[]){
        int arr[]={1,4,2,5,60,29,30};
        int max=arr[0];
        int target=arr[0];
        for(int i=0;i<arr.length;i++){
            
                if(max<arr[i]){
                    target=max;
                    max=arr[i];
                    
                }
                else if(arr[i] != max && arr[i]> target ){
                    target= arr[i];
                }
        }
    System.out.println(target);       
    }
}