public class BubbleSort {

    public int[] sortArray(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return nums;
    }
}
