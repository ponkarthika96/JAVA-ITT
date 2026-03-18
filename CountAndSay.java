class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        
        String previous = countAndSay(n - 1); // Recursive call to get the previous term
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < previous.length(); i++) {
            if (previous.charAt(i) == previous.charAt(i - 1)) {
                count++; // Same digits, increase count
            } else {
                result.append(count).append(previous.charAt(i - 1));
                count = 1; // Reset count for new digit
            }
        }
        result.append(count).append(previous.charAt(previous.length() - 1)); // Append last counted digit
        return result.toString();
    }
}
