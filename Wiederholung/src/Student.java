import java.util.Scanner;

public class Student {

    private int matrikelnummer;
    private String name;

    //public void vorlesungBes(vorlesungBes v) {}

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setName(String sn) {
        name = sn;
    }

    public void setMatrikelnummer(int sm) {
        matrikelnummer = sm;
    }

    //public String toString() {return S;}

    public boolean validateMatrNr(int sm) {
        if (sm < 100000 && sm > 0 && sm % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }


    public static class StudierenderTestlauf {

        public static void main(String[] args) {
            Student eins = new Student();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name");
            String nameEingabe = sc.nextLine();
            eins.setName(nameEingabe);
            System.out.println("Change your Matrikelnummer");
            String Eingabe = sc.nextLine();
            int intEingabe = Integer.parseInt(Eingabe);
            while (eins.validateMatrNr(intEingabe) == false) {
                System.out.println("Try again");
                Eingabe = sc.nextLine();
                intEingabe = Integer.parseInt(Eingabe);
            }
            System.out.println("Well done");
        }
    }
}




