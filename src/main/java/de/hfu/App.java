package de.hfu;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        boolean programmTurnOffSwitch =true;
        Scanner s = new Scanner(System.in);
        while(programmTurnOffSwitch){
            System.out.println("Text eingeben oder x eingeben um abbrechen:");
            String inputOfConsole = s.nextLine();
            if(inputOfConsole.equals("x")||inputOfConsole.equals("X")){
                programmTurnOffSwitch = false;
                break;
            }
            System.out.println(inputOfConsole.toUpperCase());
        }


        s.close();
        System.out.println("Ending...");
    }
}
