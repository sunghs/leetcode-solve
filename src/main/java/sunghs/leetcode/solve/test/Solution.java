class Solution {

    public int reverse(int x) {
        boolean positive = (x >= 0);
        StringBuilder sb = new StringBuilder().append(Math.abs(x));
        try {
            int result = Integer.parseInt(sb.reverse().toString());
            return positive ? result : (-result);
        } catch (Exception e) {
            return 0;
        }
    }
}