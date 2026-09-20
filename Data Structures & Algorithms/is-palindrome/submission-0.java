class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }

        // 2. Check filtered string against its reversed version
        String original = filtered.toString();
        String reversed = filtered.reverse().toString();

        return original.equals(reversed);        
    }
}
