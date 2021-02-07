package com.homework1.main;




import com.homework1.enums.WeekDays;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        String day = reader.readLine();
//task1

//      System.out.println(WeekDays.valueOf(day.toUpperCase()).getDay());

        System.out.println(WeekDays.next(WeekDays.valueOf(day.toUpperCase()).ordinal()));

//task2

        String name = reader.readLine();

//  String str = "Ivan Ivanov";

        System.out.println(name.matches("(([A-Z][a-z]+)\\s[A-Z][a-z]+)"));
    }
}