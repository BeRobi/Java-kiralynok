package kiralynok;

public class TablatKirajzol {

    public static void main(String[] args) {

        // Tábla osztálypéldány létrehozása és megjelenítése
        // new Tabla('#').Megjelenit();
        Tábla tábla = new Tábla('#');
        tábla.Elhelyez(8);
        tábla.Megjelenit();
        System.out.println("Van királynõ az oszlopban? " + tábla.ÜresOszlop(3));
        System.out.println("Van királynõ a sorban? " + tábla.ÜresSor(2));
        System.out.println("9. feladat: Üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: " + tábla.ÜresOszlopokSzáma());
        System.out.println("Sorok:" + tábla.ÜresSorokSzáma());

    }
}
