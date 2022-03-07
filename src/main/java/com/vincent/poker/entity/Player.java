package com.vincent.poker.entity;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    List<Poker> handPokers = new ArrayList<Poker>();


    public Player(String name, List<Poker> handPokers) {
        this.name = name;
        this.handPokers = handPokers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Poker> getHandPokers() {
        return handPokers;
    }

    public void setHandPokers(Poker Poker) {
        this.handPokers = handPokers;
    }

    @Override
    public String toString(){
        return  name + handPokers.toString();
    }
}
