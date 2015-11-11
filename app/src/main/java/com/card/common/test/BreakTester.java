package com.card.common.test;

/**
 * Created by debarghy on 10/8/2015.
 */
public class BreakTester {

    int testBreak() {
        int count = 0;
        for(int i=0;i<10;i++) {
            for(int j=0;j<16;j++) {
                count++;
                if(j ==6)
                    break;
            }
        }
        return count;
    }

    public  static void main(String[] args) {
        System.out.print(new BreakTester().testBreak());
    }
}
