import java.util.*;

class Solution {
    public List<Integer> topKFrequent(List<Integer> nums, int k) {

        // Creating a Frequency Table
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // Putting values in a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        // Putting the top k values in a list
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(pq.poll());
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        int k = 2;

        Solution solution = new Solution();
        List<Integer> result = solution.topKFrequent(nums, k);

        System.out.println("Top " + k + " frequent elements: " + result);
    }
}
