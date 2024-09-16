//Find the second largest element in an array

public class SecondLargest {
    public static int seconflargest(int nums[]) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                smax = max;
                max = nums[i];
            } else if (nums[i] > smax && nums[i] != max) {
                nums[i] = smax;

            }
        }
        return smax;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int answer = seconflargest(arr);
        System.out.println("second largest element " + answer);

    }
}
