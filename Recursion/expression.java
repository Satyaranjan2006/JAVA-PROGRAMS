class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        dfs(num, target, 0, 0, 0, "", res);

        return res;
    }

    private void dfs(String num, int target, int start, long curr_val, long last_operand, String expression, List<String> res) {
        if(start == num.length()) {
            if(curr_val == target) {
                res.add(expression);
            }
            return;
        }

        for(int i=start; i<num.length(); i++) {
            if(i>start && num.charAt(start) == '0') return;

            String curr_num = num.substring(start, i+1);
            long curr_num_val = Long.parseLong(curr_num);

            // If we are at the first number, just start the expression
            if(start == 0) {
                dfs(num, target, i+1, curr_num_val, curr_num_val, curr_num, res);
            } else {
                // Add the current number with '+'
                dfs(num, target, i+1, curr_val+curr_num_val, curr_num_val, expression+"+"+curr_num, res);

                // Add the current number with '-'
                dfs(num, target, i+1, curr_val-curr_num_val, -(curr_num_val), expression+"-"+curr_num, res);

                // Add the current number with '*'
                dfs(num, target, i+1, curr_val-last_operand+last_operand*curr_num_val, last_operand*curr_num_val, expression+"*"+curr_num, res);
            }
        }
    }
} 

// c++ solution

class Solution {
private:
    vector<string> ans;

    void backtrack(const string& num, int target, int pos,
                   long long value, long long last,
                   string expr) {
        if (pos == num.size()) {
            if (value == target) {
                ans.push_back(expr);
            }
            return;
        }

        long long current = 0;

        for (int i = pos; i < num.size(); i++) {
            // Operands cannot have leading zeros.
            if (i > pos && num[pos] == '0') {
                break;
            }

            current = current * 10 + (num[i] - '0');
            string part = num.substr(pos, i - pos + 1);

            if (pos == 0) {
                // The first operand has no preceding operator.
                backtrack(num, target, i + 1,
                          current, current, part);
            } else {
                // Addition
                backtrack(num, target, i + 1,
                          value + current, current,
                          expr + "+" + part);

                // Subtraction
                backtrack(num, target, i + 1,
                          value - current, -current,
                          expr + "-" + part);

                // Multiplication: preserve operator precedence.
                backtrack(num, target, i + 1,
                          value - last + last * current,
                          last * current,
                          expr + "*" + part);
            }
        }
    }

public:
    vector<string> addOperators(string num, int target) {
        ans.clear();
        backtrack(num, target, 0, 0, 0, "");
        return ans;
    }
};