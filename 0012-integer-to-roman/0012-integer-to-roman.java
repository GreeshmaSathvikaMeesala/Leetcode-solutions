class Solution {
    public String intToRoman(int num) {
        String a[] = {"", "M", "MM", "MMM"};
        String b[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String c[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String d[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return a[num/1000] + b[(num%1000)/100] + c[(num%100)/10] + d[num%10];
    }
}