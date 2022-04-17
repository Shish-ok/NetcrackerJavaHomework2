package comm.netcracker.homework2.ch2;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.Arrays;

public class CSVRead {
    public static void main(String[] args) throws Exception {
        CSVReader reader = new CSVReader(new FileReader("cities.csv"));
        String[] row;
        while ((row = reader.readNext()) != null) {
            System.out.println(Arrays.toString(row));
        }
    }
}
