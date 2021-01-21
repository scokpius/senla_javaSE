package eu.selna.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rainbow rainbow = new Rainbow();
        Scanner scanner = new Scanner(System.in);
        String lineStringScan = scanner.nextLine();
        String[] masColors = lineStringScan.trim().split(" ");
        for (String masColor : masColors) {
            rainbow.printColor(masColor);
        }
    }
}
