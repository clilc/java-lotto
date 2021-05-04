package lotto;

import java.util.*;

public class RandomNumber {
    private static final int LOTTO_NUMBERS_SIZE = 6;
    private static final int LOTTO_MAX_NUMBER = 45;

    public List<Integer> generateRandomNumbers(){
        Random random = new Random();
        Set<Integer> randomNumbers = new HashSet<Integer>();
        while(randomNumbers.size() < LOTTO_NUMBERS_SIZE ){
            randomNumbers.add(random.nextInt(LOTTO_MAX_NUMBER)+1);
        }
        return new ArrayList<>(randomNumbers);
    }
}
