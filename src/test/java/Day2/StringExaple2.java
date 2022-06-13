package Day2;

public class StringExaple2 {
    public static void main(String[] args) {

        String name = "Arvind_123123_#$%^&*(";
 //                       0      1     2
        System.out.println(name.charAt(2));
        System.out.println(name.split("_")[0]);
        System.out.println(name.split("_")[1]);
        System.out.println(name.split("_")[2]);

        System.out.println(name.substring(0,10));
        System.out.println(name.substring(0));

    }
}
