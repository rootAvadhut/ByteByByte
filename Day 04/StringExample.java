public class StringExample {
    public static void main(String[] args) {
        // Using StringBuffer
        StringBuffer sbuf = new StringBuffer("Hello");
        sbuf.append(" World!"); // Modifying string efficiently
        System.out.println("StringBuffer: " + sbuf);
        
        // Using StringBuilder
        StringBuilder sbuild = new StringBuilder("Java");
        sbuild.append(" Programming"); // Faster modification
        System.out.println("StringBuilder: " + sbuild);
    }
}