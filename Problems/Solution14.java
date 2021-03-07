class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        StringBuilder sb = new StringBuilder("");
        int index = 0;
        for (char c : strs[0].toCharArray()) {
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || strs[i].charAt(index) != c)
                    return sb.toString();
            }
            sb.append(c);
            index++;
        }

        return sb.toString();
    }
}