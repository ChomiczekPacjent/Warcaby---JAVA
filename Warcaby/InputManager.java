package Checkers;

import java.util.Scanner;

public class InputManager {

    int inputOriginX, inputOriginY;
    int inputDestinationX, inputDestinationY;

    Scanner sc;

    InputManager(){
        sc = new Scanner(System.in);
    }

    public void WaitInput(){

        System.out.print("Enter piece to move - row: ");
        inputOriginX= sc.nextInt();

        System.out.print("Enter piece to move - column: ");
        inputOriginY = sc.nextInt();

        System.out.print("Enter where to move - row: ");
        inputDestinationX= sc.nextInt();

        System.out.print("Enter where to move - column: ");
        inputDestinationY = sc.nextInt();
    }
}