public class IfClass {

    // Sprawdzanie parzystości liczby
    public static void liczbyParzyste() {
        int i = 5; // Stała wartość liczby
        if (i % 2 == 0) {
            System.out.println("Liczba " + i + " jest parzysta");
        } else {
            System.out.println("Liczba " + i + " nie jest parzysta");
        }
    }

    // Sprawdzanie wieku
    public static void agePerson() {
        int i = 9; // Stała wartość wieku
        if (i < 12) {
            System.out.println("You are a child");
        } else if (i >= 12 && i <= 17) {
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are an adult");
        }
    }

    public static void znakLiczby(){
    int x = -9;
    if(x<0){
        System.out.println("To jest liczba ujemna");
    } else if (x==0) {
        System.out.println("To jest zero");
    }
    else {
        System.out.println("To jest liczba dodatnia");
    }

    }

    public static int calculator(){
        int x =10;
        int y = 245;
        //char g = '*';
        int t = x*y;
        return  t;
    }

    // Główna metoda programu
    public static void main(String[] args) {
        // Wywołanie metody sprawdzającej parzystość liczby
        liczbyParzyste();

        // Wywołanie metody sprawdzającej wiek
        agePerson();

        //Wywołanie metody sprawdzającej znak liczby
        znakLiczby();

        //Wywołanie calculator
        int result = calculator();
        System.out.println("Wynik wynosi:" + result);
    }
}
