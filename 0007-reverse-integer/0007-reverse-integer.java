class Solution {
    public int reverse(int x) {

        int revX = 0;

        while (x != 0) {

            int last_d = x % 10;
            x = x / 10;

            if (revX > Integer.MAX_VALUE / 10 ||
                (revX == Integer.MAX_VALUE / 10 && last_d > 7)) {
                return 0;
            }

            if (revX < Integer.MIN_VALUE / 10 ||
                (revX == Integer.MIN_VALUE / 10 && last_d < -8)) {
                return 0;
            }

            revX = (revX * 10) + last_d;
        }

        return revX;
    }
}