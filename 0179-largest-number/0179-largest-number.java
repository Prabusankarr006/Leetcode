class Solution {
    public String largestNumber(int[] nums) {
        String []s=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i]=String.valueOf(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                String a=s[i]+s[j];
                String b=s[j]+s[i];
                if(a.compareTo(b)<0){
                    String temp =s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        if(s[0].equals("0")){
        return "0";
        }
        String r="";
        for(String str:s){
            r +=str;
        }
        return r;
    }
}