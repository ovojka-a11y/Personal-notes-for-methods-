import java.util.Scanner;

public class CinemaBooking {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // STEP 1: Create a 3x3 Matrix
        // 'O' = Open, 'X' = Taken
        char[][] seats = {
            {'O', 'O', 'O'},
            {'O', 'O', 'O'},
            {'O', 'O', 'O'}
        };

        System.out.println("--- CINEMA SYSTEM ---");

        // STEP 2: Main Loop
        while (true) {
            printSeats(seats); // Show map

            System.out.println("Book a seat? (1=Yes, 0=Exit)");
            int action = scan.nextInt();
            if (action == 0) break; // Exit game

            // STEP 3: Ask for Row/Col
            // We ask for 0-2 (Indexes)
            System.out.print("Enter Row (0-2): ");
            int r = scan.nextInt();
            System.out.print("Enter Col (0-2): ");
            int c = scan.nextInt();

            // STEP 4: Logic Check
            if (seats[r][c] == 'O') {
                seats[r][c] = 'X'; // Mark as taken
                System.out.println("Success! Seat booked.");
            } else {
                System.out.println("Sorry! That seat is taken.");
            }
        }
    }

    // --- METHOD: Print 2D Array ---
    public static void printSeats(char[][] matrix) {
        System.out.println("\n SCREEN ");
        System.out.println("========");
        
        // Outer Loop = Rows
        for (int i = 0; i < matrix.length; i++) {
            // Inner Loop = Columns
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after every row
        }
        System.out.println();
    }
}