//40. Combination Sum II

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        generateSequences(candidates, target, new ArrayList<>(), res, 0);
        return res;
    }

    void generateSequences(int[] candidates, int target, List<Integer> temp,
                           List<List<Integer>> res, int i) {
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        if (target < 0 || i >= candidates.length) {
            return;
        }

        temp.add(candidates[i]);
        generateSequences(candidates, target - candidates[i], temp, res, i + 1);

        int curr = temp.remove(temp.size() - 1);
        while (i < candidates.length && candidates[i] == curr) {
            i++;
        }
        generateSequences(candidates, target, temp, res, i);
    }
}

//python

def combinationSum2(self, candidates, target):
    # Sorting is really helpful, se we can avoid over counting easily
    candidates.sort()                      
    result = []
    self.combine_sum_2(candidates, 0, [], result, target)
    return result
    
def combine_sum_2(self, nums, start, path, result, target):
    # Base case: if the sum of the path satisfies the target, we will consider 
    # it as a solution, and stop there
    if not target:
        result.append(path)
        return
    
    for i in xrange(start, len(nums)):
        # Very important here! We don't use `i > 0` because we always want 
        # to count the first element in this recursive step even if it is the same 
        # as one before. To avoid overcounting, we just ignore the duplicates
        # after the first element.
        if i > start and nums[i] == nums[i - 1]:
            continue

        # If the current element is bigger than the assigned target, there is 
        # no need to keep searching, since all the numbers are positive
        if nums[i] > target:
            break

        # We change the start to `i + 1` because one element only could
        # be used once
        self.combine_sum_2(nums, i + 1, path + [nums[i]], 
                           result, target - nums[i])