package comm.netcracker.homework2.ch3.ex4_5;

public class Main {
    public static void main(String[] args) {
        IntSequence sequence1 = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (sequence1.hasNext()){
            System.out.print(sequence1.next());
        }
        System.out.println();
        IntSequence sequence2 = IntSequence.constant(1, 3);
        while (sequence2.hasNext()){
            System.out.print(sequence2.next());
        }
    }
}