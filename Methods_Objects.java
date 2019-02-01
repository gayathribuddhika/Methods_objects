
package methods_objects;

import java.util.Scanner;
public class Methods_Objects {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SubMethodsObjects subObject= new SubMethodsObjects();
        System.out.println("Enter your first girlfrend's name here:");
        String temp = input.nextLine();
        subObject.setname(temp);
        subObject.saying();
    }
    
}
