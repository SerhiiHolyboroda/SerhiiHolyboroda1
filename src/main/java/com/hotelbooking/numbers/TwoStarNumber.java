package com.hotelbooking.numbers;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class TwoStarNumber {

    public  ArrayList<String>  getRoomParams() {

        ArrayList<String> number =  new ArrayList <>();
        String Stars = "2";
        number.add(Stars);
        int roomSize = ThreadLocalRandom.current().nextInt(10, 15 + 1);
        number.add(Integer.toString(roomSize));
        int maxNumberOfGuest = ThreadLocalRandom.current().nextInt(1, 1 + 1);
        number.add(Integer.toString(maxNumberOfGuest));
        boolean showerInRoom = (Math.random() < 0.5);
        number.add(Boolean.toString(showerInRoom));
        boolean withChildrens = false;
        number.add(Boolean.toString(withChildrens));
        boolean minibar = (Math.random() < 0.5);
        number.add(Boolean.toString(minibar));
        return number;
    }
}
