import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        user(10, 28);
        user(49, -29);
        user(50,-500);
        user(20,-22);
        user(40,300);
        user(1,-10);
        user(1,0);
        int randomAge = generateRandomAge();
        user(randomAge,20);
    }

    public static void user(int age, int temperature) {
        String result = userAge(age, temperature);
        System.out.println( "Age: " +  age + "  Temperature: "+ temperature  + result);
    }

    public static int generateRandomAge(){
        Random random =new Random();
        return random.nextInt(100);
    }
    public static String userAge(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 45 && temperature > -10 && temperature <25) ||
                (age <= 20 && temperature >= 0 && temperature <= 28)
        ) {
            return " Go to park";
        }
        else {
            return "  Оставайтесь дома";}
    }
}