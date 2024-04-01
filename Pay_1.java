/**
 * Student name: Masike Rasenyalo
 * Student number: ST10452404
 */
package pay_1;

import java.util.Scanner;

public class Pay_1 {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        double hours;
        double rate;
        double pay = 0;
        
        System.out.print("How many hours did you work? ");
        hours = keyboard.nextDouble();
        System.out.print("How much do you get paid per hour? ");
        rate = keyboard.nextDouble();
        
        if (hours <= 40) {
            
            pay = hours * pay ;
            
        } else {
            
            pay = hours * rate * pay;
        }
        System.out.print("You earned $" + pay);
    }
    
}
