public class Petle {

    //Pobierz od użytkownika liczbę N i oblicz sumę liczb od 1 do N.

    public static void sumaLiczba(int N) {

        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i;
        }
        System.out.println("Suma liczb wynosi" + " " + suma);
    }

    //Program losuje liczbę z zakresu 1-100. Użytkownik zgaduje liczbę,
    // a program informuje, czy podana wartość
    // jest za duża, za mała czy poprawna. Powtarzaj, aż użytkownik zgadnie.

    public static void losowanieLiczb(int zgadnietaliczba) {

        int wylosowanaliczba = 56;

        while (zgadnietaliczba != wylosowanaliczba) {
            if (zgadnietaliczba < wylosowanaliczba) {
                System.out.println("Sprobuj ponownie");
                zgadnietaliczba++;
            } else if (zgadnietaliczba > wylosowanaliczba) {
                System.out.println("To tez pudlo");
                zgadnietaliczba--;
            }
        }

        System.out.println("trafiles");


    }

    public static void main(String[] args) {
        sumaLiczba(200);
        losowanieLiczb(88);
    }
}
