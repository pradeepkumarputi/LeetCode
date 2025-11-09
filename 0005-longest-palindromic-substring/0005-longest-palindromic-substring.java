class Solution {
    public boolean palindrome(String s){
        int i=0;int j=s.length()-1;
        while(i<j){
            if(s.charAt(i) !=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n ;j++){
                String str=s.substring(i,j);
                if(palindrome(str) && str.length() > ans.length() ){
                    ans= s.substring(i,j);   
                }
            }
        }
        return ans;
    }
}