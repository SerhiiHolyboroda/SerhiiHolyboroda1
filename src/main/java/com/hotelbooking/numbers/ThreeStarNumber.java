package com.hotelbooking.numbers;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ThreeStarNumber {

    public  ArrayList<String>  getRoomParams() {

        ArrayList<String> number =  new ArrayList <>();
        String Stars = "3";
        number.add(Stars);
        int roomSize = ThreadLocalRandom.current().nextInt(10, 20 + 1);
        number.add(Integer.toString(roomSize));
        int maxNumberOfGuest = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        number.add(Integer.toString(maxNumberOfGuest));
        boolean showerInRoom = (Math.random() < 0.5);
        number.add(Boolean.toString(showerInRoom));
        boolean withChildrens = true;
        number.add(Boolean.toString(withChildrens));
        boolean minibar = true;
        number.add(Boolean.toString(minibar));
        return number;
    }
}
