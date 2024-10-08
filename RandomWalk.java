import java.util.*;
public class RandomWalk {
    double forward = 3.5;
    double backward = 3.5;
    int num = 0;
    public static void main(String[] args){
        int totalSteps = 0;
        for (int i = 0; i < 50; i++){
            double steps = Math.random();
            System.out.println(steps);
            int numOfSteps = getNumOfSteps(steps);
            System.out.println(numOfSteps);
            totalSteps += numOfSteps;
            System.out.println(totalSteps);
        }
        int average = totalSteps / 50;
        System.out.println("It took an average of " + average + "steps before taking a step off the bridge.");
    }
    public static int getNumOfSteps(double s){
        double forward = 3.5;
        double backward = 3.5;
        int num = 0;
        while (forward > 0.0 || backward > 0.0){
            if (s < 1 && s > 0){
                backward -= 1.0;
                num += 1;
            }
            else {
                num += 1;
                forward -= 1.0;
            }
            if (forward == 0 || backward == 0){
                break;
            }
        }
        return num;
    }
}
