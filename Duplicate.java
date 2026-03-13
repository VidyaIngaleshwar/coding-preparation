
// class Duplicate{
    
//     static int binarySearch(int a[], int l, int r, int x){
        
//         while (l <= r){
            
//             int m = (l + r) / 2;

//             // Index of Element Returned
//             if (a[m] == x) {
//                 return m;

//                 // If element is smaller than mid, then
//                 // it can only be present in left subarray
//                 // so we decrease our r pointer to mid - 1
//             }
//             else if (a[m] > x) {
//                 r = m - 1;

//                 // Else the element can only be present
//                 // in right subarray
//                 // so we increase our l pointer to mid + 1
//             }
//             else {
//                 l = m + 1;
//             }
//         }

//         // No Element Found
//         return -1;
//     }

//     public static void main(String args[])
//     {

//         int a[] = { 2, 3, 4, 10, 40 };
//         int n = a.length;
//         int x = 10;

//         int res = binarySearch(a, 0, n - 1, x);

//         System.out.println("Element to be searched is : "
//                            + x);

//         if (res == -1)
//             System.out.println(
//                 "Element is not present in array");
//         else
//             System.out.println(
//                 "Element is present at index: " + res);
//     }
// }
    
class Duplicate{
    public static void BinarySerach(int arr[],int l,int r,int x){
        int m= l+(r-1)/2;
        while(l<=r){
            if(arr[m]==x){
                System.out.println(m);
            }else if(arr[m]<x){
                System.out.println(m+1);
            }else{
                System.out.println(m-1);
            }
        }
      
    }
    public static void main(String args[]){
        int arr[]={5,5,2,7,8,4,9};
        int n=arr.length;
        int x=9;
        BinarySerach(arr,0,n,x);
    }
}




class GfG {

    static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return n;
		
      	// Start from the second element
        int idx = 1; 
      
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDuplicates(arr);

        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// int m=l+(r-l)/2;
// while(l<=r){
//     if(arr[m]==x){
//         System.out.println(m);
//     }else if(arr[m]>x){
//         System.out.println(m-1);
//     }else{
//         System.out.println(m+1);
//     }
// }