public class PassArray {
    
  public static void main(String[] args) {
      
    // STEP 1: Create the Data
    int[] array = {1, 2, 3, 4, 5};
    String output = "";

    // STEP 2: Modify the WHOLE Array
    // We pass 'array' (the reference/address).
    // The method goes to that address and multiplies everything by 2.
    modifyArray(array); 

    // RESULT: The array is now {2, 4, 6, 8, 10}.
    // The changes survive because we passed the Reference.

    // STEP 3: Try to Modify ONE Element
    // We pass 'array[3]' (which is currently 8).
    // Since it's an 'int', Java makes a COPY of 8 and sends it.
    output += "\nBefore: " + array[3]; // Prints 8
    
    modifyElement(array[3]); 
    
    output += "\nAfter: " + array[3]; // STILL Prints 8!
    // RESULT: The original number is NOT changed. 
    // The method only changed the copy.

    System.out.println(output);
  }

  // --- METHOD A: Reference (Arrays) ---
  // Takes an array. 
  // Changes here AFFECT the original array in main.
  public static void modifyArray(int[] array) {
     for (int i = 0; i < array.length; i++)
        array[i] *= 2; // Directly updates memory
  }

  // --- METHOD B: Value (Primitives) ---
  // Takes a single int.
  // Changes here are LOST when the method finishes.
  public static void modifyElement(int element) {
     element *= 2; // Updates local variable 'element' only
  }
}