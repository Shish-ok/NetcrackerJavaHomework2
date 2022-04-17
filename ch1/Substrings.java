package comm.netcracker.homework2.ch1;

import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        getAllSubstring(in.nextLine());
    }
    static void getAllSubstring(String str) {
        StringBuilder nonemptyStr = new StringBuilder();
        // Отчищаем от пробелов
        for(String string : str.split(" ")) {
            nonemptyStr.append(string);
        }
        // Перебираем подстроки
        for(int i = 1; i <= nonemptyStr.length(); ++i) {
            for(int j = 0; j <= nonemptyStr.length() - i; ++j) {
                System.out.println(nonemptyStr.substring(j, j + i));
            }
        }
    }
}