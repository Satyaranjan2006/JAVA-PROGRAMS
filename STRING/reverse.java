
package STRING;

public class reverse {
    public static void main(String[] args) {
         String original = "Hello World";
        
        // Pass the string to StringBuilder and call reverse()
        String reversed = new StringBuilder(original).reverse().toString();
        
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}



// package STRING;

// public class reverse {
//     public static void main(String[] args) {
//          String original = "Hello World";
        
//         // Pass the string to StringBuilder and call reverse()
//         String reversed = new StringBuilder(original).reverse().toString();
        
//         System.out.println("Original: " + original);
//         System.out.println("Reversed: " + reversed);
//     }
// }

