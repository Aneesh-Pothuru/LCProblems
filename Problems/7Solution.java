import java.util.*;
class 7Solution {
    public int reverse(int x) {
        long rev = 0;
        while(x != 0){
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }
        rev = rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE ? 0 : rev;
        return (int) rev;
    }
}
