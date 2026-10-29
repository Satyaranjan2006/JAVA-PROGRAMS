class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer>arr=new ArrayList<>();
        int n=s.length();
        char ch;
        for(int i=0;i<n;i++){
            ch=s.charAt(i);
            if(Character.isDigit(ch)){
                arr.add(ch-'0');
            }
        }

        
        int size=arr.size();
        if(size==0){
            return -1;
        }
        int largest=arr.get(0);
        int secondLargest=-1;
        for(int i=1;i<size;i++){
            if(arr.get(i)>largest){
                secondLargest=largest;
                largest=arr.get(i);
            }
            if(arr.get(i)<largest && arr.get(i)>secondLargest){
                secondLargest=arr.get(i);
            }
        }
        return secondLargest;
    }
}

//secon
int largest=arr.get(0);
        int secondLargest=-1;
        for(int i=1;i<size;i++){
            if(arr.get(i)>largest){
                secondLargest=largest;
                largest=arr.get(i);
            }
            if(arr.get(i)<largest && arr.get(i)>secondLargest){
                secondLargest=arr.get(i);
            }
        }
        return secondLargest;