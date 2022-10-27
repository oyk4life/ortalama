import java.util.Scanner;

public class ortalama {
        public static void main(String[] args) {
            //variablen erstellen
            int mathe;
            int physik;
            int chemie;

            //scanner classe definiert
            Scanner inp = new Scanner(System.in);

            //wir brauchen werte des benutzer
            System.out.print("Schreiben Sie Ihre Mathe Note:");
            mathe = inp.nextInt();

            System.out.print("Schreiben Sie Ihre Physik Note:");
            physik = inp.nextInt();

            System.out.print("Schreiben Sie Ihre Chemie Note:");
            chemie = inp.nextInt();

            int toplam = (mathe + physik + chemie);
            double note = (toplam / 3);
            System.out.println("Ihre Durchschnittsnote: " + note);
            {

            }
         }
        }




