package edu.guilford;
import java.util.Scanner;
import java.util.Random;

public class userquestions {
    
       //set password attributes
       
       private String favcolor;
       private String favpet;
       private String favfood;
       private String favday;
       private String spassword;
       private String favnum;
        StringBuilder password = new StringBuilder();
        
public String getPassword() {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your favorite color?");
    favcolor = input.nextLine();
    System.out.println("What is your favorite pet?");
    favpet = input.nextLine();
    System.out.println("What is your favorite food?");
    favfood = input.nextLine();
    System.out.println("What is your favorite day of the week?");
    favday = input.nextLine();
    //favorite number
    System.out.println("What is your favorite number?");
    String favnum = input.nextLine();
    spassword = this.scrambler(favcolor, favpet, favfood, favday, favnum);

   
    return spassword;
}

public String scrambler (String color, String pet, String food, String day, String Num) {
    String spasssord = "";
     String colorkey = color.substring(0, 2);
     String petkey = pet.substring(0,2);
        String foodkey = food.substring(0,2);
        String daykey = day.substring(0,2);
        String numkey = Num.substring(0,2);
        spasssord = colorkey + petkey + foodkey + daykey + numkey;
    
        return spasssord;

        
        }
    }