package homework.h01;

// base
// https://leetcode.com/problems/palindrome-number/
public class T1 {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        }
        return n * 2;
    }
}

