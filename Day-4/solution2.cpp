class Solution {
public:
    bool isPalindrome(int x) {
      if (x < 0) {
        return false;
    }
    int original = x;
    long reversed_num = 0; // Use long to handle potential overflow
    while (x > 0) {
        int digit = x % 10;
        reversed_num = reversed_num * 10 + digit;
        x = x / 10;
    }
    return original == reversed_num;
  }  
};