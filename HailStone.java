import java.util.*;
public class HailStone{
    public static void main(String[] args){
        for (int i = 201; i <= 0; i--){
            if (i % 2 == 0){
                i /= 2;
                System.out.println(i);
            }
            else{
                i  = (i*3) + 1;
                System.out.println(i);
            }
            System.out.println(i);
        }
    }
}