package com.vincent.poker.entity;

public class Poker {
        private String rank;
        private String suit;

        public Poker(){

        }

        public Poker(String rank, String suit){
            this.rank = rank;
            this.suit = suit;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getSuit() {
            return suit;
        }

        public void setSuit(String suit) {
            this.suit = suit;
        }

        @Override
        public String toString(){
            return  suit + rank ;
        }

}
