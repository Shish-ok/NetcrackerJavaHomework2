package comm.netcracker.homework2.ch1;

import java.util.ArrayList;
import java.util.Comparator;

public class Lottery {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(49);
        for (int i = 0; i < 49; ++i) {
            numbers.add(i + 1);
        }
        getTicket(numbers).forEach(num -> System.out.print(num + " "));
    }

    static ArrayList<Integer> getTicket (ArrayList<Integer> numbers) {
        ArrayList<Integer> ticket = new ArrayList<>(6);
        int randomIndex;
        for (int i = 0; i < 6; ++i) {
            randomIndex = (int) (Math.random() * numbers.size());
            ticket.add(numbers.get(randomIndex));
            numbers.remove(randomIndex);
        }
        ticket.sort(Comparator.naturalOrder());
        return ticket;
    }
}