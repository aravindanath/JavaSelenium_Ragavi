package Day2;

public class StringExaple1 {
    public static void main(String[] args) {

        String name = "Arvind";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace("i","!"));
        System.out.println(name.isEmpty());
        System.out.println(name.equals("ARVIND"));
        System.out.println(name.equalsIgnoreCase("ARVIND"));
        System.out.println(name.contains("ind"));
        System.out.println(name.startsWith("Arv"));
        System.out.println(name.endsWith("ind"));
    }
}
