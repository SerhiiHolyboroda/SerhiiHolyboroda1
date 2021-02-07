package com.hotelbooking.numbers;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class FourStarNumber {


    public  ArrayList<String>  getRoomParams() {

        ArrayList<String> number =  new ArrayList <>();
        String Stars = "4";
        number.add(Stars);
        int roomSize = ThreadLocalRandom.current().nextInt(15, 20 + 1);
        number.add(Integer.toString(roomSize));
        int maxNumberOfGuest = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        number.add(Integer.toString(maxNumberOfGuest));
        boolean showerInRoom = true;
        number.add(Boolean.toString(showerInRoom));
        boolean withChildrens = true;
        number.add(Boolean.toString(withChildrens));
        boolean minibar = true;
        number.add(Boolean.toString(minibar));
        return number;
    }
}
