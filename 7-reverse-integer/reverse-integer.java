class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        String s = Integer.toString(Math.abs(x));
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String reversedStr = new String(arr);
        if (isNegative) reversedStr = "-" + reversedStr;
        try {
            return Integer.parseInt(reversedStr);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
