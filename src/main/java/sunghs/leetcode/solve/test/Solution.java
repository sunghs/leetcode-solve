import java.util.HashSet;
import java.util.Set;

class Solution {

    public int diagonalSum(int[][] mat) {
        Set<String> set = new HashSet<>(); // 지나온 좌표를 저장
        int result = 0;
        int vertical = mat.length; // 세로 최대길이
        int horizon = mat[0].length; // 가로 최대길이

        // 좌상단 시작 우하단 종료
        int x = 0;
        int y = 0;
        while (x < horizon && y < vertical) {
            String pt = String.valueOf(x) + "," + String.valueOf(y);
            if (!set.contains(pt)) {
                result += mat[x][y];
                set.add(pt);
            }
            x++;
            y++;
        }

        // 우상단 시작 좌하단 종료
        x = horizon - 1;
        y = 0;
        while (x >= 0 && y < vertical) {
            String pt = String.valueOf(x) + "," + String.valueOf(y);
            if (!set.contains(pt)) {
                result += mat[x][y];
                set.add(pt);
            }
            x--;
            y++;
        }

        return result;
    }
}