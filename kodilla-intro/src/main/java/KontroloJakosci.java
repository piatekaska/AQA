public class KontroloJakosci {

    public static void DobrePudelka(){

        for (int numerPudelka = 1; numerPudelka <=10; numerPudelka ++){

            if(numerPudelka %3 == 0 && numerPudelka >7){
                break;
            }
            if (numerPudelka % 3 == 0){
                continue;
            }
            System.out.println("Poprawne pudelka" + numerPudelka);
        }
    }

    public static void main(String[] args) {
        DobrePudelka();
    }
}
