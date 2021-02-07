package com.hotelbooking.hotel;

import com.hotelbooking.numbers.*;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Hotel {

    FiveStarNumber fiveStars = new FiveStarNumber();
    FourStarNumber fourStars = new FourStarNumber();
    ThreeStarNumber threeStars = new ThreeStarNumber();
    TwoStarNumber twoStars = new TwoStarNumber();
    OneStarNumber oneStar = new OneStarNumber();

    public int getN(int n) {
        int num = ThreadLocalRandom.current().nextInt(1, n);
        return num;
    }

    public ArrayList<ArrayList> getAllRooms() {
        ArrayList<ArrayList> allRooms = new ArrayList<>();
        int i = 0;

        while (i < getN(5)) {
            allRooms.add(oneStar.getRoomParams());
            i++;
        }

        while (i < getN(5)) {
            allRooms.add(twoStars.getRoomParams());
            i++;
        }
        while (i < getN(5)) {
            allRooms.add(threeStars.getRoomParams());
            i++;
        }
        while (i < getN(5)) {
            allRooms.add(fourStars.getRoomParams());
            i++;
        }
        while (i < getN(5)) {
            allRooms.add(fiveStars.getRoomParams());
            i++;
        }


        return allRooms;
    }

    public int seeAllRooms() {
        ArrayList<ArrayList> allRooms = getAllRooms();
        int numberOfRooms = (int) allRooms.stream().count();
        return numberOfRooms;

    }

    public void seeAllStars(int s) {
        ArrayList<ArrayList> allRooms = getAllRooms();

//        allRooms.forEach(

//          (int) allRooms.get(0).stream().count() == 1){
//             ss
//        }
//
//        );
//    }
    }
}
