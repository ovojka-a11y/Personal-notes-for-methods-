public class ClassAnalyzer {

    public static void main(String[] args) {
        
        // STEP 1: Data Setup (Parallel Arrays)
        // Index 0 in names matches Index 0 in scores
        String[] students = {"Alex", "Ben", "Chris", "Dana"};
        int[] scores = { 85, 90, 78, 95 };

        // STEP 2: Use Methods for Logic
        printClass(students, scores);
        
        double avg = calculateAverage(scores);
        System.out.println("\nClass Average: " + avg);

        findBestStudent(students, scores);
    }

    // --- METHOD: Display Data ---
    public static void printClass(String[] names, int[] grades) {
        System.out.println("--- GRADE BOOK ---");
        for (int i = 0; i < names.length; i++) {
            // Combine data from both arrays
            System.out.println(names[i] + ": " + grades[i]);
        }
    }

    // --- METHOD: Calculate Average ---
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        // Loop to add everything up
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return (double) sum / arr.length;
    }

    // --- METHOD: Find Max Logic ---
    public static void findBestStudent(String[] names, int[] grades) {
        int maxIndex = 0; // Assume first person is best
        
        // Compare everyone else
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > grades[maxIndex]) {
                maxIndex = i; // Save the INDEX of the new winner
            }
        }
        
        // Print the winner using the saved index
        System.out.println("Top Student: " + names[maxIndex]);
        System.out.println("Score: " + grades[maxIndex]);
    }
}