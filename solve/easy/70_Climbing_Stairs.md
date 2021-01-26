You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

### Examples:
```
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps


Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
```

### Constraints:
- 1 <= n <= 45

```java
class Solution {

    public Map<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        if (n <= 3) {
            return Math.max(n, 0);
        } else {
            Integer v1 = map.get(n - 1);
            Integer v2 = map.get(n - 2);
            if (v1 == null) {
                v1 = climbStairs(n - 1);
                map.put(n - 1, v1);
            }
            if (v2 == null) {
                v2 = climbStairs(n - 2);
                map.put(n - 2, v2);
            }
            return v1 + v2;
        }
    }
}
```