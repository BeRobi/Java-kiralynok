package kiralynok;

import java.util.Random;

public class Tábla {

    private char[][] T;
    private char ÜresCella;

    // Konstruktor
    public Tábla(char üresCella) {
        T = new char[8][8];
        ÜresCella = üresCella;

        // T mátrix inicializálása ÜresCella értékével
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                T[i][j] = ÜresCella;
            }
        }
    }

    public void Elhelyez(int N) {
        Random random = new Random();
        int kiralynokDb = 0;

        while (kiralynokDb < N) {
            int sor = random.nextInt(8);
            int oszlop = random.nextInt(8);

            if (T[sor][oszlop] == ÜresCella) {
                T[sor][oszlop] = 'K';
                kiralynokDb++;

            }
        }
    }
    
    public void Megjelenit() {
        // Tábla megjelenítése
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j] + " ");
            }
           System.out.println();
        }
        System.out.println();
    }

    public boolean ÜresOszlop(int oszlop) {
        for (int i = 0; i < T.length; i++) {
            if (T[i][oszlop - 1] == 'K') {
                return true;
            }
        }
        return false;
    }

    public boolean ÜresSor(int sor) {
        for (int i = 0; i < T[sor].length; i++) {
            if (T[sor - 1][i] == 'K') {
                return true;
            }
        }
        return false;
    }

    // További metódusok és mûveletek...
    // Getter és setter metódusok a privát mezõkhöz
    public char[][] getT() {
        return T;
    }

    public int ÜresOszlopokSzáma() {
        int uresOszlopDb = 0;

        for (int oszlop = 0; oszlop < T.length; oszlop++) {
            boolean uresOszlop = true;
            for (int sor = 0; sor < T.length; sor++) {
                if (T[sor][oszlop] == 'K') {
                    uresOszlop = false;
                    break;
                }
            }
            if (uresOszlop) {
                uresOszlopDb++;
            }
        }
        return uresOszlopDb;
    }

    public int ÜresSorokSzáma() {
        int uresSorDb = 0;

        for (int sor = 0; sor < T.length; sor++) {
            boolean uresSor = true;
            for (int oszlop = 0; oszlop < T.length; oszlop++) {
                if (T[sor][oszlop] == 'K') {
                    uresSor = false;
                    break;
                }
            }
            if (uresSor) {
                uresSorDb++;
            }
        }
        return uresSorDb;
    }

    public void setT(char[][] t) {
        T = t;
    }

    public char getÜresCella() {
        return ÜresCella;
    }

    public void setÜresCella(char üresCella) {
        ÜresCella = üresCella;
    }
}
