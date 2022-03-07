package com.vincent.poker;

import com.vincent.poker.entity.Player;
import com.vincent.poker.entity.Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Game {

    public static void main(String[] args) {
        List<Poker> pokeList = new ArrayList<Poker>(52);
        int value;

        List<Player> players = new ArrayList<Player>(4);
        players.add(new Player("Jack",new ArrayList<>()));
        players.add(new Player("Tom",new ArrayList<>()));
        players.add(new Player("Lucy",new ArrayList<>()));
        players.add(new Player("Caty",new ArrayList<>()));


        create(pokeList);

        shuffle(pokeList);

        showPoker(pokeList);

        DealCard(pokeList,players);

        showPlayerPoke(players);



    }

    public static List create(List pokeList){
        String[] rank = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suit={"♠","♥","♣","♦"};

        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                pokeList.add(new Poker(rank[i],suit[j]));
            }
        }
        System.out.println("----poker initialize finish-----");
        showPoker(pokeList);
        return pokeList;
    }

    public static void shuffle(List pokeList){
        System.out.println("----poker shuffle finish-----");
        showPoker(pokeList);
        Collections.shuffle(pokeList);
    }

    //print Poker
    public static void showPoker(List pokers){
        for(int i = 0 ; i < pokers.size() ; i++){
            System.out.print(pokers.get(i) + " ");
            if(i%13==12){
                System.out.println();
            }
        }
    }


    public static void DealCard(List<Poker> pokeList, List<Player> players){
        System.out.println("----Dealing----");
        for (int i = 0; i < pokeList.size(); i++){
            int p = i%players.size();
            players.get(p).getHandPokers().add(pokeList.get(i));
            System.out.println("player " + players.get(p).getName() + " get the poker " + pokeList.get(i));
            p++;
        }
    }

    public static void showPlayerPoke(List players){
        System.out.println("----Deal finish----");
        for (Iterator itr = players.iterator();itr.hasNext();){
            System.out.println(itr.next().toString());
        }

    }

}
