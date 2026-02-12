public class LectureSammury {

    // --- MAIN METHOD: The "Boss" ---
    // This controls the flow of the entire program.
    public static void main(String[] args) {
        
        // 1. Calling a VOID method
        // Just performs an action (prints text).
        printHeader(); 

        // Data we want to process
        String studentName = "Alex";
        int examScore = 75;
        int homeworkScore = 15;

        // 2. Calling a RETURN method
        // We pass arguments (75, 15) and catch the result in 'finalGrade'.
        int finalGrade = calculateTotal(examScore, homeworkScore);

        // 3. Using the result from the method
        System.out.println("Student: " + studentName);
        System.out.println("Final Grade: " + finalGrade);

        // 4. Checking if passed (using another method)
        checkPass(finalGrade);
    }

    // --- METHOD 1: VOID (Action Only) ---
    // Concepts: Void return type, No parameters.
    public static void printHeader() {
        System.out.println("==============================");
        System.out.println("   STUDENT GRADING SYSTEM     ");
        System.out.println("==============================");
    }

    // --- METHOD 2: RETURN (Calculation) ---
    // Concepts: Return type (int), Multiple parameters, Local variables.
    public static int calculateTotal(int exam, int homework) {
        int total = exam + homework; // Logic happens here
        return total;                // Sends '90' back to main
    }

    // --- METHOD 3: VOID with LOGIC ---
    // Concepts: Parameters, If/Else logic inside a method.
    public static void checkPass(int grade) {
        if (grade >= 50) {
            System.out.println("Status: PASSED ✅");
        } else {
            System.out.println("Status: FAILED ❌");
        }
    }
}