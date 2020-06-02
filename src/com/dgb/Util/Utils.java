package com.dgb.Util;

import java.util.Scanner;

public class Utils {
    static Scanner scanner=new Scanner(System.in);
    public static int inputInteger(String introduction){
        do{
            try {
                System.out.print(introduction);
                String option = scanner.nextLine();
                return Integer.parseInt(option);
            }catch (Exception e){
                System.out.println("Something went wrong, the string could not be converted to int.");
            }
        }while (true);
    }
}
