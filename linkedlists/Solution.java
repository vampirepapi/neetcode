package linkedlists;

class Solution {
    public void sortColors(int[] nums) {
        //3 counters to store the vals
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;

        for (int i : nums) {
            if (i==0) {
                cnt0++;
            }
            else if (i==1) {
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (cnt0!=0) {
                nums[i] = 0;
                cnt0--;
                
            }
            else if (cnt1!=0) {
                nums[i] = 1;
                cnt1--;
            }
            else{
                nums[i]= 2;
                cnt2--;
            }
        }
        
        
    }
}