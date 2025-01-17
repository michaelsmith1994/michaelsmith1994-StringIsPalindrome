
public class Palindrome {
    /**
     * Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
     *
     * You can solve this problem in several ways:
     * You could start with a String reversal algorithm, which you have already written, and check if str is the same
     * as its reversed form, or, you could check if the character at the nth position of a String moving forwards
     * re the same as the nth position of a String moving backwards.
     *
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str){
        char[] copyStr = str.toCharArray();
        int left = 0;
        int right = copyStr.length - 1;
        for (char c : copyStr) {
            if(copyStr[left] != copyStr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
