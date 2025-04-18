public class Question5 {

    public static int countMajorityElement(int[] nums) {
        // Step 1: Find the candidate for majority element
        int candidate = findCandidate(nums);

        // Step 2: Verify if the candidate is the majority element
        int count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Step 3: Check if the count is more than half the array size
        if (count > nums.length / 2) {
            return count;
        } else {
            return 0; // No majority element
        }
    }

    private static int findCandidate(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 2, 2 };
        int result = countMajorityElement(nums);
        System.out.println("Count of majority element: " + result);
    }
}