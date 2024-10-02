import java.util.*;
public class RandomWalk {
    double forward = 3.5;
    double backward = 3.5;
    int num = 0;
    public static void main(String[] args){
        for (int i = 0; i < 51; i++){
            double steps = Math.random();
            getNumOfSteps(steps);
        }
    }
    public static int getNumOfSteps(double s){
        double forward = 3.5;
        double backward = 3.5;
        int num = 0;
        while (forward >= 0 || backward >= 0){
            if (s == 0){
                backward -= 1;
                num += 1;
            }
            else {
                num += 1;
                forward -= 1;
        }
        return num;
        
    }
}
}
