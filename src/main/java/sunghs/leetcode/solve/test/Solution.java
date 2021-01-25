class Solution {

    public int minTimeToVisitAllPoints(int[][] points) {
        int distance = 0;

        for (int i = 0; i < points.length - 1; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            int x2 = points[i + 1][0];
            int y2 = points[i + 1][1];

            // 대각선으로 움직임
            while (x1 != x2 && y1 != y2) {
                if (x1 < x2) {
                    x1++;
                } else {
                    x1--;
                }
                if (y1 < y2) {
                    y1++;
                } else {
                    y1--;
                }
                distance++;
            }
            // 수평으로 움직임 (x축)
            while (x1 != x2) {
                if (x1 < x2) {
                    x1++;
                } else {
                    x1--;
                }
                distance++;
            }
            // 수직으로 움직임 (y축)
            while (y1 != y2) {
                if (y1 < y2) {
                    y1++;
                } else {
                    y1--;
                }
                distance++;
            }
        }
        return distance;
    }
}