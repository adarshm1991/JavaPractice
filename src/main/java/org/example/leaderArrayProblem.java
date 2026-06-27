package org.example;

import java.util.Arrays;

public class leaderArrayProblem {
    public static void main(String[] args) {
        int[] leaderArrayProb = {1,10,15,67,34,12,9,2};
        int len = leaderArrayProb.length;
        int[] currLeader = new int[len];

        currLeader[0] = leaderArrayProb[len - 1];
        int leadCount = 1;

        for ( int i = len -2 ; i >= 0 ; i--) {
            if (currLeader[leadCount -1 ] < leaderArrayProb[i]){
                currLeader[leadCount] = leaderArrayProb[i];
                ++leadCount;
            }
        }
        System.out.println(Arrays.toString(currLeader));
    }
}
