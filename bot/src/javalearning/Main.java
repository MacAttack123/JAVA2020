package javalearning;

public class Main {

        public static void main(String[] args) {
            // Loop practice with 99 Bottles of beer song

            int beerNum = 99;
            String word = "bottles";
            String words = " of beer on the wall.";
            String none = "No more bottles of beer on the wall.";

            while (beerNum>0){

                if (beerNum ==1){

                    word = "bottle";
                }

                System.out.println(beerNum + " " + word + words);
                System.out.println(beerNum + " " + word + " of beer.");
                System.out.println("Take one down.");
                System.out.println("Pass it around.");
                beerNum = beerNum -1;

                if (beerNum > 0) {

                    System.out.println(beerNum + " " + word + words);
                }
                else {
                    System.out.println(none);


                }
            }
        }

    }
