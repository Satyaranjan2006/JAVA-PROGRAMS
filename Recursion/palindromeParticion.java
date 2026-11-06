class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result= new ArrayList<>();
        List<List<String>> ans= new ArrayList<>();
        generate(s, 0, new ArrayList<>(), result);
        for (List<String> a : result) {
            boolean valid= true;
            for (String str : a) {
                if(!isPalindrome(str)){
                    valid= false;
                    break;
                }
            }
            if(valid){
                ans.add(a);
            }
        }
        return ans;
    }
    static void generate(String s, int index, List<String> current, List<List<String>> result) {
        if (index == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = index + 1; i <= s.length(); i++) {
            String part = s.substring(index, i);
            current.add(part);
            generate(s, i, current, result);
            current.remove(current.size() - 1);
        }
    }
    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}