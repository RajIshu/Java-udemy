/*
Problem Description:

Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.

The parameter bigCount represents the count of big flour bags (5 kilos each).

The parameter smallCount represents the count of small flour bags (1 kilo each).

The parameter goal represents the goal amount of kilos of flour needed to assemble a package.

Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. The method should return true if it is possible to make a package with goal kilos of flour.

If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.

If any of the parameters are negative, return false.


EXAMPLE INPUT/OUTPUT:

* canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.

* canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.

* canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.

* canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.

* canPack (-3, 2, 12); should return false since bigCount is negative.


NOTE: The method canPack should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.
*/


public class FlourPack {

    public static void main(String[] args) {
        System.out.println("1. " + canPack( 1, 0, 4)); // false
        System.out.println("2. " + canPack(1, 0, 5)); // true
        System.out.println("3. " + canPack(0, 5, 4)); // true
        System.out.println("4. " + canPack(2, 2, 11));    // true
        System.out.println("5. " + canPack(-3, 2, 12));   // false
        System.out.println("6. " + canPack(1, 0, 6));   // false
        System.out.println("7. " + canPack(5, 3, 24));   // false
        System.out.println("8. " + canPack(4, 18, 19));   // true
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0 ){
            return false;
        }

        if((bigCount * 5 > goal) && smallCount == 0){
            return false;
        }

        int countBig = 0, countSmall = 0;

        int copyGoal = goal;
        while(goal > 0){
            if(5 <= goal && bigCount > 0){
                countBig++;
                bigCount--;
                goal -= 5;
            }
            else {
                for (int i = 1; i <= goal && smallCount > 0; i++){
                    countSmall++;
                    smallCount--;
                    goal--;
                }
            }
            if((bigCount == 0 && smallCount == 0) || ((bigCount * 5 > goal) && smallCount == 0)){
                break;
            }
        }

        return (countBig * 5) + countSmall == copyGoal;
    }
}
