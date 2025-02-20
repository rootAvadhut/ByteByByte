public class StringDemo{
public static void main(String[] args) {
    String str1 = new String("Java Programming");
    String str2 = "Java Learn";
    String str3 = "Java Learn";
    System.out.println(str1);
    System.out.println(str2);
    System.out.println("str2 HashCode: "+str2.hashCode());
    System.out.println("str3 HashCode: "+str3.hashCode());
    if(str2==str3) {System.out.println("pointing to same memory location: "+true);}
}
}