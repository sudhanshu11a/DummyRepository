/**
 * 
 */
package testing.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author sudhanshusharma
 *
 */
public class Solution {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            List<Integer> values = new ArrayList<Integer>();
            int n = 1;//scanner.nextInt();
            for(int i= 0 ; i<n ; i++){
                int a = 2;//scanner.nextInt();
                int b = 3;//scanner.nextInt();
                values.add(a&b);
            }
            for(int value : values)
            System.out.println(value);
        }
    }

}
