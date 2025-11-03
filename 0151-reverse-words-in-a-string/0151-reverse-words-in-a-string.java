class Solution {
    public String reverseWords(String s) {
        if (s == null) return null;
        s=s.trim();
        StringBuilder ans=new StringBuilder("");
        StringBuilder str=new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' '){
                str.append(ch);
            }
            else if(str.length() > 0){
                str.reverse();
                ans.append(str).append(' ');
                str.delete(0,s.length());
            }
        }
         if (str.length() > 0) {          
            str.reverse();
            ans.append(str);
        }
        return ans.toString();
    }
}