package hw.sem4.task2;

import java.util.Random;

public class DoubleCube {
    private final Random rand = new Random();

    private int throwCube() {
        return rand.nextInt(6) + 1;
    }

    @Override
    public String toString() {
        return String.format("Your result: first = %d; second = %d", throwCube(), throwCube());
    }
}
