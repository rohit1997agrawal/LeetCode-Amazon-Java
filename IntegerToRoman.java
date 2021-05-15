class Solution {
    public String intToRoman(int num) {

        if (num < 1 || num > 3999)
            return null;

        String[] roman = {
            "M",
            "CM",
            "D",
            "CD",
            "C",
            "XC",
            "L",
            "XL",
            "X",
            "IX",
            "V",
            "IV",
            "I"
        };
        int numbers[] = {
            1000,
            900,
            500,
            400,
            100,
            90,
            50,
            40,
            10,
            9,
            5,
            4,
            1
        };


        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < numbers.length; i++) {
            while (num >= numbers[i]) {
                num -= numbers[i];
                sb.append(roman[i]);
            }
            if (num <= 0)
                break;

        }
        return sb.toString();




    }
}
