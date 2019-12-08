/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tictactoe game = new Tictactoe();
        game.initializeBoard();
        String player = "X";
        do {
            System.out.println(game.printBoard());
            System.out.println(player+"'s turn");
            System.out.println("Enter coordinates for rows: ");
            int row = input.nextInt();
            System.out.println("Enter coordinates for column: ");
            int col = input.nextInt();
            game.setPlay(row, col, player);
            if (game.isGameOver()) {
                System.out.println(game.printBoard() + "\n" + player + " wins!");
                break;
            }
            if (player == "X") {
                player = "O";
            } else {
                player = "X";
            }

        } while (true);

    }

}
