public class bubleSorting {
    public static void main(String[] args) {
       int nums[] = {30, 78, 26, 84, 72,-28, 84, -93, 72, 17};

        System.out.println("Массив до пузырьковой сортировки: ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
        for (int i = 1; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j-1] > nums[j]){
                    int t = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j]= t;
                }
            }
        }
        System.out.println("Массив после сортировки: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
    }
}
