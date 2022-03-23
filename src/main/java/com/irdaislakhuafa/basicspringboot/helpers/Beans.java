package com.irdaislakhuafa.basicspringboot.helpers;

import java.util.Random;
import java.util.Scanner;

public class Beans {
    private static final Random random = new Random();
    private static Scanner scan = new Scanner(System.in);
    private static String whoAmI = System.getProperty("user.name");

    public static Random getRandom() {
        return random;
    }

    public static Scanner getScanner() {
        return scan;
    }

    public static String whoAmI() {
        return whoAmI;
    }
}
