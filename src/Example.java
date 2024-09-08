public class Example {
    public static void main(String[] args) {

        int liczba1 = 2;
        double liczba2 = 5.8;

        String napis = "Dzisiaj świeci słońce.";
        char znak = '#';
        boolean zupa = true;

        int dl = napis.length();

        char inicjal = napis.charAt(5);

        String duze, male;

        duze = napis.toUpperCase();
        male = napis.toLowerCase();

        napis += " zupa ";
        System.out.println("Mój string: " + napis);


    }
}
