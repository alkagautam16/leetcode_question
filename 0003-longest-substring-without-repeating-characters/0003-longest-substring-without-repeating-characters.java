class Solution {
    public int lengthOfLongestSubstring(String s) {
       int count = 0;
       
                for(int i = 0;i<s.length();i++){
                     HashSet<Character > st = new HashSet<>();
                     for(int j = i;j<s.length();j++){
                        if(st.contains(s.charAt(j))){
                        break;
                     }
                    st.add(s.charAt(j));
                    count = Math.max(count,st.size());
                    }
        }
        return count;
    }
}