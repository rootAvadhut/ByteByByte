public class CapacityTest {
        /*
         * Note: Initial capacity was 10. After appending 10 characters, capacity becomes
         * (10 * 2) + 2 = 22. When more characters are added, capacity expands again to
         * (22 * 2) + 2 = 46.
         */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(10); // Initial capacity of 10
        System.out.println("Initial capacity: " + sb.capacity());
        sb.append("HelloWorld!");
        System.out.println(sb);
        System.out.println("After adding 10 chars: " + sb.capacity()); // Capacity: 22
        sb.append("Java is Awesome");
        System.out.println("After exceeding capacity: " + sb.capacity()); // Expands to 46
        System.out.println(sb);

    }
}