class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            // if(left<right && !Character.isLetterOrDigit(s.charAt(left))){
            //     left++;
            // }
            // if(left<right && !Character.isLetterOrDigit(s.charAt(right))){
            //     right--;
            // }
            while(left<right && !isAlphaNum(s.charAt(left))){
                left++;
            }
            while(left<right && !isAlphaNum(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isAlphaNum(char c){
        if((c>='0' && c<='9')
        || (Character.toLowerCase(c)>='a' && Character.toLowerCase(c)<='z')){
            return true;
        }
        return false;
    }
}
