/*
 * March 24
 * Outputs windspeed corresponding to a value on the Saffir-Sympson Hurricane skill
 */

package hurricane;
import java.util.Scanner;
/**
 *
 * @author eljam3239
 */
public class Hurricane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Welcome. Please input a value from 1-5 on the Saffir-Sympson hurricane scale, which will tell you the corresponding wind speeds. >");
        x = input.nextInt();
        switch (x) {
            case 1: System.out.println("Category 1: 74-95 mph or 64-82 kt or 119-153 km/h"); break;
            case 2: System.out.println("Category 2: 96-110 mph or 83-95 kt or 154-177 km/h"); break;
            case 3: System.out.println("Category 3: 111 -130 mph or 96-113 kt or 178-209 km/h"); break;
            case 4: System.out.println("Category 4: 131-155 mph or 114-135 kt or 210-249 km/h "); break;
            case 5: System.out.println("Category 5: greater than 155 mph or 135 kt or 249 km/h"); break;
            default: System.out.println("I said input a number between 1 and 5 you dummy!"); break;
        }
       }
    }
    
