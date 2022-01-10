package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
    public static void main(String args[])
            throws java.io.IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a:");
        double a = in.nextDouble();
        double P = 4 * a;
        System.out.println("Периметр квадрата:" + P);
    }
        }