import java.util.Scanner;

/**
 * Main
 */
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numTest = sc.nextInt();
        int num     = 1;
    
        while(numTest-- > 0){

            int numSweet = sc.nextInt();
            int numKids  = sc.nextInt();
            int sum      = 0;
            int leftover = 0;
    
            for(int i = 0; i < numSweet; i++){
    
                int numSweetPocket = sc.nextInt();
    
                sum += numSweetPocket;
            }
    
            leftover = sum % numKids;
    
            System.out.println("Case #" + num + ": " + leftover);
            num++;
        }

    }

}
