package com.csc;

public class TriangleNumberCalculator {
  // Returns nth triangular number
  public int value(int n){
    if(n == 0){
      return 0; // last case where n = 0
    }

    return n + value(n - 1);
  }

  // Adds nth and mth triangular numbers
  public int add(int n, int m){
    return value(n) + value(m);
  }

  // Subtracts nth and mth triangular numbers
  public int subtract(int n, int m){
    return value(n) - value(m);
  }
}
