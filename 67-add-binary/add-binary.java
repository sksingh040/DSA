class Solution {
    
    public String addBinary(String a, String b) {
        String result = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) {
                if (a.charAt(i) == '1') {
                    sum = sum + 1;
                }
                i = i - 1;
            }

            if (j >= 0) {
                if (b.charAt(j) == '1') {
                    sum = sum + 1;
                }
                j = j - 1;
            }

            if (sum == 0) {
                result = "0" + result;
                carry = 0;
            } else if (sum == 1) {
                result = "1" + result;
                carry = 0;
            } else if (sum == 2) {
                result = "0" + result;
                carry = 1;
            } else if (sum == 3) {
                result = "1" + result;
                carry = 1;
            }
        }

        return result;
    }
}