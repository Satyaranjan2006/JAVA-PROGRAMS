

/**
 * 131. Palindrome Partitioning
Solved
Medium
Topics
premium lock icon
Companies
Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

 

Example 1:

Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:

Input: s = "a"
Output: [["a"]]
 

Constraints:

1 <= s.length <= 16
s contains only lowercase English letters.
 * Solution
 */
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
//c++ solution

class Solution {
public:
    bool checkPalindrome(string str, int startIndex, int lastIndex){
        while(startIndex <= lastIndex){
            if(str[startIndex] != str[lastIndex])
                return false;
            startIndex++;
            lastIndex--;
        }
        return true;
    }
    void palindromePartition(int index, vector<string>& ds, vector<vector<string>>& output, string str){
        if(index == str.length()){
            output.push_back(ds);
            return;
        }
        for(int i = index; i < str.length(); i++){
            if(checkPalindrome(str, index, i)){
                ds.push_back(str.substr(index, i - index + 1));
                palindromePartition(i+1, ds, output, str);
                ds.pop_back();
            }
        }
    }
    vector<vector<string>> partition(string s) {
        vector<vector<string>> output;
        vector<string> ds;
        palindromePartition(0, ds, output, s);
        return output;
    }
};