package lotto;

public class Lotto {
    public static final int LOTTO_PRICE = 1000;

    public int payment(int balance, int quantity) {
        return balance - (LOTTO_PRICE * quantity);
    }
}
