import java.util.*;

 class So {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (groups.containsKey(key)) {
                groups.get(key).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                groups.put(key, list);
            }

        }

        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {
        So sol = new So();

        String[] input = {"eat", "tea", "tae", "ate", "nat", "bat"};
        List<List<String>> result = So.groupAnagrams(input);

        System.out.println("Input: " + Arrays.toString(input));
        System.out.println("Grouped Anagrams: " + result);
    }
}
