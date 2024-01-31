# Programmers: Miles  
# Course:  CS212
# Due Date: 2/1/24
# Lab Assignment: In class activity
# Problem Statement:  
# Data In: Hill type, velocity 
# Data Out:  Points, disatnce
# Credits: N/A
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Outputs a statement to the user
        System.out.println("Hello! This program is used to determine a ski jumper's distance and points");
        //Asks which hill they will be using
        System.out.println("Which hill type are you jumping?: ");
        
        String hill_type = scan.next();
        //Declares the variables
        int height = 0;
        double points_per_meter = 0;
        int par = 0;
        //If statement for if the user enters "normal"
        if (hill_type.equals("normal")) {
            //Sets the values
            height = 46;
            points_per_meter = 2;
            par = 90;
        } else {
            //Sets the values
            height = 70;
            points_per_meter = 1.8;
            par = 120;
        }
        //Asks the user for the velocity 
        System.out.println("What is the velocity of the jump: ");
        float velocity = scan.nextFloat();
        //Calculates the distance
        double distance = velocity * Math.sqrt((2 * height) / 9.8);
        //Calculates the total_points
        double total_points = 60 + (distance - par) * (points_per_meter);
        //Outputs the distance 
        System.out.println("This is the distance you went:" + distance);
        //Outputs the total points
        System.out.println("This is your point total:" + total_points);

        if (total_points >= 61) {
            //Outputs a statement depending on the amount of points
            System.out.println("Great job for doing better than par!");
        } else if (total_points < 10) {
            System.out.println("What happened?");
        } else {
            System.out.println("Sorry, you didn't go very far");
        }
    }
}
