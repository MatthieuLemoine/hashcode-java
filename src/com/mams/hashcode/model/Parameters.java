package com.mams.hashcode.model;

import java.util.HashSet;
import java.util.Set;

public class Parameters {
    public static int R = 0;
    public static int C = 0;
    public static int A = 0;
    public static int L = 0;
    public static int V = 0;
    public static int B = 0;
    public static int T = 0;
    public static int Rs = -1;
    public static int Cs = -1;
    public static int kBorder = 1000;
    public static int kNeighbour = 34;
    public static int kReachedCells = 20;
    public static int kExtendedReachCells = 5;
    public static int dBorderMax = 5;
    public static int extendedV = 0;
    public static Set<String> targetCells = new HashSet<>();

    public static String print() {
        return "Parameters{\n" +
                "R : " + R + "\n" +
                "C : " + C + "\n" +
                "A : " + A + "\n" +
                "L : " + L + "\n" +
                "V : " + V + "\n" +
                "B : " + B + "\n" +
                "T : " + T + "\n" +
                "Rs : " + Rs + "\n" +
                "Cs : " + Cs + "\n" +
                "}";
    }
}
