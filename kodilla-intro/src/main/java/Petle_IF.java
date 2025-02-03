
public class Petle_IF {

    //Wypisz liczby od 1 do 20, ale tylko te podzielne przez 3
    public static void Zadanie1(){
        for(int i = 1; i<=20; i++){
            if(i %3 == 0){
                System.out.println("Liczba podzielna przez 3" + " " + i );
            }
        }
    }

    //Symulacja logowania – użytkownik ma 3 próby
    // Cel:
    //Użytkownik ma 3 próby na wpisanie poprawnego hasła.
    //Jeśli wpisze złe hasło, program wyświetli komunikat "❌ Niepoprawne hasło!Pozostało prób: X".
    //Po 3 nieudanych próbach program wyświetli "⛔ Konto zablokowane!" i zakończy działanie.
    //Jeśli hasło jest poprawne, program wyświetli "✅ Zalogowano!" i zatrzyma pętlę.

    public static void Zadanie2(String PoprawneHaslo){

        int proby =0;
        String WpisaneHaslo;
         while (proby<3) {
             if (proby < 2) {
                 WpisaneHaslo = "zle haslo";
             } else {
                 WpisaneHaslo = "Test123";
             }
             System.out.println("Podane haslo to:" + " " + WpisaneHaslo);

             if(WpisaneHaslo.equals(PoprawneHaslo)){
                 System.out.println("Zalogowano");
                 return;
             }
             else{
                 proby++;
                 if(proby<3){
                     System.out.println("Sprobuj ponownie" + (3- proby));
                 }
                 else{
                     System.out.println("Konto zablokowane");
                 }

             }
         }

    }
    //Wypisz liczby od 1 do 50, ale:

    //Jeśli liczba jest podzielna przez 3, wypisz "Fizz".
    //Jeśli liczba jest podzielna przez 5, wypisz "Buzz".
    //Jeśli liczba jest podzielna przez 3 i 5, wypisz "FizzBuzz".
    //W przeciwnym wypadku, wypisz samą liczbę.

    public static void Zadanie3(){

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // 🛠️ Najpierw sprawdzamy "FizzBuzz"
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // Następnie "Fizz"
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // Na końcu "Buzz"
                System.out.println("Buzz");
            } else {
                System.out.println("Liczba: " + i);
            }
        }


        }


        // Znalezienie największej liczby
        //💡 Cel:
        //Masz 10 liczb. Twoim zadaniem jest znaleźć największą z nich.
        //🚀 Czego się nauczysz?
        //Używania pętli for do przetwarzania wielu liczb
        //Porównywania wartości za pomocą if
        //Aktualizowania wartości zmiennej

    public static void Zadanie4(){
        int maxLiczba = 4;
        for(int i= 1; i<=10;i++) {
            int liczba = i * 2;
            if(liczba>maxLiczba){
                maxLiczba = liczba;
            }
            System.out.println("Maksymalna liczba to" + maxLiczba);
        }
    }


    public static void main(String[] args) {
        Zadanie1();
        Zadanie2("Test123");
        Zadanie3();
        Zadanie4();

    }
}

