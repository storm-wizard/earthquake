package leetcode;

class BullsAndCows {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;

        int[] cntS = new int[10];
        int[] cntG = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                cntS[secret.charAt(i) - '0']++;
                cntG[guess.charAt(i) - '0']++;
            }
        }

        for (int i = 0; i < 10; i++) {
            cows += Math.min(cntS[i], cntG[i]);
        }

        return bulls + "A" + cows + "B"; 
    }    
}
