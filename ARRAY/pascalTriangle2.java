class Solution {
    public List<Integer> getRow(int rowIndex) {
    List<Integer> res = new ArrayList<Integer>();
    for(int i = 0;i<rowIndex+1;i++) {
    		res.add(1);
    		for(int j=i-1;j>0;j--) {
    			res.set(j, res.get(j-1)+res.get(j));
    		}
    }
    return res;
}
}

// c++ solution


class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> row(rowIndex + 1, 0);
        row[0] = 1;

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i; j >= 1; j--) {
                row[j] += row[j - 1];
            }
        }

        return row;
    }
};