package kiralynok;

public class TablatKirajzol {

    public static void main(String[] args) {

        // T�bla oszt�lyp�ld�ny l�trehoz�sa �s megjelen�t�se
        // new Tabla('#').Megjelenit();
        T�bla t�bla = new T�bla('#');
        t�bla.Elhelyez(8);
        t�bla.Megjelenit();
        System.out.println("Van kir�lyn� az oszlopban? " + t�bla.�resOszlop(3));
        System.out.println("Van kir�lyn� a sorban? " + t�bla.�resSor(2));
        System.out.println("9. feladat: �res oszlopok �s sorok sz�ma:");
        System.out.println("Oszlopok: " + t�bla.�resOszlopokSz�ma());
        System.out.println("Sorok:" + t�bla.�resSorokSz�ma());

    }
}
