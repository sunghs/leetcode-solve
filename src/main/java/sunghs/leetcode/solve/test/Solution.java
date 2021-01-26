class Solution {

    // 6을 최소로 바꿔서 가장 큰 수 => 가장 빨리 나타나는 6 하나를 9로 바꾸면 된다.
    public int maximum69Number(int num) {
        String s = String.valueOf(num);
        StringBuilder result = new StringBuilder();
        int limit = 0;
        for (char c : s.toCharArray()) {
            if (c == '6' && limit == 0) {
                result.append('9');
                limit++;
            } else {
                result.append(c);
            }
        }
        return Integer.parseInt(result.toString());
    }
}