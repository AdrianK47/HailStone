import java.util.*;
public class HailStone{
    public static void main(String[] args){
        for (int i = 0; i < 200; i++){
            
    }

    public static boolean isHailstoneNum(int s){
        while (s == 0){
            if (s != 1){
                return false;
                break;
            }
            if (s % 2 == 0){
                s /= 2;
                System.out.println(s); 
            }
            else{
                s = (s*3) + 1;
                System.out.println(s);
            }
        }
        return true;
    }
}