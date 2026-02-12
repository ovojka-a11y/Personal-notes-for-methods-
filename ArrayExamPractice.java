public class ArrayExamPractice {

    public static void main(String[] args) {
        
        // STEP 1: Make the Box
        // Create an array size 3 and fill it immediately.
        int[] scores = { 50, 60, 70 };
        
        System.out.println("--- Before Update ---");
        
        // STEP 2: Show the Data
        // Call the "Printer" method to see what we have.
        printArray(scores); 

        // STEP 3: Change the Data (The Trap!)
        // I pass the array to the "Modifier" method.
        // Rule: This permanently changes the ORIGINAL memory.
        applyCurve(scores, 5); 

        System.out.println("\n--- After Update ---");
        
        // STEP 4: Prove it Changed
        // The numbers are now 55, 65, 75 forever.
        printArray(scores); 
    }

    // --- METHOD A: The Printer ---
    // Goal: Read only. 
    public static void printArray(int[] arr) {
        // Loop Rule: Start at 0, stop BEFORE length.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // --- METHOD B: The Modifier ---
    // Goal: Write/Change data.
    // Concept: We have the "Address" of the array, so we edit the real thing.
    public static void applyCurve(int[] arr, int bonus) {
        for (int i = 0; i < arr.length; i++) {
            // Update the specific slot in memory
            arr[i] = arr[i] + bonus;
        }
    }
}