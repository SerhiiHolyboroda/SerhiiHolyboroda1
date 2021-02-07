package com.hotelbooking.numbers;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class OneStarNumber {

    public  ArrayList<String>  getRoomParams() {

        ArrayList<String> number =  new ArrayList <>();
        String Stars = "1";
        number.add(Stars);
        int roomSize = ThreadLocalRandom.current().nextInt(5, 10 + 1);
        number.add(Integer.toString(roomSize));
        int maxNumberOfGuest = ThreadLocalRandom.current().nextInt(1, 1 + 1);
        number.add(Integer.toString(maxNumberOfGuest));
        boolean showerInRoom = false;
        number.add(Boolean.toString(showerInRoom));
        boolean withChildrens = false;
        number.add(Boolean.toString(withChildrens));
        boolean minibar = false;
        number.add(Boolean.toString(minibar));
        return number;
    }

}
