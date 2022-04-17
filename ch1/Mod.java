package comm.netcracker.homework2.ch1;

import java.util.Scanner;

public class Mod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите угол: ");
        int angel = in.nextInt();
        System.out.println("После использования %: ".concat(Integer.toString(angel % 360)));
        System.out.println("После использования floorMod: " + Math.floorMod(angel, 360));
    }
}