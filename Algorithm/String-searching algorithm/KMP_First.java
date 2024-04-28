// KMP_First.java

public class KMP_First {
    // Function to compute the partial match table (prefix function)
    private static int[] computePrefixFunction(String pattern) {
        int m = pattern.length();
        int[] prefix = new int[m];
        int k = 0;
        
        for (int i = 1; i < m; i++) {
            while (k > 0 && pattern.charAt(k) != pattern.charAt(i)) {
                k = prefix[k - 1];
            }
            if (pattern.charAt(k) == pattern.charAt(i)) {
                k++;
            }
            prefix[i] = k;
        }
        return prefix;
    }
    
    // Function to perform string search using KMP algorithm
    public static int kmpSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int[] prefix = computePrefixFunction(pattern);
        int q = 0;  // Number of characters matched

        for (int i = 0; i < n; i++) {
            while (q > 0 && pattern.charAt(q) != text.charAt(i)) {
                q = prefix[q - 1];
            }
            if (pattern.charAt(q) == text.charAt(i)) {
                q++;
            }
            if (q == m) {
                return i - m + 1; // Pattern found starting at index i - m + 1
            }
        }
        return -1;  // Pattern not found in text
    }
    
    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";
        
        int index = kmpSearch(text, pattern);
        
        if (index != -1) {
            System.out.println("Pattern found at index: " + index);
        } else {
            System.out.println("Pattern not found in text.");
        }
    }
}
