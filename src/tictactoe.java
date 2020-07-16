import java.util.Scanner;


public class tictactoe {

    public static char[][] gameBoard = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
    };
    public static char[][] boardDirections = {
            {'1', '|', '2', '|', '3'},
            {'-', '+', '-', '+', '-'},
            {'4', '|', '5', '|', '6'},
            {'-', '+', '-', '+', '-'},
            {'7', '|', '8', '|', '9'}
    };
    public static boolean isPlayer1Turn = true;

    public static void main(String[] args) {


        Scanner scnr = new Scanner(System.in);

        printGameDirections(boardDirections);

        String playerPrompt = scnr.nextLine().toLowerCase();
        if (playerPrompt.equals("y")) {
            printGameBoard(gameBoard);
        }

    }

    public static void printGameDirections(char[][] boardDirections) {
        for (char[] row : boardDirections) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println("\nWelcome to Tic Tac Toe." +
                "\nThe rules are simple." +
                "\nPlayer 1 will start first as X." +
                "\nPlayer 2 will play after as O." +
                "\nEnter a number 1-9 on the board above to mark " +
                "the spot where you wish to place your mark." +
                "\nGood Luck!\n");
        System.out.print("Press Y to begin the game: ");

    }

    public static void printGameBoard(char[][] gameBoard) {
        String turnInfo = getTurn(isPlayer1Turn);
        System.out.println("Turn: " + turnInfo);
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }

        while (checkForGameOver(gameBoard)==false) {
            Scanner scnr = new Scanner(System.in);
            System.out.print("Enter 1-9 to mark a space: ");
            int playerMark = scnr.nextInt();
            checkIfMarked(playerMark);
        };

    }

    public static String getTurn(boolean isPlayer1Turn) {
        return isPlayer1Turn ? "Player 1 - X" : "Player 2 - O";
    }

    public static boolean checkIfMarked(int playerMark) {
        switch (playerMark) {
            case 1:
                if (gameBoard[0][0] == (' ')) {
                    if (isPlayer1Turn == true) {
                        gameBoard[0][0] = 'X';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    } else {
                        gameBoard[0][0] = 'O';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    }
                } else {
                    System.out.println("Spot is already marked. Try a different spot!");
                    printGameBoard(gameBoard);
                    return true;
                }
            case 2:
                if (gameBoard[0][2] == (' ')) {
                    if (isPlayer1Turn == true) {
                        gameBoard[0][2] = 'X';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    } else {
                        gameBoard[0][2] = 'O';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    }
                } else {
                    System.out.println("Spot is already marked. Try a different spot!");
                    printGameBoard(gameBoard);
                    return true;
                }
            case 3:
                if (gameBoard[0][4] == (' ')) {
                    if (isPlayer1Turn == true) {
                        gameBoard[0][4] = 'X';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    } else {
                        gameBoard[0][4] = 'O';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    }
                } else {
                    System.out.println("Spot is already marked. Try a different spot!");
                    printGameBoard(gameBoard);
                    return true;
                }
            case 4:
                if (gameBoard[2][0] == (' ')) {
                    if (isPlayer1Turn == true) {
                        gameBoard[2][0] = 'X';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    } else {
                        gameBoard[2][0] = 'O';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    }
                } else {
                    System.out.println("Spot is already marked. Try a different spot!");
                    printGameBoard(gameBoard);
                    return true;
                }
            case 5:
                if (gameBoard[2][2] == (' ')) {
                    if (isPlayer1Turn == true) {
                        gameBoard[2][2] = 'X';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    } else {
                        gameBoard[2][2] = 'O';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    }
                } else {
                    System.out.println("Spot is already marked. Try a different spot!");
                    printGameBoard(gameBoard);
                    return true;
                }
            case 6:
                if (gameBoard[2][4] == (' ')) {
                    if (isPlayer1Turn == true) {
                        gameBoard[2][4] = 'X';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    } else {
                        gameBoard[2][4] = 'O';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    }
                } else {
                    System.out.println("Spot is already marked. Try a different spot!");
                    printGameBoard(gameBoard);
                    return true;
                }
            case 7:
                if (gameBoard[4][0] == (' ')) {
                    if (isPlayer1Turn == true) {
                        gameBoard[4][0] = 'X';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    } else {
                        gameBoard[4][0] = 'O';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    }
                } else {
                    System.out.println("Spot is already marked. Try a different spot!");
                    printGameBoard(gameBoard);
                    return true;
                }
            case 8:
                if (gameBoard[4][2] == (' ')) {
                    if (isPlayer1Turn == true) {
                        gameBoard[4][2] = 'X';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    } else {
                        gameBoard[4][2] = 'O';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    }
                } else {
                    System.out.println("Spot is already marked. Try a different spot!");
                    printGameBoard(gameBoard);
                    return true;
                }
            case 9:
                if (gameBoard[4][4] == (' ')) {
                    if (isPlayer1Turn == true) {
                        gameBoard[4][4] = 'X';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    } else {
                        gameBoard[4][4] = 'O';
                        isPlayer1Turn = !isPlayer1Turn;
                        printGameBoard(gameBoard);
                        return false;
                    }
                } else {
                    System.out.println("Spot is already marked. Try a different spot!");
                    printGameBoard(gameBoard);
                    return true;
                }
            default:
                System.out.println("Please pick a number within the range of 1-9!");
                printGameBoard(gameBoard);
                return true;

        }
    }

    public static boolean checkForGameOver(char[][] gameBoard) {
        if (gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X'){
            System.out.println("Game Over. Player 1 wins!");
            return true;
        } else if (gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X'){
            System.out.println("Game Over. Player 1 wins!");
            return true;
        } else if (gameBoard[4][0] == 'X' && gameBoard[4][2] == 'X' && gameBoard[4][4] == 'X'){
            System.out.println("Game Over. Player 1 wins!");
            return true;
        } else if (gameBoard[0][0] == 'X' && gameBoard[2][0] == 'X' && gameBoard[4][0] == 'X'){
            System.out.println("Game Over. Player 1 wins!");
            return true;
        } else if (gameBoard[0][2] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][2] == 'X'){
            System.out.println("Game Over. Player 1 wins!");
            return true;
        } else if (gameBoard[0][4] == 'X' && gameBoard[2][4] == 'X' && gameBoard[4][4] == 'X'){
            System.out.println("Game Over. Player 1 wins!");
            return true;
        } else if (gameBoard[0][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][4] == 'X'){
            System.out.println("Game Over. Player 1 wins!");
            return true;
        } else if (gameBoard[0][4] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][0] == 'X'){
            System.out.println("Game Over. Player 1 wins!");
            return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O'){
            System.out.println("Game Over. Player 2 wins!");
            return true;
        } else if (gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O'){
            System.out.println("Game Over. Player 2 wins!");
            return true;
        } else if (gameBoard[4][0] == 'O' && gameBoard[4][2] == 'O' && gameBoard[4][4] == 'O'){
            System.out.println("Game Over. Player 2 wins!");
            return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[2][0] == 'O' && gameBoard[4][0] == 'O'){
            System.out.println("Game Over. Player 2 wins!");
            return true;
        } else if (gameBoard[0][2] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][2] == 'O'){
            System.out.println("Game Over. Player 2 wins!");
            return true;
        } else if (gameBoard[0][4] == 'O' && gameBoard[2][4] == 'O' && gameBoard[4][4] == 'O'){
            System.out.println("Game Over. Player 2 wins!");
            return true;
        } else if (gameBoard[0][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][4] == 'O'){
            System.out.println("Game Over. Player 2 wins!");
            return true;
        } else if (gameBoard[0][4] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][0] == 'O'){
            System.out.println("Game Over. Player 2 wins!");
            return true;
        } else if (gameBoard[0][0] != ' ' && gameBoard[0][2] != ' ' && gameBoard[0][4] != ' '
                && gameBoard[2][0] != ' ' && gameBoard[2][2] != ' ' && gameBoard[2][4] != ' '
                && gameBoard[4][0] != ' ' && gameBoard[4][2] != ' ' && gameBoard[4][4] != ' ') {
            System.out.println("Game Over. Cat's game!");
            return true;
        } else {
            return false;
        }
    }

}
