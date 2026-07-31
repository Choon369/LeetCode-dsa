class Solution {
    public boolean validPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        
        while (i < j) {
            // Found a mismatch!
            if (arr[i] != arr[j]) {
                
                // Path 1: Assume we deleted the character at index i
                int i1 = i + 1;
                int j1 = j;
                boolean path1Valid = true;
                while (i1 < j1) {
                    if (arr[i1] != arr[j1]) {
                        path1Valid = false;
                        break;
                    }
                    i1++;
                    j1--;
                }
                
                // Path 2: Assume we deleted the character at index j
                int i2 = i;
                int j2 = j - 1;
                boolean path2Valid = true;
                while (i2 < j2) {
                    if (arr[i2] != arr[j2]) {
                        path2Valid = false;
                        break;
                    }
                    i2++;
                    j2--;
                }
                
                // If either pointer path made it to the middle, it's valid
                return path1Valid || path2Valid;
            }
            
            i++;
            j--;
        }
        
        return true;
    }
}
