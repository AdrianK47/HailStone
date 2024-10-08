import java.util.*;
public class HailStone{
    public static void main(String[] args){
        for (int i = 1; i < 201; i++){
            if (isHailstoneNum(i)){
                System.out.println("The number " + i + " is a hailstone number.");
            }
            else{
                System.out.println("The number " + i + " is not a hailstone number");
        }
    }
}

    public static boolean isHailstoneNum(int s){
        boolean response = false;
        int number = s;
        while (!response){
            if (number == 1){
                response = true;
                break;
            }
            else if (number % 2 == 0){
                number = number/2;
            }
            else if (number % 2 == 1)  {
                number = (number*3) + 1;
            }
        }
        return response;
    }
}