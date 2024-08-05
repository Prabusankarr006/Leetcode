class Solution {
    public boolean isPalindrome(String s) {
    s =s.toLowerCase();
       HashMap<Character,Integer>map=new HashMap<>();
       StringBuilder mia=new StringBuilder();
       String b="abcdefghijklmnopqrstuvwxyz0123456789";
       for(int i=0;i<36;i++){
        map.put(b.charAt(i),1);

       } 
       
       for(int i=0;i<s.length();i++){
        if(map.containsKey(s.charAt(i))){
            mia.append(s.charAt(i));
        }
        
       }String m1= mia.toString();
       String  m2=mia.reverse().toString();
       return (m1.equals(m2));
    }
}