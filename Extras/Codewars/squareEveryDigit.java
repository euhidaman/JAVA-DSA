package Extras.Codewars;

public class squareEveryDigit {
    public static void main(String[] args) {
        int n = 9119;
        String res = "";

        int temp = n;

        while (temp != 0) {
            int r = temp % 10;
            int sq = r * r;
            res = sq + res;

            temp /= 10;
        }

        Integer num = Integer.valueOf(res);

        System.out.println(num);
    }
}
