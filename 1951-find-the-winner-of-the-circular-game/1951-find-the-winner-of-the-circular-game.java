class Solution {
  public int findTheWinner(int n, int k) {
    // Converts back to 1-indexed.
    return f(n, k) + 1;
  }
  private int f(int n, int k) {
    if (n == 1)
      return 0;
    return (f(n - 1, k) + k) % n;
  }
}
