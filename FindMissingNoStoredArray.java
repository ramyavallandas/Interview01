//TC: O(logN);SC:O(1)
public class FindMissingNoStoredArray {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] arr = new int[]{1,3,4,5,6,7,8,9,10};
        System.out.print(missingNo(arr));
            
    }
    
    public static int missingNo(int[] nums){
        int low=0;
        int high= nums.length-1; 
        
        while(low<high){
            int mid =low+ (high-low) /2;
            if(nums[mid]-nums[mid-1]!=1) return nums[mid]-1;
            if(nums[mid+1]-nums[mid]!=1) return nums[mid]+1;
            
            if(nums[low]-low != nums[mid]-mid){
                high=mid-1;
             }
             //right part if high has diff +2
             else if(nums[high]-high != nums[mid]-mid){
                 low=mid+1;   
            }
             else{   //stored array with no missing number     
                return  -1;       
             }
         }
         if(low==high){
             return -1;
         }
        return -1;
                
        }
}