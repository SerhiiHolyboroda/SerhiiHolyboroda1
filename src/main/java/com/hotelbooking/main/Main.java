package com.hotelbooking.main;

import com.hotelbooking.hotel.Hotel;
import com.hotelbooking.staff.Porter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Hotel hotel = new Hotel();
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));


        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        System.out.println("Please, input your name");
         String Name = reader.readLine();
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Hello + " + Name + "and Welcome to our Hotel Program.");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Porter.doJob(Name);
        System.out.println("Please select one of the options.");
        System.out.println("A: Display All Rooms.");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("E: Display by Room Type.");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("V: Display by Amount Of Guests.");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("D: Display by Room Size.");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("F: Find room from customer name.");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("S: Store program data in to file.");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("L: Load program data from file.");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("O: View rooms Ordered alphabetically by name.");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        String Selection = reader.readLine();
        Selection = Selection.toUpperCase();
        switch (Selection) {
            case "A":

                System.out.println("We have" +  hotel.seeAllRooms() + " free numbers");


            case "E":
//                System.out.println("Input number of stars from in format of *");
//                String Stars = reader.readLine();
//                if( Stars == "*")   hotel.seeAllStars(1) ;
//                if( Stars == "**")   hotel.seeAllStars(2) ;
//                if( Stars == "***")   hotel.seeAllStars(3) ;
//                if( Stars == "****")   hotel.seeAllStars(4) ;
//                if( Stars == "*****")   hotel.seeAllStars(5) ;
            case "V":


            case "D":


            case "F":

            case "S":

            case "L":

            case "O":

            default:
                System.out.println("Invalid Selection");
                break;
        }
    }
}
