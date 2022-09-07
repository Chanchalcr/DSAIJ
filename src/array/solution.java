package array;

import java.util.HashMap;

class solution {
    public String bestHand(int[] ranks, char[] suits) {
        int flag = 0;
        for(int i=0; i<4; i++) {
            if(suits[i] != suits[i+1]) {
                flag = 1;
                break;
            }
        }
        if(flag == 0) {
            return "Flush";
        }
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<5; i++) {
            map.put(ranks[i], map.getOrDefault(ranks[i],0)+1);
        }
        int maxFreq = 0;
        for(int key: map.keySet()) {
            Integer freq  = map.get(key);
            maxFreq= Math.max(maxFreq, freq);
        }
        if(maxFreq >= 3) {
            return "Three of a Kind";
        } else if(maxFreq == 2) {
            return "Pair";
        } else {
            return "High Card";
        }
    }
}