class Solution {
    public String rightRotate(String s, int k) {
    int n = s.length();
    k = k % n;

    return s.substring(n - k) + s.substring(0, n - k);
}
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        for(int i=1;i<=s.length();i++){
            if(rightRotate(s,i).equals(goal)){
                return true;
            }
        }
        return false;
    }
}