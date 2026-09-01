class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        for(int i=left;i<s.length/2;i++){
            char reverse=s[left];
            s[left]=s[right];
            s[right]=reverse;
            right--;
            left++;
        }
    }
}