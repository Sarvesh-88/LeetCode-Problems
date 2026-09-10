class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      if (ransomNote.length() > magazine.length()) {
            return false;
        }
        
        // Array to store the frequency of each of the 26 lowercase letters
        int[] charCounts = new int[26];
        
        // Step 1: Count letters available in the magazine
        for (int i = 0; i < magazine.length(); i++) {
            // 'a' minus 'a' is 0, 'b' minus 'a' is 1, etc.
            int index = magazine.charAt(i) - 'a';
            charCounts[index]++;
        }
        
        // Step 2: Deduct letters needed for the ransom note
        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';
            charCounts[index]--;
            
            // If the count drops below 0, we don't have enough of this letter
            if (charCounts[index] < 0) {
                return false;
            }
        }
        
        return true;  
    }
}