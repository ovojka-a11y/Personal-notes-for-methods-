// STEP 1: Create the Container
public class ExamPassChecker {

    // STEP 2: Create the Control Center
    public static void main(String[] args) {
        
        // STEP 5: Call the Methods
        printWelcome(); // Calling the void method
        
        // Data to test
        String name = "Chris";
        int myScore = 45;
        
        // Calling the return method and saving the result
        // We send 'myScore' (45) into the method.
        // The method sends back "Failed" or "Passed".
        String result = checkScore(myScore); 
        
        System.out.println("Student: " + name);
        System.out.println("Result: " + result);
    }

    // STEP 3 & 4 (Method A): The "Action" Method
    // It uses 'void' because it just prints text.
    public static void printWelcome() {
        System.out.println("--- Exam Checker App ---");
    }

    // STEP 3 & 4 (Method B): The "Calculation" Method
    // It uses 'String' because it returns text ("Passed" or "Failed").
    // It takes 'int score' as input.
    public static String checkScore(int score) {
        if (score >= 50) {
            return "Passed"; // Sends this back
        } else {
            return "Failed"; // Sends this back
        }
    }
}