package Buero;

public class MainApp {
    public static void main(String[] args) {
        Buero buero = new Buero();
        buero.hintenAnstellen(new Person("Hans"));
        buero.hintenAnstellen(new Person("Peter"));
        buero.hintenAnstellen(new Person("Klaus"));
        buero.hintenAnstellen(new Person("Gabi"));
        buero.hintenAnstellen(new Person("Karin"));
        buero.hintenAnstellen(new Person("Karl"));

        buero.ausgabe();
        System.out.println("----");

        buero.einlassen();

        buero.ausgabe();
        System.out.println("----");

        buero.einlassen();

        buero.ausgabe();
        System.out.println("----");

        buero.einlassen();
        buero.einlassen();

        buero.ausgabe();
        System.out.println("----");

        buero.sprechstundeBeenden();

        buero.ausgabe();

    }
}
