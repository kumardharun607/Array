public class MaxUniqueSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Input String: " + s);
        System.out.println("Length of Longest Substring Without Repeating Characters: " + lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        String current = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If current substring already contains this character, remove up to that character
            if (current.indexOf(c) != -1) {
                current = current.substring(current.indexOf(c) + 1);
            }

            // Add current character
            current += c;
             
            // Update maximum length
            if (current.length() > maxLength) {
                maxLength = current.length();
				System.out.println(current);
				
            }
        }
		
        return maxLength;
    }
}
