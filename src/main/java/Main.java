import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
while (true){
        try {
            System.out.println("Enter the numerator :");
            int numerator = scanner.nextInt();
            System.out.println("Enter the denominator :");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result :" + result);
        } catch( ArithmeticException a){
                System.out.println("Error : Invalid method ' cannot divide by zero ");
            }catch(InputMismatchException p){
                System.out.println("Error : Invalid Input , please Enter whole Numbers only ! thank you ");
                scanner.nextLine();
            }
        }
        }
        }






