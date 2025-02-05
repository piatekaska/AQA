public class LiczbaDoZgadniecia {


        public static void zadanie12() {
            int liczbaDoZgadniecia = (int) (Math.random() * 50) + 1; // Losujemy liczbę od 1 do 50
            int proba = 0;

            while (proba < 5) {
                int liczba = (int) (Math.random() * 50) + 1; // Symulacja różnych zgadywań

                System.out.println("Zgaduję: " + liczba);

                if (liczba < liczbaDoZgadniecia) {
                    System.out.println("Za mało!");
                } else if (liczba > liczbaDoZgadniecia) {
                    System.out.println("Za dużo!");
                } else {
                    System.out.println("🎉 Gratulacje! Odgadłeś liczbę!");
                    return;
                }

                proba++;
            }

            // To wykonuje się tylko, jeśli po 5 próbach nie uda się zgadnąć
            System.out.println("❌ Nie udało się, poprawna liczba to: " + liczbaDoZgadniecia);
        }

        public static void main(String[] args) {
            zadanie12();
        }
    }


