package com.pbo;

import java.util.Scanner;

/*
 * #Author
 * Name  : Agung Sepruloh
 * Class : IF-11K
 * NIM   : 10118902
 *
 */

public class Cakep {

    // Text Color
    private static final String RED_TEXT    = "\u001B[31m";
    private static final String GREEN_TEXT  = "\u001B[32m";
    private static final String YELLOW_TEXT = "\u001B[33m";
    private static final String BLUE_TEXT   = "\u001B[34m";
    private static final String PURPLE_TEXT = "\u001B[35m";
    private static final String LIGHT_BLUE_TEXT = "\u001B[36m";
    private static final String WHITE_TEXT  = "\u001B[37m";
    private static final String DEFAULT  = "\u001B[0m";

    public static void checkResult(String answer) {
        if (answer.equals("YOI")) {
            System.out.println(String.format("\n%sCakep Bener. %sGood Job!", RED_TEXT, PURPLE_TEXT));
        } else {
            System.out.println(String.format("\n%sTetep cakep sih. \n%sSing penting paham konsep nya yee."
                    .concat("\n%sKeep the code works dude!"), RED_TEXT, LIGHT_BLUE_TEXT, DEFAULT));
        }
    }

    public static void main(String[] args) {
        System.out.println(String.format("%sKamu %sngerjain sendiri %slatihan 17 sampe %slatihan 30 ini? ",
                RED_TEXT, GREEN_TEXT, YELLOW_TEXT, BLUE_TEXT));
        System.out.print(String.format("Jawab %s(Yoi/Enggak): ", RED_TEXT));
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next().toUpperCase();
        checkResult(answer);
    }
}
