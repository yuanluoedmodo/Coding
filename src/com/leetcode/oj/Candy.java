package com.leetcode.oj;

// Reference: https://leetcode.com/discuss/23835/one-pass-constant-space-java-solution

public class Candy {

	public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) return 0;
        int total = 1, prev = 1, countDown = 0;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] >= ratings[i-1]) {
                if (countDown > 0) {
                    total += countDown*(countDown+1)/2; // arithmetic progression
                    if (countDown >= prev) total += countDown - prev + 1;
                    countDown = 0;
                    prev = 1;
                }
                prev = ratings[i] == ratings[i-1] ? 1 : prev+1;
                total += prev;
            } else countDown++;
        }
        if (countDown > 0) { // if we were descending at the end
            total += countDown*(countDown+1)/2;
            if (countDown >= prev) total += countDown - prev + 1;
        }
        return total;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}