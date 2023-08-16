import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class NGElement {
    public static List<Integer> nextGreaterElements(List<Integer> nums) {
        int n = nums.size();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(-1); // Initialize result list with -1
        }

        Stack<Integer> stack = new Stack<>(); // Stack to store indices

        for (int i = 0; i < 2 * n; i++) {
            int num = nums.get(i % n);

            while (!stack.isEmpty() && nums.get(stack.peek()) < num) {
                result.set(stack.pop(), num);
            }

            if (i < n) {
                stack.push(i);
            }
        }

        result.set(n - 1, -1); // Set the next greater element of the last element to -1

        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(8);
        nums.add(1);
        nums.add(10);
        nums.add(12);

        List<Integer> nextGreater = nextGreaterElements(nums);

        System.out.println("Original list: " + nums);
        System.out.println("Next greater elements: " + nextGreater);
    }
}
