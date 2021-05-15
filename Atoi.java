class Solution {
    public int myAtoi(String s) {



        s = s.trim();

        if (s.length() == 0 || s == null)
            return 0;

        long finalInteger = 0, sign = 1;
        int counter = 0;


        if (s.charAt(0) != '-' && s.charAt(0) != '+' && !Character.isDigit(s.charAt(0))) {
            return 0;
        } else if (s.charAt(0) == '-') {
            sign = -1;
            counter++;
        } else if (s.charAt(0) == '+') {
            counter++;
        }


        for (int i = counter; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {

                finalInteger = finalInteger * 10 + (s.charAt(i) - '0');
                if (sign == 1 && finalInteger >= Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if (sign == -1 && finalInteger * -1 <= Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }

            } else {
                break;
            }


        }

        return (int)(finalInteger * sign);



    }
}
