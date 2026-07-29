class Solution {
    public String reverseVowels(String s) {
        
        ArrayList<Character> vowel = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] str = s.toCharArray();
        int i =0;
        int j = str.length -1;
        while (i<j)
        {
            if(!vowel.contains(str[i]))
            {
                i++;
            }
            else if(!vowel.contains(str[j]))
            {
                j--;
            }
            else
            {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
        }
        String ret = new String(str);
        return ret; 
    }
}
