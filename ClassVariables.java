public class ClassVariables {
  
  // 1. CLASS VARIABLE (The "Global" X)
  // This belongs to the whole class. 
  // Any method can see it, UNLESS they have their own 'x'.
  static int x = 99; 
  
  public static void main (String[] args) {
    // 2. LOCAL VARIABLE (The "Main" X)
    // This 'x' only exists inside 'main'.
    // It HIDES the class variable (99).
    int x = 1; 
    
    System.out.println("Main x: " + x); // Prints 1 (uses local)
    
    // We jump to function1
    function1(); 
    
    // We come back. 'main' still uses its own 'x'. 
    // It doesn't care what function1 did.
    System.out.println("Main x: " + x); // Still prints 1
    
    // We jump to function2
    function2(); 
    
    // We come back. 'main' STILL uses its own 'x'.
    // Even though function2 changed the global 'x', 'main' ignores it.
    System.out.println("Main x: " + x); // Still prints 1
  }
  
  public static void function1() {
    // 3. LOCAL VARIABLE (The "Function1" X)
    // This creates a NEW 'x' just for this method.
    // It starts at 0. It has no connection to Main's x or the Class x.
    int x = 0; 
    System.out.println("Function1 x: " + x); // Prints 0
  }
  
  public static void function2() {
    // 4. NO LOCAL VARIABLE
    // This method does NOT have `int x = ...` inside it.
    // Therefore, it looks UP and finds the Class Variable (99).
    
    System.out.println("Function2 x: " + x); // Prints 99
    
    x++; // This updates the CLASS VARIABLE to 100
    
    System.out.println("Function2 x: " + x); // Prints 100
  }
}