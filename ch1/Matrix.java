package comm.netcracker.homework2.ch1;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        ArrayList<Integer> columns = new ArrayList<>();
        int rows = 0, curRow, curNum;
        boolean flag = true;
        System.out.println("Введите матрицу:");
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        for (String num : str) {
            curNum = Integer.parseInt(num);
            rows += curNum;
            columns.add(curNum);
        }
        int leftDiagonal = columns.get(0), rightDiagonal = columns.get(columns.size() - 1), stepDiagonal = 1;
        str = in.nextLine().split(" ");
        while(!(str[0].equals(""))) {
            curRow = 0;
            for (int i = 0; i < str.length; ++i) {
                curNum = Integer.parseInt(str[i]);
                curRow += curNum;
                columns.set(i, columns.get(i) + curNum);
            }
            if (curRow != rows) {
                flag = false;
                break;
            }
            leftDiagonal += Integer.parseInt(str[stepDiagonal]);
            rightDiagonal += Integer.parseInt(str[str.length - stepDiagonal - 1]);
            ++stepDiagonal;
            str = in.nextLine().split(" ");
        }
        if (leftDiagonal != rightDiagonal || rightDiagonal != rows) {
            flag = false;
        }
        for (int i = 0; i < columns.size(); ++i) {
            if (!flag || !columns.get(i).equals(rows)) {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("YES!");
        }
        else {
            System.out.println("NO!");
        }
    }
}