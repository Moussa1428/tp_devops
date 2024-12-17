package com.moussadev;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Donner un nombre :");
        Scanner scanner = new Scanner(System.in);
        int nm = scanner.nextInt();
        Factorielle factorielle = new Factorielle();
        System.out.println(factorielle.fact(nm));
    }
}