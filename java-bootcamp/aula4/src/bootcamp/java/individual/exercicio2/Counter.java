package bootcamp.java.individual.exercicio2;

public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int initialValue) {
        this.value = initialValue;
    }

    public void increment() {
        this.value++;
    }

    public void incrementBy(int value) {
        this.value += value;
    }

    public void decrement() {
        this.value--;
    }

    public void decrementBy(int value) {
        this.value -= value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
