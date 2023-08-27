import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("welcome to Treasure Island!");
        System.out.println("Your mission is to find the treasure.");
        boolean isGameOver = false;
        System.out.println("You are at a crossroad, where do you want to go? right or left? ");
        String crossRoad = reader.nextLine().toLowerCase();
        if (crossRoad.equals("left")) {
            System.out.println("You've come to a lake. There is an island in the middle of the lake. Type \"wait\" to wait for a boat. Type \"swim\" to swim across. ");
            String atTheLake = reader.nextLine().toLowerCase();
            if (atTheLake.equals("wait")) {
                System.out.println("You arrive at the island unharmed. There is a house with 3 doors. One red, one yellow and one blue. Which colour do you choose?");
                String theIsland = reader.nextLine().toLowerCase();
                if (theIsland.equals("red")) {
                    System.out.println("it is a room full of fire. GameOver");
                    isGameOver = true;
                }else if (theIsland.equals("yellow")) {
                    System.out.println("You found the treasure!! You Win!");
                    isGameOver = true;
                } else if (theIsland.equals("blue")) {
                    System.out.println("you entered a room full of beasts! GameOver");
                    isGameOver = true;
                }else {
                    System.out.println("the door does not exist!");
                }
            } else if (atTheLake.equals("swim")) {
                System.out.println("You got attacked by an angry Trout. GameOver!");
                isGameOver = true;
            }else {
                System.out.println("wrong input!");
            }
        } else if (crossRoad.equals("right")) {
            System.out.println("You fell in a hole! GameOver!");
            isGameOver = true;
        }else {
            System.out.println("wrong input!");
            isGameOver = true;
        }
    }
}