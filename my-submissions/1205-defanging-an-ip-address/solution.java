class Solution {
    public String defangIPaddr(String address) {
        String replacedstr = address.replace(".","[.]");
        return replacedstr;
    }
}
