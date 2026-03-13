import java.util.HashSet;
class DuplicateSorted{
    public static int removeDuplicate(int[] nums){
        //HashSet to store unique element we have seen
        HashSet<Integer> seen= new HashSet<>();
        int index=0;  //i=0
        for(int num:nums){  //for(int j=0;j<nums.length;j++)
            if(!seen.contains(num)){   // if(nums[j]!=nums[i])
                seen.add(num); //i++;
                nums[index]=num;  //nums[i]=nums[j];
                index++;
            }
        }
        return index;  //return i+1;
    }

    // 
    public static void main(String args[]){
        int[] nums={1,2,2,6,3,9,2};
        int k= removeDuplicate(nums);
        System.out.println(k);
        System.out.println("array after removing duplicates");
        for(int i=0;i<k;i++){
            System.out.println(nums[i]+" ");
        }
    }
}