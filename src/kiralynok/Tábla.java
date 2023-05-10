package kiralynok;

import java.util.Random;

public class T�bla {

    private char[][] T;
    private char �resCella;

    // Konstruktor
    public T�bla(char �resCella) {
        T = new char[8][8];
        �resCella = �resCella;

        // T m�trix inicializ�l�sa �resCella �rt�k�vel
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                T[i][j] = �resCella;
            }
        }
    }

    public void Elhelyez(int N) {
        Random random = new Random();
        int kiralynokDb = 0;

        while (kiralynokDb < N) {
            int sor = random.nextInt(8);
            int oszlop = random.nextInt(8);

            if (T[sor][oszlop] == �resCella) {
                T[sor][oszlop] = 'K';
                kiralynokDb++;

            }
        }
    }
    
    public void Megjelenit() {
        // T�bla megjelen�t�se
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j] + " ");
            }
           System.out.println();
        }
        System.out.println();
    }

    public boolean �resOszlop(int oszlop) {
        for (int i = 0; i < T.length; i++) {
            if (T[i][oszlop - 1] == 'K') {
                return true;
            }
        }
        return false;
    }

    public boolean �resSor(int sor) {
        for (int i = 0; i < T[sor].length; i++) {
            if (T[sor - 1][i] == 'K') {
                return true;
            }
        }
        return false;
    }

    // Tov�bbi met�dusok �s m�veletek...
    // Getter �s setter met�dusok a priv�t mez�kh�z
    public char[][] getT() {
        return T;
    }

    public int �resOszlopokSz�ma() {
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

    public int �resSorokSz�ma() {
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

    public char get�resCella() {
        return �resCella;
    }

    public void set�resCella(char �resCella) {
        �resCella = �resCella;
    }
}
