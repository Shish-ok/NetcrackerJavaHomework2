package comm.netcracker.homework2.ch3.ex4_5;

import java.util.Arrays;

public interface IntSequence {
    int next();
    boolean hasNext();

    static IntSequence of(int ... numbers) {
        return new IntSequence() {
            int[] arrayNumbers = Arrays.copyOf(numbers, numbers.length);
            int pointer = 0;

            @Override
            public boolean hasNext() {
                return pointer < arrayNumbers.length;
            }
            @Override
            public int next() {
                return arrayNumbers[pointer++];
            }
        };
    }

    static IntSequence constant(int i, int limit) {
        return new IntSequence() {
            final int number = i;
            final int length = limit;
            int pointer = 0;
            @Override
            public boolean hasNext() {
                return pointer < limit;
            }
            @Override
            public int next() {
                ++pointer;
                return number;
            }
        };
    }
}