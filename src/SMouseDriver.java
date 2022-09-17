import java.util.Scanner;

public class SMouseDriver
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        SMouse mighty = new SMouse();
        SMouse mickey = new SMouse();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.print("What age is Mighty mouse: ");
        int mightAge = stdIn.nextInt();
        for (int i = 0; i < mightAge; i++) {
            mighty.grow();
        }
        System.out.print("Mighty Mouse age: " + mightAge);
        System.out.println("Mighty Mouse weight: " + );
        stdIn.close();
    }
}

