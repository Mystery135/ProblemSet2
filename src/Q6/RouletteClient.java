package Q6;

import java.util.Scanner;

public class RouletteClient {
    public static void main(String[] args) {
        boolean inputReceived = false;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a pocket number: ");
            if (scanner.hasNextInt()){
                int input = scanner.nextInt();
                try {
                    RoulettePocket roulettePocket = new RoulettePocket(input);
                    System.out.println("You landed on: " + roulettePocket.getPocketColor() + "!");
                    inputReceived = true;
                }catch (IllegalArgumentException e){
                    System.out.println("Enter a number between 0 & 36 inclusive!");
                }
            }else{
                System.out.println("Please input a valid integer between 0 & 36 inclusive!");
                scanner.nextLine();
            }
        }while (!inputReceived);
    }




}
