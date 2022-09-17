/********************************************
 * Aaron Oropeza
 * COMPSCI 251 Lab 01
 * 9/17/2022
 *******************************************/

import java.util.Scanner;

public class SMouseDriver
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        SMouse mighty = new SMouse();
        SMouse mickey = new SMouse();
        System.out.println();

        // Store age per Mouse individually
        // Mighty Mouse
        System.out.print("What's Mighty Mouse age?: ");
        int MightAge = stdIn.nextInt();
        for (int i = 0; i < MightAge; i++) {
            mighty.grow(); // grow mouse based on age
        }
        mighty.display(); // print mouse weight and age

        // Mickey mouse
        System.out.print("What's Mickey Mouse age?: ");
        int mickeyAge = stdIn.nextInt();
        for (int i = 0; i < mickeyAge; i++) {
            mickey.grow();
        }
        mickey.display();


        stdIn.close();
    }// End Main
}// End Class
