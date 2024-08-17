class Solution {
    public int longestConsecutive(int[] arr) {
        int n=arr.length,max=1;
        if(n==0){
            return 0;
        }
        Set<Integer>set =new HashSet<>();
        int i=0,count=1;
        for(i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int x:set){
            if(!set.contains(x-1)){
                count=1;
                int temp=x;
                while(set.contains(temp+1)){
                    count++;
                    temp++;
                }
            }
            if(count>max){
                max=count;
            }
        }return max;
    }
}